package ru.nevars.tonado.controller.admin.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import ru.nevars.tonado.controller.BaseRestController;

@RestController
@RequestMapping(value = "/admin")
public class AdminController extends BaseRestController {

    @RequestMapping(method = RequestMethod.GET)
    public String helloWorld() {
        return "Hello, world";
    }
}
