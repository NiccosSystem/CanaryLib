package net.canarymod.api.entity;

import net.canarymod.api.world.position.Location;

/**
 * Ender Eye wrapper
 *
 * @author Jason (darkdiplomat)
 */
public interface EnderEye extends Entity {

    /**
     * Gets the Target X, typically the direction of the Stronghold
     *
     * @return the target X
     */
    public double getTargetX();

    /**
     * Gets the Target Y, typically the direction of the Stronghold
     *
     * @return the target Y
     */
    public double getTargetY();

    /**
     * Gets the Target Z, typically the direction of the Stronghold
     *
     * @return the target Z
     */
    public double getTargetZ();

    /**
     * Sets the target location the EnderEye will move to.<br>
     * This will also set despawnTimer to 0 and randomly reset dropAfterDespawn
     *
     * @param targetX
     *         the X coordinate to move towards
     * @param targetY
     *         the Y coordinate to move towards
     * @param targetZ
     *         the Z coordiante to move towards
     */
    public void moveTowards(double targetX, int targetY, double targetZ);

    /**
     * Sets the target location the EnderEye will move to.<br>
     * This will also set despawnTimer to 0 and randomly reset dropAfterDespawn
     *
     * @param location
     *         the {@link Location} to move towards
     */
    public void moveTowards(Location location);

    /**
     * Gets the current despawn ticks. When it reaches 80, the EnderEye despawns
     *
     * @return the current despawn ticks
     */
    public int getDespawnTimer(); // went it reaches 80 its done

    /**
     * Sets the current despawn ticks.
     *
     * @param despawn
     *         the amount of despawn ticks
     */
    public void setDespawnTimer(int despawn);

    /**
     * Gets whether the EnderEye will shatter or drop after despawn
     *
     * @return {@code true} if drops; {@code false} if shatter
     */
    public boolean dropAfterDespawn();

    /**
     * Sets whether the EnderEye will shatter or drop after despawn
     *
     * @param drop
     *         {@code true} for drops; {@code false} for shatter
     */
    public void setDropAfterDespawn(boolean drop);
}
