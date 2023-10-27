package com.postman.microservice;
import java.util.List;
import java.util.Optional;
public interface UserService {
    List<User> getAll();
    void deleteUser(long id);
    void addUser(User user);
    void updateUser(long id, User user);
    Optional<User> getUserById(long id);
}
