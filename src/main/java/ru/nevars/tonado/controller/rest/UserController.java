package ru.nevars.tonado.controller.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import ru.nevars.tonado.domain.user.User;
import ru.nevars.tonado.services.UserService;

import java.util.Set;

@RestController
@RequestMapping(value = "/user",
        produces = {MediaType.APPLICATION_JSON_VALUE},
        consumes = {MediaType.TEXT_HTML_VALUE, MediaType.APPLICATION_JSON_VALUE})
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/create", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public User createUser(@RequestBody User newUser) {
        return userService.createUser(newUser);
    }

    @RequestMapping(value = "/find", params = {"username", "password"})
    public User getUser(String username, String password) {
        return userService.getUser(username, password);
    }

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public Set<User> getAllUsers() {
        return userService.getAllUsers();
    }
}
