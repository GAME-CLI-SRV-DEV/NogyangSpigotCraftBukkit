package net.glowstone.bukkit2sponge.plugin;

import com.google.inject.Injector;
import net.glowstone.bukkit2sponge.Bukkit2Sponge;
import net.glowstone.bukkit2sponge.guice.ShinyPluginGuiceModule;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.spongepowered.api.plugin.Plugin;
import org.spongepowered.api.plugin.PluginContainer;

import java.util.Optional;

/**
 * Implementation of {@link PluginContainer}.
 */
public final class ShinyPluginContainer implements PluginContainer {

    private final String id;
    private final String name;
    private final String version;
    private final Logger logger;
    private final Object instance;

    public ShinyPluginContainer(Class<?> pluginClass) {
        Plugin info = pluginClass.getAnnotation(Plugin.class);
        this.id = info.id();
        this.name = info.name();
        this.version = info.version();
        this.logger = LoggerFactory.getLogger(this.id);

        Injector injector = Bukkit2Sponge.instance.getInjector().createChildInjector(new ShinyPluginGuiceModule(this));
        this.instance = injector.getInstance(pluginClass);
    }

    @Override
    public String getId() {
        return this.id;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public Optional<String> getVersion() {
        return Optional.of(this.version);
    }

    @Override
    public Optional<Object> getInstance() {
        return Optional.of(this.instance);
    }

    public Logger getLogger() {
        return this.logger;
    }
}
