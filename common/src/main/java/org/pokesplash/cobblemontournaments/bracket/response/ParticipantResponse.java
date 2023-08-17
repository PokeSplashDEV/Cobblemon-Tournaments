package org.pokesplash.cobblemontournaments.bracket.response;

import org.pokesplash.cobblemontournaments.types.Participant;

public class ParticipantResponse {
	private final Participant participant;

	public ParticipantResponse(Participant participant) {
		this.participant = participant;
	}

	public Participant getParticipant() {
		return participant;
	}
}
