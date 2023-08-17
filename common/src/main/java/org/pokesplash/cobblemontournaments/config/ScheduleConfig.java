package org.pokesplash.cobblemontournaments.config;

import org.pokesplash.cobblemontournaments.types.ScheduledItem;

import java.util.ArrayList;

/**
 * Class that represents the file where all schedules are stored.
 */
public class ScheduleConfig {
	// A list to hold all scheduled tournaments in.
	private ArrayList<ScheduledItem> scheduled_tournaments;

	/**
	 * Constructor to create a default schedule config.
	 */
	public ScheduleConfig() {
		scheduled_tournaments = new ArrayList<>();
	}

	/**
	 * Getter for all the currently scheduled tournaments.
	 * @return ArrayList of all scheduled tournaments.
	 */
	public ArrayList<ScheduledItem> getScheduledTournaments() {
		return scheduled_tournaments;
	}

	/**
	 * Method to add another schedule to the list.
	 * @param item the ScheduledItem to add.
	 */
	public void addSchedule(ScheduledItem item) {
		scheduled_tournaments.add(item);
	}
}
