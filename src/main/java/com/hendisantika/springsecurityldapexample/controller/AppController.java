package com.hendisantika.springsecurityldapexample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-security-ldap-example
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2019-04-03
 * Time: 05:59
 */
@Controller
public class AppController {

    @RequestMapping(value = "/login")
    public String login() {
        return "signin";
    }

    @RequestMapping(value = "/home")
    public String home() {
        return "index";
    }

    @RequestMapping(value = "/")
    public String home1() {
        return "index";
    }
}