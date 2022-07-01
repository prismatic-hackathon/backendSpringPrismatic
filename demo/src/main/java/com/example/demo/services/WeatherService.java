package com.example.demo.services;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WeatherService {

    public WeatherService() {
    }

    public List<WeatherObject> findByLocation(String location) {
//        return WeatherService.findbyLocation(location);
    }

    public List<WeatherObject> getWeatherAll() {
        //
        return null
    }
}
