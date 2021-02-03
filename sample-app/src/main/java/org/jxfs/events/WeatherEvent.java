package org.jxfs.events;

public enum WeatherEvent {
	HURRICANE, TORNADO, THUNDERSTORM, TSUNAMI, RAIN, SNOW, WIND, COLD, HEAT; 
	  public final static String CRITICAL = "Critical";
	  public final static String SEVERE = "Severe";
	  public final static String MEDIUM = "Medium";
	  public final static String LIGHT = "Light";

	  private String severity;
	  private String location;

	  public void setSeverity(String severity) {
	      this.severity = severity; 
	  }

	  public void setLocation(String location) {
	      this.location = location; 
	  }

	  public String toString() {
	      return super.toString() + ":" + severity + " at " + location; 
	  }
}
