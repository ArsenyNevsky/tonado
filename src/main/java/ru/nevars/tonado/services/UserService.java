package ru.nevars.tonado.services;

import ru.nevars.tonado.domain.user.User;

import java.util.Set;

public interface UserService {

    Set<User> getAllUsers();

    User getUser(String username, String password);

    User getUser(String login);

    User createUser(User user);

    Boolean checkIfExists(User user);

    User updateUser(User user);
}
