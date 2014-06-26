package me.surferdude999.skin;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;

public class Skin extends JavaPlugin implements Listener {
	
	private PlayerDisplayModifier factory;
	
	public void onEnable() {
		Bukkit.getServer().getPluginManager().registerEvents(this, this);
	}
	
public boolean onCommand(CommandSender sender, final Command cmd, final String commandLabel, final String[] args) {
	
	if (cmd.getName().equalsIgnoreCase("Skin")) {
	if (!sender.hasPermission("skin.change")) {
		sender.sendMessage(ChatColor.RED + "Type /buy to recieve this perk!");
	} else {
		Player p = (Player) sender;
		openGUI(p);
	}
}
	return true;
}
	private void openGUI(Player p) {
		Inventory inv = Bukkit.createInventory(null, 9, ChatColor.YELLOW + "Available Skins!");
		
		ItemStack pvp = new ItemStack (Material.SKULL_ITEM);
		ItemMeta pvpMeta = pvp.getItemMeta();
		pvpMeta.setDisplayName(ChatColor.YELLOW + "Unknowncall");
		List<String> lore = new ArrayList<String>();
		lore.add(ChatColor.GRAY + "The owner of MunchCraft!");
		pvpMeta.setLore(lore);
		pvp.setItemMeta(pvpMeta);
	
		ItemStack pb = new ItemStack (Material.GOLD_INGOT);
		ItemMeta pbMeta = pb.getItemMeta();
		pbMeta.setDisplayName(ChatColor.YELLOW + "SkyDoesMinecraft");
		List<String> lore2 = new ArrayList<String>();
		lore2.add(ChatColor.GRAY + "A famous youtuber!");
		pbMeta.setLore(lore2);
		pb.setItemMeta(pbMeta);
	
		ItemStack hub = new ItemStack (Material.EMERALD);
		ItemMeta hubMeta = hub.getItemMeta();
		hubMeta.setDisplayName(ChatColor.YELLOW + "CaptainSparklez");
		List<String> lore3 = new ArrayList<String>();
		lore3.add(ChatColor.GRAY + "A famous youtuber!");
		hubMeta.setLore(lore3);
		hub.setItemMeta(hubMeta);
		
		ItemStack cr = new ItemStack (Material.WOOL);
		ItemMeta crMeta = cr.getItemMeta();
		crMeta.setDisplayName(ChatColor.YELLOW + "Deadmau5");
		List<String> lore4 = new ArrayList<String>();
		lore4.add(ChatColor.GRAY + "A famous DJ who also plays Minecraft!");
		crMeta.setLore(lore4);
		cr.setItemMeta(crMeta);
		
		ItemStack sg = new ItemStack (Material.REDSTONE_BLOCK);
		ItemMeta sgMeta = sg.getItemMeta();
		sgMeta.setDisplayName(ChatColor.YELLOW + "RESET");
		List<String> lore5 = new ArrayList<String>();
		lore5.add(ChatColor.GRAY + "Switch back to your own skin!");
		sgMeta.setLore(lore5);
		sg.setItemMeta(sgMeta);
		
		inv.setItem(0, pvp);
		inv.setItem(8, sg);
		inv.setItem(2, hub);
		inv.setItem(6, cr);
		inv.setItem(4, pb);
	
		p.openInventory(inv);
		
	}
	
	@EventHandler
		public void onInventoryClick(InventoryClickEvent event) {
		if (!ChatColor.stripColor(event.getInventory().getName()).equalsIgnoreCase("Available Skins!"))
			return;
	
	Player player = (Player) event.getWhoClicked();
	event.setCancelled(true);
	
	if (event.getCurrentItem() == null || event.getCurrentItem().getType() == Material.AIR || !event.getCurrentItem().hasItemMeta()) {
		player.closeInventory();
		return;
}
	switch(event.getCurrentItem().getType()) {
	case SKULL_ITEM:
		factory = new PlayerDisplayModifier(this);
		factory.changeDisplay(player, "Unknowncall", player.getName());
		player.sendMessage(ChatColor.GREEN + "You now look exactly like Unknowncall!");
		player.closeInventory();
		break;
		
	case GOLD_INGOT:
		factory = new PlayerDisplayModifier(this);
		factory.changeDisplay(player, "SkythekidRS", player.getName());
		player.sendMessage(ChatColor.GREEN + "You now look exactly like SkyDoesMinecraft!");
		player.closeInventory();
		break;
		
	case EMERALD:
		factory = new PlayerDisplayModifier(this);
		factory.changeDisplay(player, "CaptainSparklez", player.getName());
		player.sendMessage(ChatColor.GREEN + "You now look exactly like CaptainSparklez!");
		player.closeInventory();
		break;
		
	case WOOL:
		factory = new PlayerDisplayModifier(this);
		factory.changeDisplay(player, "Deadmau5", player.getName());
		player.sendMessage(ChatColor.GREEN + "You now look exactly like Deadmau5!");
		player.closeInventory();
		break;
		
	case REDSTONE_BLOCK:
		factory = new PlayerDisplayModifier(this);
		factory.changeDisplay(player, player.getName(), player.getName());
		player.sendMessage(ChatColor.GREEN + "You are back to being yourself!");
		player.closeInventory();
		break;
		
	default:
		player.closeInventory();
		break;
	}
	
	
	
	}
	
	
	}



	








			
		
	


	

