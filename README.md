Backend is made using the spring boot framework.
It manages user information like:
* Username
* Email
* LiamCoins
* ID

This contains 3 actually used endpoints for the project.
* Post(/api/users) creates a new user and sends a json file with the user's info
* Put(/api/users/{id}) edits a user using their id
* Get(/api/users) returns all users
