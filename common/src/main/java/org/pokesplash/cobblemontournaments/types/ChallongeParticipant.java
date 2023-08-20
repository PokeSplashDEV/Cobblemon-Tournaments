package org.pokesplash.cobblemontournaments.types;

import java.util.ArrayList;

/**
 * Response Class from the Challonge API for a match.
 */
public class ChallongeParticipant {
	private final long id;
	private final long tournament_id;
	private final String name;
	private final int seed;
	private final boolean active;
	private final String created_at;
	private final String updated_at;
	private final String invite_email;
	private  final  int final_rank;
	private final String misc;
	private final String icon;
	private final boolean on_waiting_list;
	private final long invitation_id;
	private final long group_id;
	private final String checked_in_at;
	private final long ranked_member_id;
	private final String custom_field_response;
	private final String clinch;
	private final long integration_uids;
	private final String challonge_username;
	private final long challonge_user_id;
	private final String challonge_email_address_verified;
	private final boolean removable;
	private final boolean participatable_or_invitation_attached;
	private final boolean confirm_removed;
	private final boolean invitation_pending;
	private final String display_name_with_invitation_email_address;
	private final String email_hash;
	private final String username;
	private final String display_name;
	private final String attached_participatable_portrait_url;
	private final boolean can_check_in;
	private final boolean checked_in;
	private final boolean reactivatable;
	private final boolean check_in_open;
	private final ArrayList<String> group_player_ids;
	private final boolean has_irrelevant_seed;
	private final String ordinal_seed;

	public ChallongeParticipant(long id, long tournament_id, String name, int seed, boolean active, String created_at, String updated_at, String invite_email, int final_rank, String misc, String icon, boolean on_waiting_list, long invitation_id, long group_id, String checked_in_at, long ranked_member_id, String custom_field_response, String clinch, long integration_uids, String challonge_username, long challonge_user_id, String challonge_email_address_verified, boolean removable, boolean participatable_or_invitation_attached, boolean confirm_removed, boolean invitation_pending, String display_name_with_invitation_email_address, String email_hash, String username, String display_name, String attached_participatable_portrait_url, boolean can_check_in, boolean checked_in, boolean reactivatable, boolean check_in_open, ArrayList<String> group_player_ids, boolean has_irrelevant_seed, String ordinal_seed) {
		this.id = id;
		this.tournament_id = tournament_id;
		this.name = name;
		this.seed = seed;
		this.active = active;
		this.created_at = created_at;
		this.updated_at = updated_at;
		this.invite_email = invite_email;
		this.final_rank = final_rank;
		this.misc = misc;
		this.icon = icon;
		this.on_waiting_list = on_waiting_list;
		this.invitation_id = invitation_id;
		this.group_id = group_id;
		this.checked_in_at = checked_in_at;
		this.ranked_member_id = ranked_member_id;
		this.custom_field_response = custom_field_response;
		this.clinch = clinch;
		this.integration_uids = integration_uids;
		this.challonge_username = challonge_username;
		this.challonge_user_id = challonge_user_id;
		this.challonge_email_address_verified = challonge_email_address_verified;
		this.removable = removable;
		this.participatable_or_invitation_attached = participatable_or_invitation_attached;
		this.confirm_removed = confirm_removed;
		this.invitation_pending = invitation_pending;
		this.display_name_with_invitation_email_address = display_name_with_invitation_email_address;
		this.email_hash = email_hash;
		this.username = username;
		this.display_name = display_name;
		this.attached_participatable_portrait_url = attached_participatable_portrait_url;
		this.can_check_in = can_check_in;
		this.checked_in = checked_in;
		this.reactivatable = reactivatable;
		this.check_in_open = check_in_open;
		this.group_player_ids = group_player_ids;
		this.has_irrelevant_seed = has_irrelevant_seed;
		this.ordinal_seed = ordinal_seed;
	}

	public long getId() {
		return id;
	}

	public long getTournament_id() {
		return tournament_id;
	}

	public String getName() {
		return name;
	}

	public int getSeed() {
		return seed;
	}

	public boolean isActive() {
		return active;
	}

	public String getCreated_at() {
		return created_at;
	}

	public String getUpdated_at() {
		return updated_at;
	}

	public String getInvite_email() {
		return invite_email;
	}

	public int getFinal_rank() {
		return final_rank;
	}

	public String getMisc() {
		return misc;
	}

	public String getIcon() {
		return icon;
	}

	public boolean isOn_waiting_list() {
		return on_waiting_list;
	}

	public long getInvitation_id() {
		return invitation_id;
	}

	public long getGroup_id() {
		return group_id;
	}

	public String getChecked_in_at() {
		return checked_in_at;
	}

	public long getRanked_member_id() {
		return ranked_member_id;
	}

	public String getCustom_field_response() {
		return custom_field_response;
	}

	public String getClinch() {
		return clinch;
	}

	public long getIntegration_uids() {
		return integration_uids;
	}

	public String getChallonge_username() {
		return challonge_username;
	}

	public long getChallonge_user_id() {
		return challonge_user_id;
	}

	public String getChallonge_email_address_verified() {
		return challonge_email_address_verified;
	}

	public boolean isRemovable() {
		return removable;
	}

	public boolean isParticipatable_or_invitation_attached() {
		return participatable_or_invitation_attached;
	}

	public boolean isConfirm_removed() {
		return confirm_removed;
	}

	public boolean isInvitation_pending() {
		return invitation_pending;
	}

	public String getDisplay_name_with_invitation_email_address() {
		return display_name_with_invitation_email_address;
	}

	public String getEmail_hash() {
		return email_hash;
	}

	public String getUsername() {
		return username;
	}

	public String getDisplay_name() {
		return display_name;
	}

	public String getAttached_participatable_portrait_url() {
		return attached_participatable_portrait_url;
	}

	public boolean isCan_check_in() {
		return can_check_in;
	}

	public boolean isChecked_in() {
		return checked_in;
	}

	public boolean isReactivatable() {
		return reactivatable;
	}

	public boolean isCheck_in_open() {
		return check_in_open;
	}

	public ArrayList<String> getGroup_player_ids() {
		return group_player_ids;
	}

	public boolean isHas_irrelevant_seed() {
		return has_irrelevant_seed;
	}

	public String getOrdinal_seed() {
		return ordinal_seed;
	}
}
