package com.mc4cs;

import java.util.HashMap;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin{
	public static Events events;
	public static HashMap<String, Long> onlineHashMap = new HashMap<String, Long>();
	public static HashMap<String, Long> offlineHashMap = new HashMap<String, Long>();
	
	@Override
	public void onEnable() {
		events = new Events();
		this.getServer().getPluginManager().registerEvents(events, this);
	}
	@Override
	public void onDisable() {
		
	}
}
