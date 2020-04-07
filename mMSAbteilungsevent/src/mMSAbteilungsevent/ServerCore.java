package mMSAbteilungsevent;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public class ServerCore extends JavaPlugin {

	@Override
	public void onEnable() {
		Bukkit.getConsoleSender().sendMessage(ChatColor.GREEN + "[Abteilungsevent-Plugin] wurde gestartet!");
	}
	@Override
	public void onDisable() {
		Bukkit.getConsoleSender().sendMessage(ChatColor.RED + "[Abteilungsevent-Plugin] wurde gestoppt!");
	}
}
