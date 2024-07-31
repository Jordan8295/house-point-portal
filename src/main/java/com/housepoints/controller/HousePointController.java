package com.housepoints.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api")
public class HousePointController {

    @GetMapping("/housepoints")
    public String housepoints(Model model) {
        return "woof";
    }
}
