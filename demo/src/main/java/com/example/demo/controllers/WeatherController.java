package com.example.demo.controllers;

import com.RFDSpring.entities.Account;
import com.RFDSpring.services.AccountService;
import com.example.demo.services.WeatherService;
import org.springframework.web.bind.annotation.*;

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
    public List getAccounts(@PathVariable String location){
        return this.weatherService.getWeather(location);
    }

    @GetMapping("/weather")
    public List createAccount() {
        return this.weatherService.getWeatherAll();
    }

}