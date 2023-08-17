package org.pokesplash.cobblemontournaments.types;

public class Match {
	private final long id;
	private final long tournament_id;
	private final String state;
	private final long player1_id;
	private final long player2_id;
	private final long player1_prereq_match_id;
	private final long player2_prereq_match_id;
	private final boolean player1_is_prereq_match_loser;
	private final boolean player2_is_prereq_match_loser;
	private final long winner_id;
	private final long loser_id;
	private final String started_at;
	private final String created_at;
	private final String updated_at;
	private final String indetifier;
	private final boolean has_attachment;
	private final int round;
	private final int player1_votes;
	private final int player2_votes;
	private final long group_id;
	private final int attachment_count;
	private final String scheduled_time;
	private final String location;
	private final String underway_at;
	private final boolean optional;
	private final long rushb_id;
	private final String completed_at;
	private final int suggested_play_order;
	private final boolean forfeited;
	private final String open_graph_image_file_name;
	private final String open_graph_image_content_type;
	private final String open_graph_image_file_size;
	private final String prerequisite_match_ids_csv;
	private final String scores_csv;

	public Match(long id, long tournament_id, String state, long player1_id, long player2_id, long player1_prereq_match_id, long player2_prereq_match_id, boolean player1_is_prereq_match_loser, boolean player2_is_prereq_match_loser, long winner_id, long loser_id, String started_at, String created_at, String updated_at, String indetifier, boolean has_attachment, int round, int player1_votes, int player2_votes, long group_id, int attachment_count, String scheduled_time, String location, String underway_at, boolean optional, long rushb_id, String completed_at, int suggested_play_order, boolean forfeited, String open_graph_image_file_name, String open_graph_image_content_type, String open_graph_image_file_size, String prerequisite_match_ids_csv, String scores_csv) {
		this.id = id;
		this.tournament_id = tournament_id;
		this.state = state;
		this.player1_id = player1_id;
		this.player2_id = player2_id;
		this.player1_prereq_match_id = player1_prereq_match_id;
		this.player2_prereq_match_id = player2_prereq_match_id;
		this.player1_is_prereq_match_loser = player1_is_prereq_match_loser;
		this.player2_is_prereq_match_loser = player2_is_prereq_match_loser;
		this.winner_id = winner_id;
		this.loser_id = loser_id;
		this.started_at = started_at;
		this.created_at = created_at;
		this.updated_at = updated_at;
		this.indetifier = indetifier;
		this.has_attachment = has_attachment;
		this.round = round;
		this.player1_votes = player1_votes;
		this.player2_votes = player2_votes;
		this.group_id = group_id;
		this.attachment_count = attachment_count;
		this.scheduled_time = scheduled_time;
		this.location = location;
		this.underway_at = underway_at;
		this.optional = optional;
		this.rushb_id = rushb_id;
		this.completed_at = completed_at;
		this.suggested_play_order = suggested_play_order;
		this.forfeited = forfeited;
		this.open_graph_image_file_name = open_graph_image_file_name;
		this.open_graph_image_content_type = open_graph_image_content_type;
		this.open_graph_image_file_size = open_graph_image_file_size;
		this.prerequisite_match_ids_csv = prerequisite_match_ids_csv;
		this.scores_csv = scores_csv;
	}

	public long getId() {
		return id;
	}

	public long getTournament_id() {
		return tournament_id;
	}

	public String getState() {
		return state;
	}

	public long getPlayer1_id() {
		return player1_id;
	}

	public long getPlayer2_id() {
		return player2_id;
	}

	public long getPlayer1_prereq_match_id() {
		return player1_prereq_match_id;
	}

	public long getPlayer2_prereq_match_id() {
		return player2_prereq_match_id;
	}

	public boolean isPlayer1_is_prereq_match_loser() {
		return player1_is_prereq_match_loser;
	}

	public boolean isPlayer2_is_prereq_match_loser() {
		return player2_is_prereq_match_loser;
	}

	public long getWinner_id() {
		return winner_id;
	}

	public long getLoser_id() {
		return loser_id;
	}

	public String getStarted_at() {
		return started_at;
	}

	public String getCreated_at() {
		return created_at;
	}

	public String getUpdated_at() {
		return updated_at;
	}

	public String getIndetifier() {
		return indetifier;
	}

	public boolean isHas_attachment() {
		return has_attachment;
	}

	public int getRound() {
		return round;
	}

	public int getPlayer1_votes() {
		return player1_votes;
	}

	public int getPlayer2_votes() {
		return player2_votes;
	}

	public long getGroup_id() {
		return group_id;
	}

	public int getAttachment_count() {
		return attachment_count;
	}

	public String getScheduled_time() {
		return scheduled_time;
	}

	public String getLocation() {
		return location;
	}

	public String getUnderway_at() {
		return underway_at;
	}

	public boolean isOptional() {
		return optional;
	}

	public long getRushb_id() {
		return rushb_id;
	}

	public String getCompleted_at() {
		return completed_at;
	}

	public int getSuggested_play_order() {
		return suggested_play_order;
	}

	public boolean isForfeited() {
		return forfeited;
	}

	public String getOpen_graph_image_file_name() {
		return open_graph_image_file_name;
	}

	public String getOpen_graph_image_content_type() {
		return open_graph_image_content_type;
	}

	public String getOpen_graph_image_file_size() {
		return open_graph_image_file_size;
	}

	public String getPrerequisite_match_ids_csv() {
		return prerequisite_match_ids_csv;
	}

	public String getScores_csv() {
		return scores_csv;
	}
}


