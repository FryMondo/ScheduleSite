package com.TaskScheduler.ScheduleSite.Controllers;

import com.TaskScheduler.ScheduleSite.Users.User;
import com.TaskScheduler.ScheduleSite.Users.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import java.util.Optional;

@Controller
public class LoginController {
    private final UserService userService;

    public LoginController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/")
    public String login() {
        return "login";
    }

    @PostMapping("/")
    public String signIn(@RequestParam String username, @RequestParam String password, RedirectAttributes redirectAttributes) {
        Optional<User> user = userService.findByUsername(username);
        if (user.isPresent() && userService.checkPassword(user.get(), password)) {
            redirectAttributes.addAttribute("username", username);
            return "redirect:/mainPage";
        } else {
            redirectAttributes.addFlashAttribute("error", "Invalid username or password");
            return "redirect:/";
        }
    }
}
