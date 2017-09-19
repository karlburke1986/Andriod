package com.example.admin.weather;

/**
 * Created by Admin on 05/04/2017.
 */

enum WeatherCondition{
    Cloudy,
    Sunny,
    Rain
}

public class WeatherData {

    String city;
    Double temperature;
    WeatherCondition condition;

    public String getCity() {
        return city;
    }

    public Double getTemperature() {
        return temperature;
    }

    public WeatherCondition getCondition() {
        return condition;
    }

    public WeatherData(String city, Double temperature, WeatherCondition condition) {
        this.city = city;
        this.temperature = temperature;
        this.condition = condition;
    }
}
