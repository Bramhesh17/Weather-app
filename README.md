# 🌤 Weather Search Engine (Spring Boot + Caching)

This project is created as part of the **MetaMorph coding challenge**.

It fetches **real-time weather data** from OpenWeather API and improves performance using **caching (Caffeine)**.

---

## ✅ Features
- Search current weather by city name
- Spring Boot REST API backend
- OpenWeather API integration
- Caching using **Caffeine Cache**
  - **TTL (expiry): 10 minutes**
  - **Max entries: 100**
- Frontend UI using HTML + JavaScript
- Error message shown if city not found

---

## 🛠 Tech Stack
- Java
- Spring Boot
- Spring Web
- Spring Cache
- Caffeine
- HTML, CSS, JavaScript

---

## 🚀 Run Instructions

### 1) Add API Key
Open:
`src/main/resources/application.properties`

Add:
```properties
weather.api.key=YOUR_API_KEY
weather.api.base-url=https://api.openweathermap.org/data/2.5/weather


