package dominationrankup.dominationrankup.utils;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.permissions.Permission;

import java.util.Objects;
import java.util.UUID;

public class Util {

    public Permission permission = null;

    public static String ToString(Location location) {
        if(location == null)
            return "";
        else
            return String.format("%s,%s,%s,%s,%s,%s", location.getX(),location.getY(),location.getZ(),
                    location.getYaw(),location.getPitch(),
                    Objects.requireNonNull(location.getWorld()).getName());
    }

    public static Location toLocation(String location) {
        if(location == null) return null;
        if(location.isEmpty()) return null;
        String[] loc = location.split(",");
        double x = Double.parseDouble(loc[0]);
        double y = Double.parseDouble(loc[1]);
        double z = Double.parseDouble(loc[2]);
        float yaw = Float.parseFloat(loc[3]);
        float pitch = Float.parseFloat(loc[4]);
        World world = Bukkit.getWorld(loc[5]);
        return new Location(world, x, y, z,yaw,pitch);
    }

    public static void SendMessage(String msg) {
        Bukkit.getConsoleSender().sendMessage(parseColor(msg));
    }

    public static void SendMessage(String msg,Object[] args) {
        Bukkit.getConsoleSender().sendMessage(parseColor(String.format(msg,args)));
    }

    public static void SendMessage(Player player,String msg) {
        player.sendMessage(parseColor(msg));
    }

    public static void SendMessage(Player player, String msg, Object[] args) {
        player.sendMessage(parseColor(String.format(msg,args)));
    }

    public void BrcstMsg(String msg) {
        Bukkit.getServer().broadcastMessage(parseColor(msg));
    }

    public void BrcstMsg(String msg,Object[] args) {
        Bukkit.getServer().broadcastMessage(parseColor(String.format(msg,args)));
    }

    public static String parseColor(String message) {
        for (ChatColor color : ChatColor.values()) {
            message = message.replaceAll(String.format("&%c", color.getChar()), color.toString());
        }
        return message;
    }

    public boolean hasPermission(String PlayerName, String Permission) {

        return Objects.requireNonNull(Bukkit.getServer().getPlayer(PlayerName)).hasPermission(Permission);
    }

    public boolean hasPermission(Player player, String Permission) {
        return player.hasPermission(permission);
    }

    public long getCurrentMilli() {
        return System.currentTimeMillis();
    }

}
