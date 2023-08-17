package org.pokesplash.cobblemontournaments.bracket;

import com.google.gson.Gson;
import org.pokesplash.cobblemontournaments.Utils;
import org.pokesplash.cobblemontournaments.bracket.response.TournamentResponse;
import org.pokesplash.cobblemontournaments.provider.ConfigProvider;
import org.pokesplash.cobblemontournaments.types.Tournament;

/**
 * Class that is used to interact with the Challonge API for creating, fetching and deleting tournaments.
 */
public abstract class TournamentHandler {
	/**
	 * Method to fetch a tournament using the tournament id.
	 * @param tournamentId the ID of the tournament to fetch.
	 * @return The tournament that has been fetched.
	 */
	public static Tournament getTournament(long tournamentId) {
		String json =
				Challonge.get("tournaments/" + tournamentId + ".json?api_key=" + ConfigProvider.getConfig().getChallongeKey() +
				"&include_participants=1&include_matches=1");

		Gson gson = Utils.newGson();
		TournamentResponse response = gson.fromJson(json, TournamentResponse.class);
		return response.getTournament();
	}

	/**
	 * Method to create a new tournament.
	 * @param title The name of the tournament.
	 * @param description The description of the tournament.
	 * @param tournamentType The type of the tournament.
	 * @return The newly created tournament.
	 */
	public static Tournament createTournament(String title, String description, String tournamentType) {
		String body = "{\"api_key\": \"" + ConfigProvider.getConfig().getChallongeKey() +
				"\", \"tournament\": {" +
				"\"name\": \"" + title +
				"\", \"description\": \"" + description +
				"\", \"tournament_type\": \"" + tournamentType +
				"\", \"open_signup\": \"false" +
				"\", \"hide_forum\": \"true" +
				"\"}}";

		String json =
				Challonge.post("tournaments.json", body);

		Gson gson = Utils.newGson();
		TournamentResponse response = gson.fromJson(json, TournamentResponse.class);
		return response.getTournament();
	}

	/**
	 * Method to start an existing tournament.
	 * @param tournamentId The Id of the tournament to start.
	 * @return The tournament that has started.
	 */
	public static Tournament startTournament(long tournamentId) {
		String body = "{\"api_key\": \"" + ConfigProvider.getConfig().getChallongeKey() +
				"\"}";

		String json =
				Challonge.post("tournaments/" + tournamentId + "/start.json", body);

		Gson gson = Utils.newGson();
		TournamentResponse response = gson.fromJson(json, TournamentResponse.class);
		return response.getTournament();
	}

	/**
	 * Method to finalize a tournament once it has been completed.
	 * @param tournamentId The Id of the tournament to finalize.
	 * @return The tournament that has finished.
	 */
	public static Tournament finalizeTournament(long tournamentId) {
		String body = "{\"api_key\": \"" + ConfigProvider.getConfig().getChallongeKey() +
				"\", \"include_participants\": \"1\", \"include_matches\": \"1\"}";

		String json =
				Challonge.post("tournaments/" + tournamentId + "/finalize.json", body);

		Gson gson = Utils.newGson();
		TournamentResponse response = gson.fromJson(json, TournamentResponse.class);
		return response.getTournament();
	}

	/**
	 * Method to delete a tournament.
	 * @param tournamentId The ID of the tournament to delete.
	 */
	public static void deleteTournament(long tournamentId) {
		String json =
				Challonge.delete("tournaments/" + tournamentId + ".json?api_key=" + ConfigProvider.getConfig().getChallongeKey() +
						"&include_participants=1&include_matches=1");
	}
}
