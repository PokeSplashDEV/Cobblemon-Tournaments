package org.pokesplash.cobblemontournaments.forge;

import org.pokesplash.cobblemontournaments.CobblemonTournaments;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(CobblemonTournaments.MOD_ID)
public class CobblemonTournamentsForge {
	public CobblemonTournamentsForge() {
		CobblemonTournaments.init();
	}
}