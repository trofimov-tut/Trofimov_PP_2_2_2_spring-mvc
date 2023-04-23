package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.Service;

import java.util.Optional;

@Controller
public class CarController {

    @Autowired
    private Service service;

    @GetMapping("/cars")
    public String carsShow(@RequestParam(value = "count", required = false) Optional<Integer> count, Model model) {
        model.addAttribute("cars", service.carOnRequest(count.orElse(5)));
        return "cars";
    }
}
