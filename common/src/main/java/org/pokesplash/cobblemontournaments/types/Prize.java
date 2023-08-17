package org.pokesplash.cobblemontournaments.types;

import java.util.ArrayList;

/**
 * Class that represents one prize.
 */
public class Prize {
	// Commands to run for the winner.
	private final ArrayList<String> commands;

	/**
	 * Constructor to create a default prize.
	 */
	public Prize() {
		commands = new ArrayList<>();
		commands.add("give %player% minecraft:diamond 1");
	}

	/**
	 * Getter to get all commands for the prize.
	 * @return ArrayList of commands to run.
	 */
	public ArrayList<String> getCommands() {
		return commands;
	}
}
