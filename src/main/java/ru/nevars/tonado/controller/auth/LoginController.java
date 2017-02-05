package ru.nevars.tonado.controller.auth;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/login")
public class LoginController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String loadLoginPage() {
        return "loginPage";
    }

    @RequestMapping(value = "/main", method = RequestMethod.GET)
    public String loadMainPage() {
        return "mainPage";
    }
}
