package org.pokesplash.cobblemontournaments.provider;

import com.google.gson.Gson;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.pokesplash.cobblemontournaments.Utils;
import org.pokesplash.cobblemontournaments.types.PlayerRecord;

import java.io.File;
import java.util.HashMap;
import java.util.UUID;

/**
 * Class that enables interactions between PlayerRecords.
 */
public abstract class RecordProvider {
	// HashMap where all player records are stored in memory.
	private static HashMap<UUID, PlayerRecord> records  = new HashMap<>();

	// Logger for system outputs.
	private static final Logger logger = LogManager.getLogger();

	/**
	 * Method to load all records from file to memory.
	 */
	public static void loadRecords() {
		// Checks directory exists, if not, creates it.
		File dir = Utils.getDirectory("records/");

		// Gets a list of all files in the directory.
		String[] list = dir.list();

		// If there are some files in the directory, read them.
		if (list.length != 0) {

			// For each file, read it and add it to the presets HashMap.
			for (String file : list) {
				boolean readSuccess = Utils.readFileAsync("records/", file, (el -> {
					Gson gson = Utils.newGson();
					PlayerRecord record = gson.fromJson(el, PlayerRecord.class);
					records.put(record.getUuid(), record);
				}));

				// If the file couldn't be read, post an error to the console.
				if (!readSuccess) {
					logger.error("Failed to read the record for player " + file + " for Cobblemon Tournaments");
				}
			}
			// If there are no files in the directory, Log none were found.
		} else {
			logger.info("No records found for Cobblemon Tournaments.");
		}
	}

	/**
	 * Method to get the record of a player using their UUID.
	 * @param uuid the UUID of the player whos record is to be fetched.
	 * @return The Record of the player.
	 */
	public static PlayerRecord getRecord(UUID uuid) {
		if (records.containsKey(uuid)) {
			return records.get(uuid);
		} else {
			return null;
		}
	}

	/**
	 * Creates a brand new record for a player, used for when players first join.
	 * @param uuid The UUID of the player.
	 * @param username The username of the player.
	 * @return String used for debug.
	 */
	public static String createRecord(UUID uuid, String username) {
		if (records.containsKey(uuid)) {
			return "User with UUID " + uuid + " already has a record for Cobblemon Tournaments.";
		}
		records.put(uuid, new PlayerRecord(uuid, username));
		boolean success = writeRecordToFile(new PlayerRecord(uuid, username));

		// If the write was successfull, return a message.
		if (success) {
			return "Cobblemon Tournaments record created for player with UUID " + uuid;
		} else {
			return "Unable to write record to file for player with UUID " + uuid;
		}
	}

	/**
	 * Method to update an existing record of a player.
	 * @param newPlayerRecord The PlayerRecord that should overwite the old data of the player.
	 * @return String used for debug.
	 */
	public static String updateRecord(PlayerRecord newPlayerRecord) {
		if (!records.containsKey(newPlayerRecord.getUuid())) {
			return "Player with uuid " + newPlayerRecord.getUuid() + " does not exist and can not be updated.";
		}

		// Removes the old player record and adds the new one.
		records.remove(newPlayerRecord.getUuid());
		records.put(newPlayerRecord.getUuid(), newPlayerRecord);

		boolean success = writeRecordToFile(newPlayerRecord);

		if (success) {
			return "Record for user with UUID " + newPlayerRecord.getUuid() + " was successfully updated.";
		} else {
			return "Unable to write record to file for player with UUID " + newPlayerRecord.getUuid();
		}
	}

	/**
	 * Method used to write PlayerRecords to file.
	 * @param record The record to be written to file.
	 * @return true if the file was successfully written.
	 */
	private static boolean writeRecordToFile(PlayerRecord record) {
		Gson gson = Utils.newGson();

		return Utils.writeFileAsync("records/", record.getUuid().toString() + ".json", gson.toJson(record));
	}
}
