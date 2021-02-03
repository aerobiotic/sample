package org.jxfs.service;

import org.jxfs.dao.WeatherObservationRepository;
import org.jxfs.dao.WeatherObservatonEntity;
import org.jxfs.events.WeatherEvent;
import org.jxfs.model.WeatherStationObservation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WeatherMakerService extends AbstractWeatherComputation {

	private WeatherEvent weatherEvent;

	@Autowired
	private WeatherObservationRepository weatherObservationRepository;

	public WeatherEvent getCurrentWeatherEvent(String location) {
		weatherEvent = computeLastWeatherEvent(location);
		return weatherEvent;
	}

	public void recordNewObservation(WeatherStationObservation observation) {

		WeatherObservatonEntity weatherObservatonEntity = new WeatherObservatonEntity();
		weatherObservatonEntity.setSourceName(observation.getSourceName());
		weatherObservatonEntity.setDirection(observation.getDirection().name());
		weatherObservatonEntity.setHumidity(observation.getHumidity());
		weatherObservatonEntity.setPressure(observation.getPressure());
		weatherObservatonEntity.setSkyCover(observation.getSkyCover().name());
		weatherObservatonEntity.setTemperature(observation.getTemperature());
		weatherObservatonEntity.setTempUnits(observation.getTempUnits().name());
		weatherObservatonEntity.setWindSpeed(observation.getWindSpeed());
		weatherObservatonEntity = weatherObservationRepository.save(weatherObservatonEntity);

		System.out.println("new weather id=" + weatherObservatonEntity.getId());
	}
}
