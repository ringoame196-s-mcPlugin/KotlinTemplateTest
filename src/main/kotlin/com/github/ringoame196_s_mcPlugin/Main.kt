package com.github.ringoame196_s_mcPlugin

import com.github.ringoame196_s_mcPlugin.events.Events
import org.bukkit.plugin.java.JavaPlugin

class Main : JavaPlugin() {
    override fun onEnable() {
        super.onEnable()
        val plugin = this
        server.pluginManager.registerEvents(Events(), plugin) // ココ修正テスト2
        // val command = getCommand("command")
        // command!!.setExecutor(Command())
        // command.tabCompleter = TabCompleter()
    }
}
