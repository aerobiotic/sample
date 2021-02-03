package org.jxfs.model;

import lombok.Data;

public @Data class WeatherStationObservation {
  private String sourceName;
  private float windSpeed;
  private WindDirection direction;
  private float temperature;
  private TempUnits tempUnits;
  private float humidity;
  private SkyCover skyCover;
  private float pressure;
}
