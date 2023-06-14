package dev.mxace.examplepronounmcaddon;

import dev.mxace.pronounmc.api.PronounAPI;
import dev.mxace.pronounmc.api.pronounssets.OneOnesPronounsSet;

import org.bukkit.plugin.java.JavaPlugin;

import java.io.IOException;

public final class ExamplePronounMCAddon extends JavaPlugin {
    public static ExamplePronounMCAddon instance;

    @Override
    public void onEnable() {
        instance = this;

        PronounAPI.instance.unregisterPronounsSet(OneOnesPronounsSet.instance);

        try {
            PronounAPI.instance.loadPronounsSetsInPackage("dev.mxace.examplepronounmcaddon.pronounssets");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
