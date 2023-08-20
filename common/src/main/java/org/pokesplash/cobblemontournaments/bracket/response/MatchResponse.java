package org.pokesplash.cobblemontournaments.bracket.response;

import org.pokesplash.cobblemontournaments.types.ChallongeMatch;

public class MatchResponse {
	private final ChallongeMatch match;

	public MatchResponse(ChallongeMatch matches) {
		this.match = matches;
	}

	public ChallongeMatch getMatches() {
		return match;
	}
}
