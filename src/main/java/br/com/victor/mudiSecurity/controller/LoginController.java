package br.com.victor.mudiSecurity.controller;

import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@Controller
public class LoginController {

    @GetMapping
    @RequestMapping("/login")
    public String login() {
        return "login";
    }
}
