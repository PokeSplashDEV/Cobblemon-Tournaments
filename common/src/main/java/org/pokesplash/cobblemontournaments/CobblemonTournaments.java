package org.pokesplash.cobblemontournaments;

import org.pokesplash.cobblemontournaments.bracket.APIHandler;
import org.pokesplash.cobblemontournaments.provider.ConfigProvider;
import org.pokesplash.cobblemontournaments.provider.RecordProvider;
import org.pokesplash.cobblemontournaments.types.ChallongeTournament;

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
				ChallongeTournament tourney = APIHandler.getTournament(13365979);

				System.out.println(tourney.getName());
			}
		}, 1000 * 20);
	}
}
