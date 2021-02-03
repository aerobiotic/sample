
package org.jxfs.service;

import org.jxfs.events.WeatherEvent;
import org.jxfs.model.WeatherStationObservation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class WeatherMakerController {

	@Autowired
	private WeatherMakerService weatherMakerService;

	@RequestMapping(value = "/weather/{location}")
	public ResponseEntity<WeatherEvent> getLastknownWeatherEvent(@PathVariable("location") String location) {
		log.info("enter getLastknownWeatherEvent");
		return new ResponseEntity<WeatherEvent>(weatherMakerService.getCurrentWeatherEvent(location), HttpStatus.OK);
	}

	@RequestMapping(value = "/weather", method = RequestMethod.POST)
	public ResponseEntity<Object> addObservation(@RequestBody WeatherStationObservation observation) {
		weatherMakerService.recordNewObservation(observation);
		return new ResponseEntity<>("Weather observation was created successfully", HttpStatus.CREATED);
	}

}
