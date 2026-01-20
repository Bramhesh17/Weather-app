package com.metamorph.weather.service;

import com.metamorph.weather.dto.WeatherResponse;

public interface WeatherService {
    WeatherResponse getWeatherByCity(String city);
}
