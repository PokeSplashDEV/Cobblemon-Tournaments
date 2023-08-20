package org.pokesplash.cobblemontournaments.bracket.response;

import org.pokesplash.cobblemontournaments.types.ChallongeParticipant;

public class ParticipantResponse {
	private final ChallongeParticipant participant;

	public ParticipantResponse(ChallongeParticipant challongeParticipant) {
		this.participant = challongeParticipant;
	}

	public ChallongeParticipant getParticipant() {
		return participant;
	}
}
