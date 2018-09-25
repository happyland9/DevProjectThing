package me.philip.blockstand;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;



public class Main extends JavaPlugin{
	public void onEnable(){
		Bukkit.getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "Block Detector Enabled!");
		getServer().getPluginManager().registerEvents(new Events(), this); 
	}
}
