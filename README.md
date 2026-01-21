#Weather Search Engine (Spring Boot + Cache)

- This project was made for the MetaMorph coding challenge.

- It shows current weather details for a city by using the OpenWeather API.
- To reduce repeated API calls and improve speed, I used Caffeine caching.

#Features

1) Search weather by city name

2) Spring Boot REST API

3) OpenWeather API integration

4) Caffeine cache

	a) Cache expiry: 10 minutes

	b) Max cache entries: 100

5) Simple frontend using HTML + JavaScript

6) Shows proper error if city is invalid / not found

#Tech Used

1) Java
2) Spring Boot
3) Spring Web
4) Spring Cache + Caffeine
5) HTML, CSS, JavaScript


#How to Run
Step 1: Add OpenWeather API key

	Go to:
	src/main/resources/application.properties

Add:

	weather.api.key=YOUR_API_KEY
	weather.api.base-url=https://api.openweathermap.org/data/2.5/weather
	
Step 2: Run the project

	Start the Spring Boot application.
	Then open the UI in browser:
	http://localhost:8080/index.html
	