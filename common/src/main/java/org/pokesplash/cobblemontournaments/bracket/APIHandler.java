package org.pokesplash.cobblemontournaments.bracket;

import com.google.common.reflect.TypeToken;
import com.google.gson.Gson;
import org.pokesplash.cobblemontournaments.Utils;
import org.pokesplash.cobblemontournaments.bracket.response.MatchResponse;
import org.pokesplash.cobblemontournaments.bracket.response.ParticipantResponse;
import org.pokesplash.cobblemontournaments.bracket.response.TournamentResponse;
import org.pokesplash.cobblemontournaments.provider.ConfigProvider;
import org.pokesplash.cobblemontournaments.types.ChallongeMatch;
import org.pokesplash.cobblemontournaments.types.ChallongeParticipant;
import org.pokesplash.cobblemontournaments.types.ChallongeTournament;

import java.lang.reflect.Type;
import java.util.ArrayList;

/**
 * Class that builds upon the ChallongeAPI class to provide methods for tournaments, participants and matches.
 */
public abstract class APIHandler {

	private static ChallongeAPI api = new ChallongeAPI();

	/**
	 * Method to fetch a tournament using the tournament id.
	 * @param tournamentId the ID of the tournament to fetch.
	 * @return The tournament that has been fetched.
	 */
	public static ChallongeTournament getTournament(long tournamentId) {
		String json =
				api.get("tournaments/" + tournamentId + ".json?api_key=" + ConfigProvider.getConfig().getChallongeKey() +
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
	public static ChallongeTournament createTournament(String title, String description, String tournamentType) {
		String body = "{\"api_key\": \"" + ConfigProvider.getConfig().getChallongeKey() +
				"\", \"tournament\": {" +
				"\"name\": \"" + title +
				"\", \"description\": \"" + description +
				"\", \"tournament_type\": \"" + tournamentType +
				"\", \"open_signup\": \"false" +
				"\", \"hide_forum\": \"true" +
				"\"}}";

		String json =
				api.post("tournaments.json", body);

		Gson gson = Utils.newGson();
		TournamentResponse response = gson.fromJson(json, TournamentResponse.class);
		return response.getTournament();
	}

	/**
	 * Method to start an existing tournament.
	 * @param tournamentId The Id of the tournament to start.
	 * @return The tournament that has started.
	 */
	public static ChallongeTournament startTournament(long tournamentId) {
		String body = "{\"api_key\": \"" + ConfigProvider.getConfig().getChallongeKey() +
				"\"}";

		String json =
				api.post("tournaments/" + tournamentId + "/start.json", body);

		Gson gson = Utils.newGson();
		TournamentResponse response = gson.fromJson(json, TournamentResponse.class);
		return response.getTournament();
	}

	/**
	 * Method to finalize a tournament once it has been completed.
	 * @param tournamentId The Id of the tournament to finalize.
	 * @return The tournament that has finished.
	 */
	public static ChallongeTournament finalizeTournament(long tournamentId) {
		String body = "{\"api_key\": \"" + ConfigProvider.getConfig().getChallongeKey() +
				"\", \"include_participants\": \"1\", \"include_matches\": \"1\"}";

		String json =
				api.post("tournaments/" + tournamentId + "/finalize.json", body);

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
				api.delete("tournaments/" + tournamentId + ".json?api_key=" + ConfigProvider.getConfig().getChallongeKey() +
						"&include_participants=1&include_matches=1", "");
	}

	/**
	 * Method to get a list of participants for a given tournament.
	 * @param tournamentId The ID of the tournament to get the participants for.
	 * @return ArrayList of participants taking part in the tournament.
	 */
	public static ArrayList<ChallongeParticipant> getParticipants(long tournamentId) {
		String json =
				api.get("tournaments/" + tournamentId + "/challongeParticipants.json?api_key=" + ConfigProvider.getConfig().getChallongeKey());

		Gson gson = Utils.newGson();

		Type listType = new TypeToken<ArrayList<ParticipantResponse>>(){}.getType();
		ArrayList<ParticipantResponse> response = gson.fromJson(json, listType);

		ArrayList<ChallongeParticipant> challongeParticipants = new ArrayList<>();
		for (ParticipantResponse item : response) {
			challongeParticipants.add(item.getParticipant());
		}

		return challongeParticipants;
	}

	/**
	 * Method to add a new participant to a given tournament.
	 * @param tournamentId The ID of the tournament that the participant should be added to.
	 * @param participantName The name of the participant that should be added.
	 * @return The newly created participant object for the participant given.
	 */
	public static ChallongeParticipant addParticipant(long tournamentId, String participantName) {
		String body = "{\"api_key\": \"" + ConfigProvider.getConfig().getChallongeKey() +
				"\", \"participant\": {" +
				"\"name\": \"" + participantName +
				"\"}}";

		String json =
				api.post("tournaments/" + tournamentId + "/participants.json", body);

		Gson gson = Utils.newGson();
		ParticipantResponse response = gson.fromJson(json, ParticipantResponse.class);

		return response.getParticipant();
	}

	/**
	 * Method to delete a participant from an existing tournament.
	 * @param tournamentId The ID of the tournament that the participant should be deleted from.
	 * @param playerId The ID given by challonge of the player that should be deleted.
	 */
	public static void deleteParticipant(long tournamentId, long playerId) {

		String body = "{\"api_key\": \"" + ConfigProvider.getConfig().getChallongeKey() + "\"}";

		String json =
				api.delete("tournaments/" + tournamentId + "/participants/" + playerId + ".json",
						body);
	}

	/**
	 * Method to get all current open matches in a tournament.
	 * @param tournamentId The ID of the tournament to get the matches in.
	 * @return ArrayList of matches currently open.
	 */
	public static ArrayList<ChallongeMatch> getMatches(long tournamentId) {
		String json =
				api.get("tournaments/" + tournamentId + "/challongeMatches.json?api_key=" + ConfigProvider.getConfig().getChallongeKey() +
						"&state=open");

		Gson gson = Utils.newGson();

		Type listType = new TypeToken<ArrayList<MatchResponse>>(){}.getType();
		ArrayList<MatchResponse> response = gson.fromJson(json, listType);

		ArrayList<ChallongeMatch> challongeMatches = new ArrayList<>();
		for (MatchResponse match : response) {
			challongeMatches.add(match.getMatches());
		}

		return challongeMatches;
	}

	public static ChallongeMatch completeMatch(long tournamentId, long matchId, long winnerId) {

		String body = "{\"api_key\": \"" + ConfigProvider.getConfig().getChallongeKey() +
				"\", \"match\": {" +
				"\"winner_id\": \"" + winnerId +
				"\",\"scores_csv\": \"0-0" +
				"\"}}";

		System.out.println(body);

		String json = api.put("tournaments/" + tournamentId+ "/matches/" + matchId + ".json", body);

		Gson gson = Utils.newGson();
		MatchResponse response = gson.fromJson(json, MatchResponse.class);

		return response.getMatches();
	}
}
