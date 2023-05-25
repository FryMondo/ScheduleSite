package com.TaskScheduler.ScheduleSite.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class TaskController {
    @GetMapping("/task")
    public String index(Model model) {
        return "task-main";
    }
}
