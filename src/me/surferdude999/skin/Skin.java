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
		Inventory inv = Bukkit.createInventory(null, 27, ChatColor.YELLOW + "Available Skins!");
		
		ItemStack sb = new ItemStack (Material.REDSTONE_TORCH_ON);
		ItemMeta sbMeta = sb.getItemMeta();
		sbMeta.setDisplayName(ChatColor.YELLOW + "SethBling");
		List<String> loresb = new ArrayList<String>();
		loresb.add(ChatColor.GRAY + "A famous youtuber!");
		sbMeta.setLore(loresb);
		sb.setItemMeta(sbMeta);
		
		ItemStack v = new ItemStack (Material.DIAMOND_SWORD);
		ItemMeta vMeta = v.getItemMeta();
		vMeta.setDisplayName(ChatColor.YELLOW + "TheVikray23");
		List<String> lorev = new ArrayList<String>();
		lorev.add(ChatColor.GRAY + "A youtuber here on MunchCraft!");
		vMeta.setLore(lorev);
		v.setItemMeta(vMeta);
		
		ItemStack x = new ItemStack (Material.IRON_INGOT);
		ItemMeta xMeta = x.getItemMeta();
		xMeta.setDisplayName(ChatColor.YELLOW + "Xephos");
		List<String> lorex = new ArrayList<String>();
		lorex.add(ChatColor.GRAY + "A famous youtuber!");
		xMeta.setLore(lorex);
		x.setItemMeta(xMeta);
		
		ItemStack h = new ItemStack (Material.DIAMOND_PICKAXE);
		ItemMeta hMeta = h.getItemMeta();
		hMeta.setDisplayName(ChatColor.YELLOW + "Honeydew");
		List<String> loreh = new ArrayList<String>();
		loreh.add(ChatColor.GRAY + "A famous youtuber!");
		hMeta.setLore(loreh);
		h.setItemMeta(hMeta);
		
		ItemStack baj = new ItemStack (Material.BOW);
		ItemMeta bajMeta = baj.getItemMeta();
		bajMeta.setDisplayName(ChatColor.YELLOW + "BajanCanadian");
		List<String> lorebaj = new ArrayList<String>();
		lorebaj.add(ChatColor.GRAY + "A famous youtuber!");
		bajMeta.setLore(lorebaj);
		baj.setItemMeta(bajMeta);
		
		ItemStack cq = new ItemStack (Material.CAKE);
		ItemMeta cqMeta = cq.getItemMeta();
		cqMeta.setDisplayName(ChatColor.YELLOW + "iHasCupquake");
		List<String> lorecq = new ArrayList<String>();
		lorecq.add(ChatColor.GRAY + "A famous youtuber!");
		cqMeta.setLore(lorecq);
		cq.setItemMeta(cqMeta);
		
		ItemStack asf = new ItemStack (Material.BONE);
		ItemMeta asfMeta = asf.getItemMeta();
		asfMeta.setDisplayName(ChatColor.YELLOW + "ASFJerome");
		List<String> loreasf = new ArrayList<String>();
		loreasf.add(ChatColor.GRAY + "A famous youtuber!");
		asfMeta.setLore(loreasf);
		asf.setItemMeta(asfMeta);
		
		ItemStack unknown = new ItemStack (Material.SKULL_ITEM);
		ItemMeta unknownMeta = unknown.getItemMeta();
		unknownMeta.setDisplayName(ChatColor.YELLOW + "Unknowncall");
		List<String> lore = new ArrayList<String>();
		lore.add(ChatColor.GRAY + "The owner of MunchCraft!");
		unknownMeta.setLore(lore);
		unknown.setItemMeta(unknownMeta);
	
		ItemStack sky = new ItemStack (Material.GOLD_INGOT);
		ItemMeta skyMeta = sky.getItemMeta();
		skyMeta.setDisplayName(ChatColor.YELLOW + "SkyDoesMinecraft");
		List<String> lore2 = new ArrayList<String>();
		lore2.add(ChatColor.GRAY + "A famous youtuber!");
		skyMeta.setLore(lore2);
		sky.setItemMeta(skyMeta);
	
		ItemStack cs = new ItemStack (Material.EMERALD);
		ItemMeta csMeta = cs.getItemMeta();
		csMeta.setDisplayName(ChatColor.YELLOW + "CaptainSparklez");
		List<String> lore3 = new ArrayList<String>();
		lore3.add(ChatColor.GRAY + "A famous youtuber!");
		csMeta.setLore(lore3);
		cs.setItemMeta(csMeta);
		
		ItemStack dm = new ItemStack (Material.WOOL);
		ItemMeta dmMeta = dm.getItemMeta();
		dmMeta.setDisplayName(ChatColor.YELLOW + "Deadmau5");
		List<String> lore4 = new ArrayList<String>();
		lore4.add(ChatColor.GRAY + "A famous DJ who also plays Minecraft!");
		dmMeta.setLore(lore4);
		dm.setItemMeta(dmMeta);
		
		ItemStack reset = new ItemStack (Material.REDSTONE_BLOCK);
		ItemMeta resetMeta = reset.getItemMeta();
		resetMeta.setDisplayName(ChatColor.YELLOW + "RESET");
		List<String> lore5 = new ArrayList<String>();
		lore5.add(ChatColor.GRAY + "Switch back to your own skin!");
		resetMeta.setLore(lore5);
		reset.setItemMeta(resetMeta);
		
		inv.setItem(0, unknown);
		inv.setItem(13, reset);
		inv.setItem(2, cs);
		inv.setItem(6, dm);
		inv.setItem(4, sky);
		inv.setItem(8, asf);
		inv.setItem(10, cq);
		inv.setItem(16, baj);
		inv.setItem(21, h);
		inv.setItem(23, x);
		inv.setItem(18, v);
		inv.setItem(26, sb);
	
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
		
	case BONE:
		factory = new PlayerDisplayModifier(this);
		factory.changeDisplay(player, "ASFJerome", player.getName());
		player.sendMessage(ChatColor.GREEN + "You now look exactly like ASFJerome!");
		player.closeInventory();
		break; 
		
	case CAKE:
		factory = new PlayerDisplayModifier(this);
		factory.changeDisplay(player, "iHasCupquake", player.getName());
		player.sendMessage(ChatColor.GREEN + "You now look exactly like iHasCupquake!");
		player.closeInventory();
		break;
		
	case BOW:
		factory = new PlayerDisplayModifier(this);
		factory.changeDisplay(player, "BajanCanadian", player.getName());
		player.sendMessage(ChatColor.GREEN + "You now look exactly like BajanCanadian!");
		player.closeInventory();
		break;
		
	case DIAMOND_PICKAXE:
		factory = new PlayerDisplayModifier(this);
		factory.changeDisplay(player, "Honeydew", player.getName());
		player.sendMessage(ChatColor.GREEN + "You now look exactly like Honeydew!");
		player.closeInventory();
		break;
	case IRON_INGOT:
		factory = new PlayerDisplayModifier(this);
		factory.changeDisplay(player, "Xephos", player.getName());
		player.sendMessage(ChatColor.GREEN + "You now look exactly like Xephos!");
		player.closeInventory();
		break;
		
	case DIAMOND_SWORD:
		factory = new PlayerDisplayModifier(this);
		factory.changeDisplay(player, "TheVikray23", player.getName());
		player.sendMessage(ChatColor.GREEN + "You now look exactly like TheVikRay23!");
		player.closeInventory();
		break;
		
	case REDSTONE_TORCH_ON:
		factory = new PlayerDisplayModifier(this);
		factory.changeDisplay(player, "SethBling", player.getName());
		player.sendMessage(ChatColor.GREEN + "You now look exactly like SethBling!");
		player.closeInventory();
		break;
		
		
	default:
		player.closeInventory();
		break;
	}
	
	
	
	}
	
	
	}



	








			
		
	


	

