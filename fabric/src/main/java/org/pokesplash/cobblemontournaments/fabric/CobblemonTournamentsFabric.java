package org.pokesplash.cobblemontournaments.fabric;

import org.pokesplash.cobblemontournaments.CobblemonTournaments;
import net.fabricmc.api.ModInitializer;

public class CobblemonTournamentsFabric implements ModInitializer {
	@Override
	public void onInitialize() {
		CobblemonTournaments.init();
	}
}