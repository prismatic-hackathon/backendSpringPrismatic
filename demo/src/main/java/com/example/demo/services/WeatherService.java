package com.example.demo.services;

import org.springframework.stereotype.Service;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

@Service
public class WeatherService {
    private String LocationWeatherURL =  "http://api.weatherapi.com/v1/current.json?key=";
    private String LocationTimzezoneURL =  "http://api.weatherapi.com/v1/timezone.json?key=";
    private String ForcastURL =  "http://api.weatherapi.com/v1/forecast.json?key=";

    private String apiKEY = "36b2363860ac4636b19202601221807";

    public WeatherService() {
    }

    public String getWeather(String location) throws IOException {
        URL url = new URL(LocationWeatherURL +apiKEY+ " &q="+location+"&aqi=no");
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setRequestMethod("GET");
        con.setRequestProperty("accept", "application/json");
        InputStream responseStream = con.getInputStream();
        return responseStream.toString();
    }

    public String getTimezone(String location) throws IOException {
        URL url = new URL(LocationTimzezoneURL +apiKEY+ " &q="+location+"&aqi=no");
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setRequestMethod("GET");
        con.setRequestProperty("accept", "application/json");
        InputStream responseStream = con.getInputStream();
        return responseStream.toString();
    }

    public String getForcast(String location,int days) throws IOException {
        URL url = new URL(ForcastURL +apiKEY+ " &q="+location+"&days="+days+"&aqi=no&alerts=no");
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setRequestMethod("GET");
        con.setRequestProperty("accept", "application/json");
        InputStream responseStream = con.getInputStream();
        return responseStream.toString();
    }
}
