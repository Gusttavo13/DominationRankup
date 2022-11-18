package dominationrankup.dominationrankup;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;


public final class DominationRankup extends JavaPlugin {

    public static DominationRankup pl;

    @Override
    public void onEnable() {
        pl = this;
        Bukkit.getConsoleSender().sendMessage("§e[DominationRankup] §aIniciando.");
    }

    @Override
    public void onDisable() {
        Bukkit.getConsoleSender().sendMessage("§e[DominationRankup] §aDesligando.");
    }
}
