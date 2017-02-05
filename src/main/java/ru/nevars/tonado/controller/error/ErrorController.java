package ru.nevars.tonado.controller.error;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/error")
public class ErrorController {

    @RequestMapping(method = RequestMethod.GET)
    public String errorPage() {
        return "t_error";
    }
}
