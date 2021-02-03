package org.jxfs.service;

import java.util.ArrayList;
import java.util.Hashtable;

class WeatherManager {
	private ArrayList all_forcasts = new ArrayList();
	private volatile long lightningStrikeCount = 0;
	public final static String CRITICAL = "Critical";
	public final static String SEVERE = "Severe";
	public final static String MEDIUM = "Medium";
	public final static String LIGHT = "Light";

	public boolean addForcast(Hashtable<String, String> ht ) {
		return true;
	}
}




