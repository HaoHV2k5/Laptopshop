package vn.Laptopshop;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HelloController {
    @GetMapping("/")
    public String index() {
        return "Hello World  test spring framework devtools";
    }

    @GetMapping("/user")
    public String userPage() {
        return "only user can access this page";
    }

    @GetMapping("/admin")
    public String adminPage() {
        return "only admin can access this page";
    }
}
