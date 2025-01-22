package net.glowstone.bukkit2sponge.plugin;

import net.glowstone.bukkit2sponge.Bukkit2Sponge;
import org.bukkit.Server;

import java.io.File;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class GlowstoneConnector {

    @SuppressWarnings("unchecked")
    public static List<URL> getSpongePlugins(Server server) {
        List<File> files;

        try {
            Method method = server.getClass().getMethod("getSpongePlugins");

            files = (List<File>) method.invoke(server);
        } catch (Exception ex) {
            //ex.printStackTrace(); // may be an unsupported platform - ignore
            return null;
        }

        List<URL> urls = new ArrayList<>(files.size());
        for (File file : files) {
            Bukkit2Sponge.instance.getLogger().info("SpongeAPI plugin from Glowstone: " + file.getPath());
            try {
                urls.add(file.toURI().toURL());
            } catch (MalformedURLException ex) {
                ex.printStackTrace();
            }
        }

        return urls;
    }
}
