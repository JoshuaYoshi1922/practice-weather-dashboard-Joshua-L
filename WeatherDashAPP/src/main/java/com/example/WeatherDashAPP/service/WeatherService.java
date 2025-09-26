package com.example.WeatherDashAPP.service;


import com.example.WeatherDashAPP.model.WeatherResponse;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class WeatherService {


    @Value("${openweathermap.api.key}")
        private String apiKey;




    private final RestTemplate restTemplate = new RestTemplate(); //makes HTTP calls

    public WeatherResponse getWeather(String city) {
        String apiUrl = "http://api.openweathermap.org/data/2.5/weather?q={city}&appid={apiKey}&units=metric";
        return restTemplate.getForObject(apiUrl, WeatherResponse.class, city, apiKey);
    }
}
