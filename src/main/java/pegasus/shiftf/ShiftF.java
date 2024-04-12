package pegasus.shiftf;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerSwapHandItemsEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class ShiftF extends JavaPlugin {
    @Override
    public void onEnable() {
        Bukkit.getPluginManager().registerEvents(new Listener() {
            @EventHandler
            public void onHandSwap(PlayerSwapHandItemsEvent e) {
                var player = e.getPlayer();
                if (!player.isSneaking()) return;

                e.setCancelled(true);
                player.chat("/ds");
            }

        }, this);
    }
}
