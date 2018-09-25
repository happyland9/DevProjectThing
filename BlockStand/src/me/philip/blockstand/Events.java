package me.philip.blockstand;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.craftbukkit.v1_8_R1.entity.CraftPlayer;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;

import net.minecraft.server.v1_8_R1.EnumParticle;
import net.minecraft.server.v1_8_R1.PacketPlayOutWorldParticles;

public class Events implements Listener{
	@EventHandler
	public void onMove(PlayerMoveEvent event){
		Player player = event.getPlayer();
		Block block = player.getLocation().getBlock().getRelative(BlockFace.DOWN); 
		
		if(block.getType() == Material.WOOL){
			Bukkit.getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "OK");
			PacketPlayOutWorldParticles packet = new PacketPlayOutWorldParticles(
					EnumParticle.REDSTONE, 
					true,
					(float)player.getLocation().getX(),
					(float)player.getLocation().getY(),
					(float)player.getLocation().getZ(),
					(int)0.1, //x
					1, //y
					0, //z
					5,
					50,
					null
					); 
			((CraftPlayer) player).getHandle().playerConnection.sendPacket(packet);
		}
		
	}
	
}
