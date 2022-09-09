package tech.webknox.realm.thing.Realm;

import org.bukkit.plugin.java.JavaPlugin;

import tech.webknox.realm.thing.Realm.command.maincommand;

import java.util.Objects;

public final class thing extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getLogger().info("thing has been enabled!");
        Objects.requireNonNull(getCommand("thing")).setExecutor(new maincommand());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
