package org.pokesplash.cobblemontournaments.bracket.response;

import org.pokesplash.cobblemontournaments.types.Match;

public class MatchResponse {
	private final Match match;

	public MatchResponse(Match matches) {
		this.match = matches;
	}

	public Match getMatches() {
		return match;
	}
}
