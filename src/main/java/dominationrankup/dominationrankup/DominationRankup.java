package dominationrankup.dominationrankup;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class DominationRankup extends JavaPlugin {

    @Override
    public void onEnable() {
        Bukkit.getConsoleSender().sendMessage("§e[DominationRankup] §aIniciando.");
    }

    @Override
    public void onDisable() {
        Bukkit.getConsoleSender().sendMessage("§e[DominationRankup] §aDesligando.");
    }
}
