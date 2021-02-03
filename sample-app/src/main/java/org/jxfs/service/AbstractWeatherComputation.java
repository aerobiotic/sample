package org.jxfs.service;

import org.jxfs.dao.WeatherObservationRepository;
import org.jxfs.events.WeatherEvent;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class AbstractWeatherComputation {
	
//	@Autowired
//    private WeatherObservationRepository weatherObservationRepository;

	protected WeatherEvent computeLastWeatherEvent(String location) {
		// TODO look up observations in the DB based on location and last N hours. 
		// TODO use AI to determine the type and severity of the weather
		WeatherEvent weatherEvent = WeatherEvent.THUNDERSTORM;
		weatherEvent.setSeverity(WeatherEvent.SEVERE);
		weatherEvent.setLocation(location);
		return weatherEvent;
		
	}

}
