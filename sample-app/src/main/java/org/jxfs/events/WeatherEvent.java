package org.jxfs.events;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@ToString
public final class WeatherEvent {
	
	  private WeatherType type;
	  private WeatherSeverity severity;
	  private String location;
	  
	  public enum WeatherType { 
		  HURRICANE, TORNADO, THUNDERSTORM, TSUNAMI, RAIN, SNOW, WIND, COLD, HEAT; 
	  }
	  public enum WeatherSeverity {
		  CRITICAL, SEVERE, MEDIUM,  LIGHT;
	  }
}
