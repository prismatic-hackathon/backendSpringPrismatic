package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface WeatherRepository extends JpaRepository<Weather, Integer> {
    List getWeather(String location);
}
