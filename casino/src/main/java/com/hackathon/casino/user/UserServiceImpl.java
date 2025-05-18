package com.hackathon.casino.user;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.concurrent.atomic.AtomicLong;

@Service
public class UserServiceImpl implements UserService {

    private final Map<Long, User> userStore = new HashMap<>();
    private final AtomicLong idGenerator = new AtomicLong(1);

    @Override
    public List<User> getAllUsers() {
        return new ArrayList<>(userStore.values());
    }

    @Override
    public User getUserById(Long id) {
        User user = userStore.get(id);
        if (user == null) {
            throw new RuntimeException("User not found with id: " + id);
        }
        return user;
    }

    @Override
    public User createUser(User user) {
        Long id = idGenerator.getAndIncrement();
        user.setId(id);
        user.setLiamCoins((long)200);
        userStore.put(id, user);
        System.out.println("Created new user: " + id + user.getName());
        return user;
    }

    @Override
    public User updateUser(Long id, User updatedUser) {
        User existingUser = getUserById(id); // throws if not found
        existingUser.setName(updatedUser.getName());
        existingUser.setEmail(updatedUser.getEmail());
        existingUser.setLiamCoins(updatedUser.getLiamCoins());
        System.out.println("Updating user: " + id + updatedUser.getName());
        return existingUser;
    }

    @Override
    public void deleteUser(Long id) {
        userStore.remove(id);
    }
}