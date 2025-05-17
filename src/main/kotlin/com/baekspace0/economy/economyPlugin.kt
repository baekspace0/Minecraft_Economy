package com.baekspace0.economy

import org.bukkit.plugin.java.JavaPlugin

class economyPlugin : JavaPlugin() {

    override fun onEnable() {
        // Plugin startup logic
        logger.info("Economy Plugin has been enabled!")
    }

    override fun onDisable() {
        // Plugin shutdown logic
        logger.info("Economy Plugin has been disabled!")
    }
}
