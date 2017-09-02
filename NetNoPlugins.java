package NetNoPlugins;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class NetNoPlugins
  extends JavaPlugin
  implements Listener
{
  @Override
public void onEnable()
  {
	  getServer().getPluginManager().registerEvents(this, this);
  }
  
  @EventHandler(priority=EventPriority.HIGHEST)
  public void onPlayerCommandPreprocess(PlayerCommandPreprocessEvent event)
  {
	Player p = event.getPlayer();
    if ((event.getMessage().toLowerCase().startsWith("/plugins ")) ||
    		(event.getMessage().toLowerCase().startsWith("/bukkit")) ||
    		(event.getMessage().toLowerCase().startsWith("/bukkit:pl")) ||
    		(event.getMessage().toLowerCase().startsWith("/bukkit:plugins")) ||
    		(event.getMessage().toLowerCase().startsWith("/spigot")) ||
    		(event.getMessage().toLowerCase().startsWith("/plugins")) ||
    		(event.getMessage().toLowerCase().equals("/pl")) ||
    		(event.getMessage().toLowerCase().startsWith("/pl ")) ||
    		(event.getMessage().toLowerCase().startsWith("/ver")) ||
    		(event.getMessage().toLowerCase().startsWith("/gc")) ||
    		(event.getMessage().toLowerCase().startsWith("/version")) ||
    		(event.getMessage().toLowerCase().startsWith("/help")) ||
    		(event.getMessage().toLowerCase().startsWith("/?"))) 
    {
      event.setCancelled(true);
      p.sendMessage("Nie masz uprawnien!");
      if (p.isOp()) {
       event.setCancelled(false);
    }
  }
  }
}