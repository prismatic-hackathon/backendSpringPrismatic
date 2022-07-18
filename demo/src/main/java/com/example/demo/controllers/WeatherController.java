package com.example.demo.controllers;


import com.example.demo.services.WeatherService;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/api")
public class WeatherController {
    private WeatherService weatherService;
    public WeatherController(WeatherService weatherService) {
        this.weatherService = weatherService;

    }

    @CrossOrigin(origins = "*")
    @GetMapping("/weather/{location}")
    public String getAccounts(@PathVariable String location) throws IOException {
        return this.weatherService.getWeather(location);
    }

}