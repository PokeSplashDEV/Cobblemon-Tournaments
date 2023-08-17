package org.pokesplash.cobblemontournaments;

import org.pokesplash.cobblemontournaments.bracket.TournamentHandler;
import org.pokesplash.cobblemontournaments.bracket.response.ParticipantResponse;
import org.pokesplash.cobblemontournaments.provider.ConfigProvider;
import org.pokesplash.cobblemontournaments.provider.RecordProvider;
import org.pokesplash.cobblemontournaments.types.Tournament;

import java.util.Timer;
import java.util.TimerTask;

public class CobblemonTournaments
{
	public static final String MOD_ID = "cobblemontournaments";

	public static void init() {
		ConfigProvider.loadConfigs();
		RecordProvider.loadRecords();

		Timer timer = new Timer();

		timer.schedule(new TimerTask() {
			@Override
			public void run() {
				TournamentHandler.deleteTournament(13353176);
			}
		}, 1000 * 20);
	}
}
