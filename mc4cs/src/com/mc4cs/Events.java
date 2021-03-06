package com.mc4cs;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class Events implements Listener{
	
	
	@EventHandler
	public void onJoin(PlayerJoinEvent e){
		Player p = e.getPlayer();
		Long time = System.currentTimeMillis();
		Main.onlineHashMap.put(p.getName(), time);
	}
	@EventHandler
	public void onLeave(PlayerQuitEvent e){
		Player p = e.getPlayer();
		Long time = System.currentTimeMillis();
		Long timeLoggedIn = Main.onlineHashMap.get(p.getName());
		Main.offlineHashMap.put(p.getName(), time-timeLoggedIn);
	}
}
