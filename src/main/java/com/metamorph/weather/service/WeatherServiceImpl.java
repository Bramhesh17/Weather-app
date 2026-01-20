package com.metamorph.weather.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.metamorph.weather.dto.WeatherResponse;

@Service
public class WeatherServiceImpl implements WeatherService {

    @Value("${weather.api.key}")
    private String apiKey;

    @Value("${weather.api.base-url}")
    private String baseUrl;

    private final RestTemplate restTemplate = new RestTemplate();

    @Override
    @Cacheable(value = "weatherCache", key = "#city.toLowerCase()")
    public WeatherResponse getWeatherByCity(String city) {

        // this print proves caching (first time only)
        System.out.println("🔴 OPENWEATHER API HIT (Not cache): " + city);

        String url = baseUrl + "?q=" + city + "&appid=" + apiKey + "&units=metric";

        Map response = restTemplate.getForObject(url, Map.class);

        Map main = (Map) response.get("main");
        Map wind = (Map) response.get("wind");

        List weatherList = (List) response.get("weather");
        Map weather0 = (Map) weatherList.get(0);

        double temp = Double.parseDouble(main.get("temp").toString());
        double feelsLike = Double.parseDouble(main.get("feels_like").toString());
        int humidity = Integer.parseInt(main.get("humidity").toString());
        double windSpeed = Double.parseDouble(wind.get("speed").toString());
        String description = weather0.get("description").toString();

        return new WeatherResponse(city, temp, feelsLike, humidity, windSpeed, description);
    }
}
