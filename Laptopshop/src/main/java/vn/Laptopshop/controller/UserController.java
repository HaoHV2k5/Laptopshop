package vn.Laptopshop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ch.qos.logback.core.model.Model;
import vn.Laptopshop.service.UserService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {
    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping("/")
    public String getHomePage(org.springframework.ui.Model model) {
        String test = userService.handleHello();
        model.addAttribute("eric", test);
        model.addAttribute("haone", "hello from model");
        return "hello";
    }
}

// @RestController
// public class UserController {
// private UserService userService;

// public UserController(UserService userService) {
// this.userService = userService;
// }

// @GetMapping("/")

// public String getHomePage() {
// return this.userService.handleHello();
// }
// }
