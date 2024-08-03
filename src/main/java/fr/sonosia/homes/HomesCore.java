package fr.sonosia.homes;

import lombok.Getter;
import lombok.SneakyThrows;
import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

@Getter
public class HomesCore extends JavaPlugin {

    final String prefix = "[Homes]";
    @Getter
    private static HomesCore INSTANCE;
    public static PluginManager pm = Bukkit.getPluginManager();

    public void onDisable() {
        super.onDisable();
        System.out.println(prefix + " Unloaded.");
    }

    @SneakyThrows
    @Override
    public void onEnable() {

        INSTANCE = this;
        Bukkit.getLogger().info(prefix + " - Loading...");
    }

}
