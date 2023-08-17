package org.pokesplash.cobblemontournaments.config;

import com.google.gson.Gson;
import org.pokesplash.cobblemontournaments.Utils;
import org.pokesplash.cobblemontournaments.types.ScheduledItem;

import java.util.ArrayList;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

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
	 * @param item The ScheduledItem to add.
	 */
	public void addScheduleItem(ScheduledItem item) {
		scheduled_tournaments.add(item);

		Gson gson = Utils.newGson();
		Utils.writeFileAsync("", "schedule.json", gson.toJson(this));

		scheduleTournament(item);
	}

	/**
	 * Method to remove a schedule from the list.
	 * @param item The ScheduleItem to be removed.
	 */
	public void deleteScheduleItem(ScheduledItem item) {
		scheduled_tournaments.remove(item);

		Gson gson = Utils.newGson();
		Utils.writeFileAsync("", "schedule.json", gson.toJson(this));
	}

	/**
	 * Method to schedule a tournament to be executed.
	 * @param item The ScheduleItem that needs to be scheduled to run.
	 */
	public void scheduleTournament(ScheduledItem item) {
		long delay = item.getSystem_time() - System.currentTimeMillis();
		if (delay > 0) {
			ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
			scheduler.schedule(() -> {
				// TODO add run tournament method here.
				System.out.println("TODO add run tournament method to schedule function.");
				deleteScheduleItem(item);
			}, delay, TimeUnit.MILLISECONDS);
		} else {
			deleteScheduleItem(item);
		}
	}
}
