package ru.nevars.tonado.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.nevars.tonado.dao.UserRepo;
import ru.nevars.tonado.domain.user.User;
import ru.nevars.tonado.services.UserService;

import javax.transaction.Transactional;
import java.util.LinkedHashSet;
import java.util.Set;

@Service
@Transactional(rollbackOn = {NullPointerException.class, IllegalArgumentException.class})
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepo userRepo;


    @Override
    public Set<User> getAllUsers() {
        Iterable<User> foundedUsers = userRepo.findAll();
        Set<User> users = new LinkedHashSet<>();
        foundedUsers.forEach(users::add);
        return users;
    }

    @Override
    public User getUser(String username, String password) {
        return userRepo.findOneByLoginAndPassword(username, password);
    }

    @Override
    public User getUser(String login) {
        return userRepo.findOneByLoginLike(login);
    }

    @Override
    public User createUser(User user) {
        //user.setPassword(new BCryptPasswordEncoder().encode(user.getPassword()));
        return userRepo.save(user);
    }

    @Override
    public Boolean checkIfExists(User user) {
        return userRepo.findOneByEmailLike(user.getEmail());
    }

    @Override
    public User updateUser(User user) {
        return userRepo.save(user);
    }
}
