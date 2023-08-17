package org.pokesplash.cobblemontournaments;

import org.pokesplash.cobblemontournaments.provider.ConfigProvider;
import org.pokesplash.cobblemontournaments.provider.RecordProvider;

public class CobblemonTournaments
{
	public static final String MOD_ID = "cobblemontournaments";

	public static void init() {
		ConfigProvider configs = new ConfigProvider();
		configs.loadConfigs();

		RecordProvider records = new RecordProvider();
		records.loadRecords();
	}
}
