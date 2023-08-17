package org.pokesplash.cobblemontournaments.types;

/**
 * Class that represents one tournament a players has participated in.
 */
public class PlayerTournamentData {
	// The datetime the tournament took place.
	private long datetime;
	// The tournament preset.
	private String preset;
	// The players position in the tournament.
	private int position;

	/**
	 * Constructor to create a new data object for a tournament a player has taken part in.
	 * @param datetime timestamp in Milliseconds since Unix Epoch that the tournament took place.
	 * @param preset The preset name of the tournament.
	 * @param position The position the player ended in the tournament.
	 */
	public PlayerTournamentData(long datetime, String preset, int position) {
		this.datetime = datetime;
		this.preset = preset;
		this.position = position;
	}

	/**
	 * Getter for the timestamp of the tournament.
	 * @return the timestamp as a long.
	 */
	public long getDatetime() {
		return datetime;
	}

	/**
	 * Getter for the tournament preset.
	 * @return the preset name as a String.
	 */
	public String getPreset() {
		return preset;
	}

	/**
	 * Getter for the players position in the tournament.
	 * @return the players position as an int.
	 */
	public int getPosition() {
		return position;
	}
}
