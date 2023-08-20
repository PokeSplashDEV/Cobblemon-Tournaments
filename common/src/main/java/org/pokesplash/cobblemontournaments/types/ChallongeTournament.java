package org.pokesplash.cobblemontournaments.types;

import org.pokesplash.cobblemontournaments.bracket.response.MatchResponse;
import org.pokesplash.cobblemontournaments.bracket.response.ParticipantResponse;

import java.util.ArrayList;

/**
 * Response Class from the Challonge API for a match.
 */
public class ChallongeTournament {
	private final boolean accept_attachments;
	private final boolean allow_participant_match_reporting;
	private final boolean anonymous_voting;
	private final String category;
	private final int check_in_duration;
	private final String completed_at;
	private final String created_at;
	private final boolean created_by_api;
	private final boolean credit_capped;
	private final String description;
	private final int game_id;
	private final boolean group_stages_enabled;
	private final boolean hide_forum;
	private final boolean hide_seeds;
	private final boolean hold_third_place_match;
	private final long id;
	private final int max_predictions_per_user;
	private final String name;
	private final boolean notify_users_when_matches_open;
	private final boolean notify_users_when_the_tournament_ends;
	private final boolean open_signup;
	private final int participants_count;
	private final int prediction_method;
	private final String predictions_opened_at;
	private final boolean PRIVATE;
	private  final int progress_meter;
	private final String pts_for_bye;
	private final String pts_for_game_tie;
	private final String pts_for_game_win;
	private final String pts_for_match_tie;
	private final String pts_for_match_win;
	private final boolean quick_advance;
	private final String ranked_by;
	private final boolean require_score_agreement;
	private final String rr_pts_for_game_tie;
	private final String rr_pts_for_game_win;
	private final String rr_pts_for_match_tie;
	private final String rr_pts_for_match_win;
	private final boolean sequential_pairings;
	private final boolean show_rounds;
	private final int signup_cap;
	private final String start_at;
	private  final String started_at;
	private final String started_checking_in_at;
	private final String state;
	private final int swiss_rounds;
	private final boolean teams;
	private final ArrayList<String> tie_breaks;
	private final String tournament_type;
	private final String updated_at;
	private final String url;
	private final  String description_source;
	private final String subdomain;
	private final String full_challonge_url;
	private final String live_image_url;
	private final String sign_up_url;
	private  final boolean review_before_finalizing;
	private final boolean accepting_predictions;
	private final boolean participants_locked;
	private final String game_name;
	private final boolean participants_swappable;
	private final boolean team_convertable;
	private final boolean group_stages_were_started;
	private final ArrayList<ParticipantResponse> participants;

	private final ArrayList<MatchResponse> matches;

	public ChallongeTournament(boolean accept_attachments, boolean allow_participant_match_reporting, boolean anonymous_voting,
	                           String category, int check_in_duration, String completed_at, String created_at,
	                           boolean created_by_api, boolean credit_capped, String description, int game_id,
	                           boolean group_stages_enabled, boolean hide_forum, boolean hide_seeds,
	                           boolean hold_third_place_match, long id, int max_predictions_per_user, String name, boolean notify_users_when_matches_open, boolean notify_users_when_the_tournament_ends, boolean open_signup, int participants_count, int prediction_method, String predictions_opened_at, boolean PRIVATE, int progress_meter, String pts_for_bye, String pts_for_game_tie, String pts_for_game_win, String pts_for_match_tie, String pts_for_match_win, boolean quick_advance, String ranked_by, boolean require_score_agreement, String rr_pts_for_game_tie, String rr_pts_for_game_win, String rr_pts_for_match_tie, String rr_pts_for_match_win, boolean sequential_pairings, boolean show_rounds, int signup_cap, String start_at, String started_at, String started_checking_in_at, String state, int swiss_rounds, boolean teams, ArrayList<String> tie_breaks, String tournament_type, String updated_at, String url, String description_source, String subdomain, String full_challonge_url, String live_image_url, String sign_up_url, boolean review_before_finalizing, boolean accepting_predictions, boolean participants_locked, String game_name, boolean participants_swappable, boolean team_convertable, boolean group_stages_were_started, ArrayList<ParticipantResponse> participants, ArrayList<MatchResponse> matches) {
		this.accept_attachments = accept_attachments;
		this.allow_participant_match_reporting = allow_participant_match_reporting;
		this.anonymous_voting = anonymous_voting;
		this.category = category;
		this.check_in_duration = check_in_duration;
		this.completed_at = completed_at;
		this.created_at = created_at;
		this.created_by_api = created_by_api;
		this.credit_capped = credit_capped;
		this.description = description;
		this.game_id = game_id;
		this.group_stages_enabled = group_stages_enabled;
		this.hide_forum = hide_forum;
		this.hide_seeds = hide_seeds;
		this.hold_third_place_match = hold_third_place_match;
		this.id = id;
		this.max_predictions_per_user = max_predictions_per_user;
		this.name = name;
		this.notify_users_when_matches_open = notify_users_when_matches_open;
		this.notify_users_when_the_tournament_ends = notify_users_when_the_tournament_ends;
		this.open_signup = open_signup;
		this.participants_count = participants_count;
		this.prediction_method = prediction_method;
		this.predictions_opened_at = predictions_opened_at;
		this.PRIVATE = PRIVATE;
		this.progress_meter = progress_meter;
		this.pts_for_bye = pts_for_bye;
		this.pts_for_game_tie = pts_for_game_tie;
		this.pts_for_game_win = pts_for_game_win;
		this.pts_for_match_tie = pts_for_match_tie;
		this.pts_for_match_win = pts_for_match_win;
		this.quick_advance = quick_advance;
		this.ranked_by = ranked_by;
		this.require_score_agreement = require_score_agreement;
		this.rr_pts_for_game_tie = rr_pts_for_game_tie;
		this.rr_pts_for_game_win = rr_pts_for_game_win;
		this.rr_pts_for_match_tie = rr_pts_for_match_tie;
		this.rr_pts_for_match_win = rr_pts_for_match_win;
		this.sequential_pairings = sequential_pairings;
		this.show_rounds = show_rounds;
		this.signup_cap = signup_cap;
		this.start_at = start_at;
		this.started_at = started_at;
		this.started_checking_in_at = started_checking_in_at;
		this.state = state;
		this.swiss_rounds = swiss_rounds;
		this.teams = teams;
		this.tie_breaks = tie_breaks;
		this.tournament_type = tournament_type;
		this.updated_at = updated_at;
		this.url = url;
		this.description_source = description_source;
		this.subdomain = subdomain;
		this.full_challonge_url = full_challonge_url;
		this.live_image_url = live_image_url;
		this.sign_up_url = sign_up_url;
		this.review_before_finalizing = review_before_finalizing;
		this.accepting_predictions = accepting_predictions;
		this.participants_locked = participants_locked;
		this.game_name = game_name;
		this.participants_swappable = participants_swappable;
		this.team_convertable = team_convertable;
		this.group_stages_were_started = group_stages_were_started;
		this.participants = participants;
		this.matches = matches;
	}

	public boolean isAccept_attachments() {
		return accept_attachments;
	}

	public boolean isAllow_participant_match_reporting() {
		return allow_participant_match_reporting;
	}

	public boolean isAnonymous_voting() {
		return anonymous_voting;
	}

	public String getCategory() {
		return category;
	}

	public int getCheck_in_duration() {
		return check_in_duration;
	}

	public String getCompleted_at() {
		return completed_at;
	}

	public String getCreated_at() {
		return created_at;
	}

	public boolean isCreated_by_api() {
		return created_by_api;
	}

	public boolean isCredit_capped() {
		return credit_capped;
	}

	public String getDescription() {
		return description;
	}

	public int getGame_id() {
		return game_id;
	}

	public boolean isGroup_stages_enabled() {
		return group_stages_enabled;
	}

	public boolean isHide_forum() {
		return hide_forum;
	}

	public boolean isHide_seeds() {
		return hide_seeds;
	}

	public boolean isHold_third_place_match() {
		return hold_third_place_match;
	}

	public long getId() {
		return id;
	}

	public int getMax_predictions_per_user() {
		return max_predictions_per_user;
	}

	public String getName() {
		return name;
	}

	public boolean isNotify_users_when_matches_open() {
		return notify_users_when_matches_open;
	}

	public boolean isNotify_users_when_the_tournament_ends() {
		return notify_users_when_the_tournament_ends;
	}

	public boolean isOpen_signup() {
		return open_signup;
	}

	public int getParticipants_count() {
		return participants_count;
	}

	public int getPrediction_method() {
		return prediction_method;
	}

	public String getPredictions_opened_at() {
		return predictions_opened_at;
	}

	public boolean isPRIVATE() {
		return PRIVATE;
	}

	public int getProgress_meter() {
		return progress_meter;
	}

	public String getPts_for_bye() {
		return pts_for_bye;
	}

	public String getPts_for_game_tie() {
		return pts_for_game_tie;
	}

	public String getPts_for_game_win() {
		return pts_for_game_win;
	}

	public String getPts_for_match_tie() {
		return pts_for_match_tie;
	}

	public String getPts_for_match_win() {
		return pts_for_match_win;
	}

	public boolean isQuick_advance() {
		return quick_advance;
	}

	public String getRanked_by() {
		return ranked_by;
	}

	public boolean isRequire_score_agreement() {
		return require_score_agreement;
	}

	public String getRr_pts_for_game_tie() {
		return rr_pts_for_game_tie;
	}

	public String getRr_pts_for_game_win() {
		return rr_pts_for_game_win;
	}

	public String getRr_pts_for_match_tie() {
		return rr_pts_for_match_tie;
	}

	public String getRr_pts_for_match_win() {
		return rr_pts_for_match_win;
	}

	public boolean isSequential_pairings() {
		return sequential_pairings;
	}

	public boolean isShow_rounds() {
		return show_rounds;
	}

	public int getSignup_cap() {
		return signup_cap;
	}

	public String getStart_at() {
		return start_at;
	}

	public String getStarted_at() {
		return started_at;
	}

	public String getStarted_checking_in_at() {
		return started_checking_in_at;
	}

	public String getState() {
		return state;
	}

	public int getSwiss_rounds() {
		return swiss_rounds;
	}

	public boolean isTeams() {
		return teams;
	}

	public ArrayList<String> getTie_breaks() {
		return tie_breaks;
	}

	public String getTournament_type() {
		return tournament_type;
	}

	public String getUpdated_at() {
		return updated_at;
	}

	public String getUrl() {
		return url;
	}

	public String getDescription_source() {
		return description_source;
	}

	public String getSubdomain() {
		return subdomain;
	}

	public String getFull_challonge_url() {
		return full_challonge_url;
	}

	public String getLive_image_url() {
		return live_image_url;
	}

	public String getSign_up_url() {
		return sign_up_url;
	}

	public boolean isReview_before_finalizing() {
		return review_before_finalizing;
	}

	public boolean isAccepting_predictions() {
		return accepting_predictions;
	}

	public boolean isParticipants_locked() {
		return participants_locked;
	}

	public String getGame_name() {
		return game_name;
	}

	public boolean isParticipants_swappable() {
		return participants_swappable;
	}

	public boolean isTeam_convertable() {
		return team_convertable;
	}

	public boolean isGroup_stages_were_started() {
		return group_stages_were_started;
	}

	public ArrayList<ParticipantResponse> getParticipants() {
		return participants;
	}

	public ArrayList<MatchResponse> getMatches() {
		return matches;
	}
}
