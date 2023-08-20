package org.pokesplash.cobblemontournaments.bracket.response;

import org.pokesplash.cobblemontournaments.types.ChallongeTournament;

public class TournamentResponse {
private final ChallongeTournament tournament;

	public TournamentResponse(ChallongeTournament challongeTournament) {
		this.tournament = challongeTournament;
	}

	public ChallongeTournament getTournament() {
		return tournament;
	}
}