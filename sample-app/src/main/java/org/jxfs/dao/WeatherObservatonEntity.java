package org.jxfs.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="TBL_OBSERVATIONS")

public class WeatherObservatonEntity {

    @Id
    @GeneratedValue
    private Long id;
    
    @Column(name="source_name")
    private String sourceName;
    
    @Column(name="wind_speed")
    private float windSpeed;

    @Column(name="direction")
    private String direction;
    
    @Column(name="temperature")
    private float temperature;
    
    @Column(name="temp_units")
    private String tempUnits;
    
    @Column(name="humidity")
    private float humidity;
    
    @Column(name="sky_cover")
    private String skyCover;
    
    @Column(name="pressure")
    private float pressure;
	public WeatherObservatonEntity() {
		
	}

    public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSourceName() {
		return sourceName;
	}

	public void setSourceName(String sourceName) {
		this.sourceName = sourceName;
	}

	public float getWindSpeed() {
		return windSpeed;
	}

	public void setWindSpeed(float windSpeed) {
		this.windSpeed = windSpeed;
	}

	public String getDirection() {
		return direction;
	}

	public void setDirection(String direction) {
		this.direction = direction;
	}

	public float getTemperature() {
		return temperature;
	}

	public void setTemperature(float temperature) {
		this.temperature = temperature;
	}

	public String getTempUnits() {
		return tempUnits;
	}

	public void setTempUnits(String tempUnits) {
		this.tempUnits = tempUnits;
	}

	public float getHumidity() {
		return humidity;
	}

	public void setHumidity(float humidity) {
		this.humidity = humidity;
	}

	public String getSkyCover() {
		return skyCover;
	}

	public void setSkyCover(String skyCover) {
		this.skyCover = skyCover;
	}

	public float getPressure() {
		return pressure;
	}

	public void setPressure(float pressure) {
		this.pressure = pressure;
	}
}