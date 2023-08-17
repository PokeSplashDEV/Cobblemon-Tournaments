package org.pokesplash.cobblemontournaments.types;

import java.util.ArrayList;
import java.util.UUID;

/**
 * Class that holds all data on a single player.
 */
public class PlayerRecord {
	// The UUID of the player.
	private UUID uuid;
	// The username of the player.
	private String username;
	// The amount of times the player has finished first place.
	private int first_place;
	// The amount of times the player has finished second place.
	private int second_place;
	// The amount of times the player has finished third place.
	private int third_place;
	// The amount of times the player has participated in a tournament.
	private int participated;
	// The information of the tournaments the player has participated in.
	private ArrayList<PlayerTournamentData> past_tournaments;

	/**
	 * Constructor to create a brand new PlayerRecord object.
	 * @param uuid the UUID of the player.
	 * @param username the username of the player.
	 */
	public PlayerRecord(UUID uuid, String username) {
		this.uuid = uuid;
		this.username = username;
		first_place = 0;
		second_place = 0;
		third_place = 0;
		participated = 0;
		past_tournaments = new ArrayList<>();
	}

	/**
	 * Getter for the players UUID.
	 * @return the UUID of the player.
	 */
	public UUID getUuid() {
		return uuid;
	}

	/**
	 * Getter for the players username.
	 * @return the username of the player.
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * Getter for the number of first places the player has.
	 * @return the amount of first place finishes as an int.
	 */
	public int getFirst_place() {
		return first_place;
	}

	/**
	 * Getter for the number of second places the player has.
	 * @return the amount of second place finishes as an int.
	 */
	public int getSecond_place() {
		return second_place;
	}

	/**
	 * Getter for the number of third places the player has.
	 * @return the amount of third place finishes as an int.
	 */
	public int getThird_place() {
		return third_place;
	}

	/**
	 * Getter for the number of participations the player has.
	 * @return the amount of participations finishes as an int.
	 */
	public int getParticipated() {
		return participated;
	}

	/**
	 * Getter for the players previous tournaments.
	 * @return the previous tournaments of the player, as an ArrayList.
	 */
	public ArrayList<PlayerTournamentData> getPast_tournaments() {
		return past_tournaments;
	}

	/**
	 * Method to update the players username.
	 * @param username the new username of the player.
	 */
	public void updateUsername(String username) {
		this.username = username;
	}

	/**
	 * Method to add another first place finish to the players record.
	 */
	public void addFirstPlace() {
		this.first_place += 1;
	}

	/**
	 * Method to add another second place finish to the players record.
	 */
	public void addSecondPlace() {
		this.second_place += 1;
	}

	/**
	 * Method to add another third place finish to the players record.
	 */
	public void addThirdPlace() {
		this.third_place += 1;
	}

	/**
	 * Method to add another participation to the players record.
	 */
	public void addParticipated() {
		this.participated += 1;
	}

	/**
	 * Method to add another tournament to the players record.
	 * @param tournamentData the data of the tournament that should be added.
	 */
	public void addTournament(PlayerTournamentData tournamentData) {
		this.past_tournaments.add(tournamentData);
	}
}
