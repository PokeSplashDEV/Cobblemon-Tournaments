package org.pokesplash.cobblemontournaments.config;

import java.util.ArrayList;

/**
 * Class that represents the main config of the plugin.
 */
public class MainConfig {
	// The API key from https://challonge.com/settings/developer
	private final String challonge_api_key;
	// If webhooks should be enabled.
	private final boolean enable_webhooks;
	// The discord url for the webhook.
	private final String webhook_url;
	// Presets for the polls.
	private final ArrayList<String> poll_presets;
	// If polls should be automatically scheduled after a tournament finishes.
	private final boolean automatic_polls;
	// The duration in hours that the poll should be open for.
	private final int poll_duration;
	// The duration in days between tournaments voted for by polls.
	private final int poll_tournament_duration;
	// Automatic tournament sign up period, in minutes.
	private final int signup_duration;

	/**
	 * Constructor to create a config with default values.
	 */
	public MainConfig() {
		challonge_api_key = "ENTER_KEY_HERE";
		enable_webhooks = true;
		webhook_url = "ENTER_URL_HERE";
		poll_presets = new ArrayList<>();
		poll_presets.add("ExamplePreset");
		automatic_polls = true;
		poll_duration = 24;
		poll_tournament_duration = 28;
		signup_duration = 10;
	}

	/**
	 * Getter for the challonge API key.
	 * @return the API key as a string.
	 */
	public String getChallongeKey() {
		return challonge_api_key;
	}

	/**
	 * Getter to know if webhooks are enabled.
	 * @return true if webhooks are enabled.
	 */
	public boolean isWebhooksEnabled() {
		return enable_webhooks;
	}

	/**
	 * Getter for the webhook URL.
	 * @return the webhook Url as a String.
	 */
	public String getWebhookUrl() {
		return webhook_url;
	}

	/**
	 * Getter for the presets that will be available to vote for in a poll.
	 * @return an ArrayList of preset names.
	 */
	public ArrayList<String> getPollPresets() {
		return poll_presets;
	}

	/**
	 * Getter for if polls are automatically generated.
	 * @return true if the poll is automatic.
	 */
	public boolean isAutomaticPolls() {
		return automatic_polls;
	}

	/**
	 * Getter for the duration the polls last.
	 * @return the duration in hours as an int.
	 */
	public int getPollDuration() {
		return poll_duration;
	}

	/**
	 * Getter for the duration between tournaments voted for on polls.
	 * @return duration in days between tournaments.
	 */
	public int getTournamentDuration() {
		return poll_tournament_duration;
	}

	/**
	 * Getter for the signup duration of automatic tournaments.
	 * @return the signup duration in minutes.
	 */
	public int getSignupDuration() {
		return signup_duration;
	}
}
