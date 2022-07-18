package com.example.demo.services;

import org.springframework.stereotype.Service;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

@Service
public class WeatherService {
    private String weatherBaseURL =  "http://api.weatherapi.com/v1/current.json?key=";
    private String apiKEY = "36b2363860ac4636b19202601221807";

    public WeatherService() {
    }

    public String getWeather(String location) throws IOException {
        URL url = new URL(weatherBaseURL+apiKEY+ " &q="+location+"&aqi=no");
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setRequestMethod("GET");
        con.setRequestProperty("accept", "application/json");
        InputStream responseStream = con.getInputStream();
        return responseStream.toString();
    }
}
