package com.example.WeatherDashAPP.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.annotation.PostConstruct;

public class WeatherResponse {
    @JsonProperty("name") //maps JSON keys from openweather
    private String city;

    @JsonProperty("main")
    private Main main;

    @JsonProperty("name")
    private Weather[] weather;

    public WeatherResponse() {}

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }


    // Inner classes to match API response structure
    public static class Main {
        public double temp;
    }

    public static class Weather {
        public String main;
        public String description;
    }


}
