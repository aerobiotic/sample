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
		WeatherEvent weatherEvent = new WeatherEvent(WeatherEvent.WeatherType.THUNDERSTORM,
				WeatherEvent.WeatherSeverity.SEVERE, location);
		return weatherEvent;

	}

}
