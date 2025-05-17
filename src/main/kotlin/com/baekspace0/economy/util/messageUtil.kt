package com.baekspace0.economy.util

import org.bukkit.Bukkit
import org.bukkit.ChatColor
import org.bukkit.command.CommandSender
import org.bukkit.entity.Player
import java.util.logging.Level

object messageUtil {
    private val PREFIX = "${ChatColor.GOLD}${ChatColor.BOLD}[ 돈 ]${ChatColor.RESET} "

    fun send(sender: CommandSender, message: String) {
        sender.sendMessage(PREFIX + message)
    }

    fun send(player: Player, message: String) {
        player.sendMessage(PREFIX + message)
    }

    fun broadcast(message: String) {
        Bukkit.broadcastMessage(PREFIX + message)
    }

    fun logInfo(message: String) {
        Bukkit.getLogger().log(Level.INFO, "[ 돈 ] $message")
    }

    fun logWarning(message: String) {
        Bukkit.getLogger().log(Level.WARNING, "[ 돈 ] $message")
    }

    fun logError(message: String) {
        Bukkit.getLogger().log(Level.SEVERE, "[ 돈 ] $message")
    }

    fun Player.msg(message: String) {
        this.sendMessage(PREFIX + message)
    }

    fun CommandSender.msg(message: String) {
        this.sendMessage(PREFIX + message)
    }
}