package dominationrankup.dominationrankup.utils;

import net.sacredlabyrinth.phaed.simpleclans.SimpleClans;
import org.bukkit.plugin.Plugin;

import static dominationrankup.dominationrankup.DominationRankup.pl;

/**
 *
 * @author Gusttavo13
 *
 */

public class SimpleClan extends Util {

    public SimpleClans Get() {

        Plugin simpleclan = pl.getServer().getPluginManager().getPlugin("SimpleClans");

        // may not be loaded
        if (simpleclan == null) {
            return null;
        } else if (!(simpleclan instanceof SimpleClans)) {
            return null;
        }

        return (SimpleClans)simpleclan;
    }
}