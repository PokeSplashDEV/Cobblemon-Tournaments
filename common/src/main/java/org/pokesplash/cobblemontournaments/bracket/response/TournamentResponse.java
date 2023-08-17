package org.pokesplash.cobblemontournaments.bracket.response;

import org.pokesplash.cobblemontournaments.types.Tournament;

public class TournamentResponse {
private final Tournament tournament;

	public TournamentResponse(Tournament tournament) {
		this.tournament = tournament;
	}

	public Tournament getTournament() {
		return tournament;
	}
}