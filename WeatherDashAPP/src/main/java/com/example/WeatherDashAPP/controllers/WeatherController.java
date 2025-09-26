package com.example.WeatherDashAPP.controllers;

import com.example.WeatherDashAPP.model.WeatherResponse;
import com.example.WeatherDashAPP.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/weather") // specifies the base URL path for all endpoints
public class WeatherController {

    private final WeatherService weatherService;


    @Autowired
    public WeatherController(WeatherService weatherService) {
        this.weatherService = weatherService;
    }

    @GetMapping("/{city}")
    public WeatherResponse getWeather(@PathVariable String city) {
        return weatherService.getWeather(city);
    } // captures the city name from URL and passes it to the method
}
