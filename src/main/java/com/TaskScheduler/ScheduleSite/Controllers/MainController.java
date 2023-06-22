package com.TaskScheduler.ScheduleSite.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
    @GetMapping("/mainPage")
    public String mainPage(Model model, @RequestParam(required = false) String username) {
        model.addAttribute("username", username);
        return "task-main";
    }
}