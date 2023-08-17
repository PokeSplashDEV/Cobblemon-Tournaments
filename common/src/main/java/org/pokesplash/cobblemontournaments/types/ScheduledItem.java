package org.pokesplash.cobblemontournaments.types;

/**
 * Object that holds the schedule for an upcoming tournament.
 */
public class ScheduledItem {
	// The name of the preset the tournament should use.
	private final String preset;
	// The date the tournament will take place.
	private final long system_time;

	/**
	 * Constructor to create a new scheduled tournament.
	 */
	public ScheduledItem(String preset, long systemTime) {
		this.preset = preset;
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
	 * Getter for the timestamp in Milliseconds since Unix Epoch.
	 * @return the timestamp as a long.
	 */
	public long getSystem_time() {
		return system_time;
	}
}

