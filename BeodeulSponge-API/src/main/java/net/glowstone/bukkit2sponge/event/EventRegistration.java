package net.glowstone.bukkit2sponge.event;

import net.glowstone.bukkit2sponge.Bukkit2Sponge;
import org.spongepowered.api.event.Cancellable;
import org.spongepowered.api.event.Event;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.logging.Level;

/**
 * Container for a single object listening for some event.
 */
public final class EventRegistration {

    private final Object object;
    private final Method method;
    private final boolean ignoreCancelled;
    private final Class<?> clazz;

    public EventRegistration(Object object, Method method, boolean ignoreCancelled) {
        this.object = object;
        this.method = method;
        this.ignoreCancelled = ignoreCancelled;
        clazz = method.getParameterTypes()[0];
    }

    public Object getObject() {
        return object;
    }

    public void call(Event event) {
        if (ignoreCancelled && (event instanceof Cancellable) && ((Cancellable) event).isCancelled()) {
            return;
        }

        if (clazz.isAssignableFrom(event.getClass())) {
            try {
                method.invoke(object, event);
            } catch (InvocationTargetException e) {
                Bukkit2Sponge.instance.getLogger().log(Level.WARNING, "Event error", e.getTargetException());
            } catch (IllegalAccessException e) {
                Bukkit2Sponge.instance.getLogger().log(Level.WARNING, "Event error", e);
            }
        }
    }
}
