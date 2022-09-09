package tech.webknox.realm.thing.Realm.command;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import tech.webknox.realm.thing.Realm.thing;

public class maincommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (cmd.getName().equalsIgnoreCase("thing")) {
            thing.getPlugin(thing.class).getLogger().info("thing has been enabled!");
            return true;
        }
        return false;
    }
}
