package com.example.template;

import org.bukkit.plugin.java.JavaPlugin;
import org.jspecify.annotations.NullMarked;

@NullMarked
public final class TemplatePlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        getSLF4JLogger().info("Hello World!");
    }

}
