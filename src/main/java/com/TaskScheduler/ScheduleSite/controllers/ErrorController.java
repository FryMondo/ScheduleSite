package com.TaskScheduler.ScheduleSite.controllers;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ErrorController implements org.springframework.boot.web.servlet.error.ErrorController {

    @RequestMapping("/error")
    public String handleError(HttpServletRequest request, Model model) {
        // Отримуємо код помилки HTTP з запиту
        int statusCode = (Integer) request.getAttribute(RequestDispatcher.ERROR_STATUS_CODE);

        // Зберігаємо повідомлення про помилку у модель
        model.addAttribute("errorMessage", "Сталася помилка. Код помилки: " + statusCode);

        // Повертаємо сторінку з повідомленням про помилку
        return "error-page";
    }

    public String getErrorPath() {
        return "/error";
    }
}

