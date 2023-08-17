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

	/**
	 * Constructor to create a config with default values.
	 */
	public MainConfig() {
		challonge_api_key = "ENTER_KEY_HERE";
		enable_webhooks = true;
		webhook_url = "ENTER_URL_HERE";
		poll_presets = new ArrayList<>();
		poll_presets.add("ExamplePreset");
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



}
