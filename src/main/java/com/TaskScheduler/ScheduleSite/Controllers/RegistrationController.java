package com.TaskScheduler.ScheduleSite.Controllers;

import com.TaskScheduler.ScheduleSite.Users.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RegistrationController {
    @GetMapping("/registration")
    public String registrationController(Model model) {
        model.addAttribute("user", new User());
        return "registration";
    }
}
