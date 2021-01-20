package org.jxfs.service;

import org.springframework.stereotype.Service;

@Service
public class WeatherMakerService {

	private WeatherEvent weatherEvent;
	
	public WeatherEvent getLastWeatherEvent() {
		return weatherEvent;
	}
}
