package com.TaskScheduler.ScheduleSite.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    @GetMapping("/mainPage")
    public String mainController(Model model) {
        return "task-main";
    }
}