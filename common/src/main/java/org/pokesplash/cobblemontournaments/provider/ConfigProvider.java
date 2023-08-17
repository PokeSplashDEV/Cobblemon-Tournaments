package org.pokesplash.cobblemontournaments.provider;

import com.google.gson.Gson;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.pokesplash.cobblemontournaments.Utils;
import org.pokesplash.cobblemontournaments.config.MainConfig;
import org.pokesplash.cobblemontournaments.config.PresetConfig;
import org.pokesplash.cobblemontournaments.config.ScheduleConfig;
import org.pokesplash.cobblemontournaments.config.TierConfig;
import org.pokesplash.cobblemontournaments.types.ScheduledItem;

import java.io.File;
import java.util.HashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * Class that controls the reading and loading into memory of all configs.
 */
public abstract class ConfigProvider {
	// The main config file.
	private static MainConfig config;
	// A HashMap of all presets, with their name as the key.
	private static HashMap<String, PresetConfig> presets = new HashMap<>();
	// The schedule file.
	private static ScheduleConfig schedule;
	// A HashMap of all tiers, with their name as the key.
	private static HashMap<String, TierConfig> tiers = new HashMap<>();
	// A logger to log any information.
	private static final Logger logger = LogManager.getLogger();

	/**
	 * Method to load all configs to memory.
	 */
	public static void loadConfigs() {
		loadMainConfig();
		loadPresets();
		loadSchedule();
		loadTiers();
	}

	/**
	 * Method to load the main config to memory.
	 */
	private static void loadMainConfig() {
		// Attempts to read the main config file.
		boolean configReadSuccess = Utils.readFileAsync("", "config.json", el -> {
			Gson gson = Utils.newGson();
			config = gson.fromJson(el, MainConfig.class);
		});

		// If the main config file could not be found, an attempt is made to create one.
		if (!configReadSuccess) {
			logger.info("Could not find config for Cobblemon Tournaments, attempting to generate default file now.");
			Gson gson = Utils.newGson();

			// Attempts to write a default config to file.
			boolean configWriteSuccess = Utils.writeFileAsync("", "config.json", gson.toJson(new MainConfig()));

			// If the config was successfully written, the config is stored to memory.
			if (configWriteSuccess) {
				config = new MainConfig();
				logger.info("Successfully created default config for Cobblemon Tournaments.");
				// Otherwise, a fatal error is logged.
			} else {
				logger.fatal("Failed to create config for Cobblemon Tournaments.");
			}
		}
	}


	/**
	 * Method to load the presets to memory.
	 */
	private static void loadPresets() {
		// Checks directory exists, if not, creates it.
		File dir = Utils.getDirectory("presets/");

		// Gets a list of all files in the directory.
		String[] list = dir.list();

		// If there are some files in the directory, read them.
		if (list.length != 0) {

			// For each file, read it and add it to the presets HashMap.
			for (String file : list) {
				boolean readSuccess = Utils.readFileAsync("presets/", file, (el -> {
					Gson gson = Utils.newGson();
					PresetConfig preset = gson.fromJson(el, PresetConfig.class);
					presets.put(preset.getName(), preset);
				}));

				// If the file couldn't be read, post an error to the console.
				if (!readSuccess) {
					logger.error("Failed to read the preset " + file + " for Cobblemon Tournaments");
				}
			}
			// If there are no files in the directory, create an example one.
		} else {
			logger.info("No presets found for Cobblemon Tournaments, generating default file now.");

			Gson gson = Utils.newGson();

			// Write the example preset to file.
			boolean writeFile = Utils.writeFileAsync("presets/", "ExamplePreset.json", gson.toJson(new PresetConfig()));

			if (writeFile) {
				// Add the example preset to the HashMap.
				PresetConfig examplePreset = new PresetConfig();
				presets.put(examplePreset.getName(), examplePreset);
				logger.info("Successfully generated example preset file for Cobblemon Tournaments.");
			} else {
				logger.fatal("Failed to create example preset for Cobblemon Tournaments.");
			}
		}
	}

	/**
	 * Method to load the schedule to memory.
	 */
	private static void loadSchedule() {
		// Attempts to read the schedule file.
		boolean configReadSuccess = Utils.readFileAsync("", "schedule.json", el -> {
			Gson gson = Utils.newGson();
			schedule = gson.fromJson(el, ScheduleConfig.class);

			// After loading schedule to memory, schedule all tournaments to file.
			for (ScheduledItem scheduledTournament : schedule.getScheduledTournaments()) {
				schedule.scheduleTournament(scheduledTournament);
			}
		});

		// If the main config file could not be found, an attempt is made to create one.
		if (!configReadSuccess) {
			logger.info("Could not find schedule for Cobblemon Tournaments, attempting to generate default file now.");
			Gson gson = Utils.newGson();

			// Attempts to write a default config to file.
			boolean configWriteSuccess = Utils.writeFileAsync("", "schedule.json", gson.toJson(new ScheduleConfig()));

			// If the config was successfully written, the config is stored to memory.
			if (configWriteSuccess) {
				schedule = new ScheduleConfig();
				logger.info("Successfully created schedule file for Cobblemon Tournaments.");
				// Otherwise, a fatal error is logged.
			} else {
				logger.fatal("Failed to create schedule file for Cobblemon Tournaments.");
			}
		}
	}

	/**
	 * Method to load the tiers to memory.
	 */
	private static void loadTiers() {
		// Checks directory exists, if not, creates it.
		File dir = Utils.getDirectory("tiers/");

		// Gets a list of all files in the directory.
		String[] list = dir.list();

		// If there are some files in the directory, read them.
		if (list.length != 0) {

			// For each file, read it and add it to the presets HashMap.
			for (String file : list) {
				boolean readSuccess = Utils.readFileAsync("tiers/", file, (el -> {
					Gson gson = Utils.newGson();
					TierConfig tier = gson.fromJson(el, TierConfig.class);
					tiers.put(tier.getName(), tier);
				}));

				// If the file couldn't be read, post an error to the console.
				if (!readSuccess) {
					logger.error("Failed to read the tier " + file + " for Cobblemon Tournaments");
				}
			}
			// If there are no files in the directory, create an example one.
		} else {
			logger.info("No tiers found for Cobblemon Tournaments, generating default file now.");

			Gson gson = Utils.newGson();

			// Write the example preset to file.
			boolean writeFile = Utils.writeFileAsync("tiers/", "ExampleTier.json", gson.toJson(new TierConfig()));

			if (writeFile) {
				// Add the example tier to the HashMap.
				TierConfig exampleTier = new TierConfig();
				tiers.put(exampleTier.getName(), exampleTier);
				logger.info("Successfully generated example tier file for Cobblemon Tournaments.");
			} else {
				logger.fatal("Failed to create example tier for Cobblemon Tournaments.");
			}
		}
	}

	/**
	 * Getter for the main config.
	 * @return The main config object.
	 */
	public static MainConfig getConfig() {
		return config;
	}

	/**
	 * Getter for the presets.
	 * @return HashMap of all presets.
	 */
	public static HashMap<String, PresetConfig> getPresets() {
		return presets;
	}

	/**
	 * Getter for the schedule.
	 * @return The schedule object.
	 */
	public static ScheduleConfig getSchedule() {
		return schedule;
	}

	/**
	 * Getter for the tiers.
	 * @return HashMap of all tiers.
	 */
	public static HashMap<String, TierConfig> getTiers() {
		return tiers;
	}
}
