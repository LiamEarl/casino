package com.hackathon.casino.user;

public class User {
    private Long id;
    private String name;
    private String email;
    private Long liamCoins;

    // Constructors
    public User() {}

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public void setLiamCoins(Long liamCoins) {this.liamCoins = liamCoins; }
    public Long getLiamCoins() {return this.liamCoins; }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
}