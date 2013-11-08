package net.canarymod.api.entity.vehicle;

import net.canarymod.api.inventory.Hopper;

/**
 * HopperMinecart wrapper
 *
 * @author Jason (darkdiplomat)
 */
public interface HopperMinecart extends Minecart, Hopper {

    /**
     * Gets if the Minecart is blocked by an activator rail
     *
     * @return {@code true} if blocked; {@code false} if not
     */
    public boolean isBlocked();
}
