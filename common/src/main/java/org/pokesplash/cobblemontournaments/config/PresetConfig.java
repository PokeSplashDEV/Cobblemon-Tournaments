package org.pokesplash.cobblemontournaments.config;

import org.pokesplash.cobblemontournaments.types.Prizes;

import java.util.ArrayList;

/**
 * Class that represents a preset config.
 */
public class PresetConfig {
	// Name of the preset.
	private final String name;
	// Battle type (single or double battles).
	private final String battle_type;
	// Bracket type (single bracket eliminations or double bracket eliminations)
	private final String bracket_type;
	// Custom tier to use.
	private final String tier;
	// List of banned items.
	private final ArrayList<String> banned_items;
	// List of banned abilities.
	private final ArrayList<String> banned_abilities;
	// List of banned moves.
	private final ArrayList<String> banned_moves;
	// List of clauses.
	private final ArrayList<String> clauses;
	// Are held items allowed?
	private final boolean allow_held_items;
	// Can Pokemon gain exp.
	private final boolean allow_exp_gain;
	// The max level Pokemon can be.
	private final int max_level;
	// Should Pokemon be raised to the max level?
	private final boolean raise_to_cap;
	// The max amount of Pokemon a player can bring.
	private final int max_pokemon;
	// Should all Pokemon be healed before the battle starts?
	private final boolean heal_before_battle;
	// Should the tournament be scheduled at an interval?
	private final boolean enable_reschedule;
	// The interval, in days that the tournament should be scheduled for.
	private final int reschedule_interval;
	// The prizes that should be given out.
	private final Prizes prizes;

	/**
	 * Constructor to create a default preset.
	 */
	public PresetConfig() {
		name = "ExamplePreset";
		bracket_type = "double";
		tier = "ExampleTier";
		banned_items = new ArrayList<>();
		banned_items.add("choice_band");
		banned_abilities = new ArrayList<>();
		banned_abilities.add("moody");
		banned_moves = new ArrayList<>();
		banned_moves.add("baton_pass");
		clauses = new ArrayList<>();
		clauses.add("sleep");
		allow_held_items = true;
		allow_exp_gain = false;
		battle_type = "single";
		max_level = 100;
		raise_to_cap = true;
		max_pokemon = 6;
		heal_before_battle = true;
		enable_reschedule = true;
		reschedule_interval = 28;
		prizes = new Prizes();
	}

	/**
	 * Getter to get the preset name.
	 * @return the name of the preset as a String.
	 */
	public String getName() {
		return name;
	}

	/**
	 * Getter to get the preset battle type.
	 * @return the battle type of the preset as a String.
	 */
	public String getBattle_type() {
		return battle_type;
	}

	/**
	 * Getter to get the preset bracket type.
	 * @return the bracket type of the preset as a String.
	 */
	public String getBracket_type() {
		return bracket_type;
	}

	/**
	 * Getter to get the preset tier.
	 * @return the tier of the preset as a String.
	 */
	public String getTier() {
		return tier;
	}

	/**
	 * Getter to get the preset banned items.
	 * @return the banned items of the preset as an ArrayList.
	 */
	public ArrayList<String> getBanned_items() {
		return banned_items;
	}

	/**
	 * Getter to get the preset banned abilities.
	 * @return the banned abilities of the preset as an ArrayList.
	 */
	public ArrayList<String> getBanned_abilities() {
		return banned_abilities;
	}

	/**
	 * Getter to get the preset banned moves.
	 * @return the banned moves of the preset as an ArrayList.
	 */
	public ArrayList<String> getBanned_moves() {
		return banned_moves;
	}

	/**
	 * Getter to get the preset clauses.
	 * @return the clauses of the preset as an ArrayList.
	 */
	public ArrayList<String> getClauses() {
		return clauses;
	}

	/**
	 * Getter to get the preset allowed held items.
	 * @return the allowed held items of the preset as a boolean.
	 */
	public boolean isAllow_held_items() {
		return allow_held_items;
	}

	/**
	 * Getter to get the preset exp gain.
	 * @return the exp gain of the preset as a boolean.
	 */
	public boolean isAllow_exp_gain() {
		return allow_exp_gain;
	}

	/**
	 * Getter to get the preset max level.
	 * @return the max level of the preset as an int.
	 */
	public int getMax_level() {
		return max_level;
	}

	/**
	 * Getter to get the preset raise to cap.
	 * @return the raise to cap of the preset as a boolean.
	 */
	public boolean isRaise_to_cap() {
		return raise_to_cap;
	}

	/**
	 * Getter to get the preset max pokemon.
	 * @return the max pokemon of the preset as an int.
	 */
	public int getMax_pokemon() {
		return max_pokemon;
	}

	/**
	 * Getter to get the preset heal before battle.
	 * @return the heal before battle of the preset as a boolean.
	 */
	public boolean isHeal_before_battle() {
		return heal_before_battle;
	}

	/**
	 * Getter to get the preset enable reschedule.
	 * @return the enable reschedule of the preset as a boolean.
	 */
	public boolean isEnable_reschedule() {
		return enable_reschedule;
	}

	/**
	 * Getter to get the preset reschedule interval.
	 * @return the reschedule interval of the preset as an int.
	 */
	public int getReschedule_interval() {
		return reschedule_interval;
	}

	/**
	 * Getter to get the preset prizes.
	 * @return the prizes of the preset as a Prizes object.
	 */
	public Prizes getPrizes() {
		return prizes;
	}
}
