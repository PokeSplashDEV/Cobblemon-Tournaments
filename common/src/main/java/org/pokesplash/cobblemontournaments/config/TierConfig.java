package org.pokesplash.cobblemontournaments.config;

import java.util.ArrayList;

/**
 * Class that represents a single tier config.
 */
public class TierConfig {
	// The name of the tier.
	private final String name;
	// A list of allowed Pokemon in this tier.
	private final ArrayList<String> allowed_pokemon;
	// A list of allowed Tiers in this tier (Prevents repeating Pokemon from another tier).
	private final ArrayList<String> allowed_tiers;

	/**
	 * Constructor to create a default tier config.
	 */
	public TierConfig() {
		name = "ExampleTier";
		allowed_pokemon = new ArrayList<>();
		allowed_pokemon.add("Rayquaza");
		allowed_pokemon.add("Xerneas");
		allowed_pokemon.add("Groudon");
		allowed_pokemon.add("Kyogre");
		allowed_pokemon.add("Yveltal");

		allowed_tiers = new ArrayList<>();
	}

	/**
	 * Getter for the name of the Tier.
	 * @return The name of the tier as a String.
	 */
	public String getName() {
		return name;
	}

	/**
	 * Getter for the allowed Pokemon in the tier.
	 * @return An ArrayList of Pokemon allowed in the tier.
	 */
	public ArrayList<String> getAllowed_pokemon() {
		return allowed_pokemon;
	}

	/**
	 * Getter for the allowed tiers in the tier.
	 * @return An ArrayList of tiers allowed in this tier.
	 */
	public ArrayList<String> getAllowed_tiers() {
		return allowed_tiers;
	}
}
