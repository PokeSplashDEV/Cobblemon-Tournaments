package org.pokesplash.cobblemontournaments.types;

/**
 * Object that holds the schedule for an upcoming tournament.
 */
public class ScheduledItem {
	// The name of the preset the tournament should use.
	private final String preset;
	// The date the tournament will take place.
	private final String date;
	// The time the tournament will take place.
	private final String time;
	// The timestamp in Milliseconds since Unix Epoch that the tournament will take place.
	private final long system_time;

	/**
	 * Constructor to create a new scheduled tournament.
	 */
	public ScheduledItem(String preset, String date, String time, long systemTime) {
		this.preset = preset;
		this.date = date;
		this.time = time;
		system_time = systemTime;
	}

	/**
	 * Getter for the preset.
	 * @return the preset name as a String.
	 */
	public String getPreset() {
		return preset;
	}

	/**
	 * Getter for the date, in human-readable format.
	 * @return the date as a String
	 */
	public String getDate() {
		return date;
	}

	/**
	 * Getter for the time, in human-readable format.
	 * @return the time as a String
	 */
	public String getTime() {
		return time;
	}

	/**
	 * Getter for the timestamp in Milliseconds since Unix Epoch.
	 * @return the timestamp as a long.
	 */
	public long getSystem_time() {
		return system_time;
	}
}
