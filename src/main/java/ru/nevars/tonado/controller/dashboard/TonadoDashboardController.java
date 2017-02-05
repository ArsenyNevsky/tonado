package ru.nevars.tonado.controller.dashboard;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/board")
public class TonadoDashboardController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String loadDashboard() {
        return "dashboard";
    }
}
