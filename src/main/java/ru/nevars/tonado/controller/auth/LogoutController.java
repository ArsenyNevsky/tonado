package ru.nevars.tonado.controller.auth;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/logout")
public class LogoutController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String logout() {
        return "redirect:/loginPage";
    }
}
