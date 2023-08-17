package org.pokesplash.cobblemontournaments.types;

public class Prizes {
	// First place prize.
	private final Prize first;
	// Second place prize.
	private final Prize second;
	// Third place prize.
	private final Prize third;
	// Participation prize.
	private final Prize participation;

	/**
	 * Constructor to create a default prizes object.
	 */
	public Prizes() {
		first = new Prize();
		second = new Prize();
		third = new Prize();
		participation = new Prize();
	}

	/**
	 * Getter for the first place prize.
	 * @return Prize of first place.
	 */
	public Prize getFirst() {
		return first;
	}

	/**
	 * Getter for the second place prize.
	 * @return Prize of second place.
	 */
	public Prize getSecond() {
		return second;
	}

	/**
	 * Getter for the third place prize.
	 * @return Prize of third place.
	 */
	public Prize getThird() {
		return third;
	}

	/**
	 * Getter for the participation place prize.
	 * @return Prize of participation place.
	 */
	public Prize getParticipation() {
		return participation;
	}
}
