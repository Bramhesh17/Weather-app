package com.metamorph.weather.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.metamorph.weather.dto.WeatherResponse;
import com.metamorph.weather.service.WeatherService;

@RestController
@RequestMapping("/api/weather")
@CrossOrigin(origins = "*")
public class WeatherController {

    private final WeatherService weatherService;

    public WeatherController(WeatherService weatherService) {
        this.weatherService = weatherService;
    }

    @GetMapping
    public ResponseEntity<WeatherResponse> weather(@RequestParam String city) {
        return ResponseEntity.ok(weatherService.getWeatherByCity(city));
    }
}
