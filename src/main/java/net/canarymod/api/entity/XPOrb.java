package net.canarymod.api.entity;

import net.canarymod.api.entity.living.humanoid.Player;

/**
 * XPOrb wrapper
 *
 * @author Jason (darkdiplomat)
 */
public interface XPOrb extends Entity {

    /**
     * Gets the age of the XPOrb.<br>
     * When this reaches 6000, the orb is destroyed
     *
     * @return orb age
     */
    public short getOrbAge();

    /**
     * Sets the age of the XPOrb.
     *
     * @param age
     *         the age of the orb
     */
    public void setOrbAge(short age);

    /**
     * Gets the ticks before being allowed to be picked up.<br>
     * If this is less than 0, the orb can never be picked up.
     *
     * @return pick up delay
     */
    public int getPickUpDelay();

    /**
     * Sets the ticks before being allowed to be picked up.
     *
     * @param delay
     *         the pick up delay
     */
    public void setPickUpDelay(int delay);

    /**
     * Gets the health of the orb.<br>
     * Max of 255
     *
     * @return the orb health
     */
    public short getHealth();

    /**
     * Sets the health of the orb. Maxed at 255.
     *
     * @param health
     *         the orb health
     */
    public void setHealth(short health);

    /**
     * Gets the XP value of the orb.
     *
     * @return the XP value
     */
    public short getXPValue();

    /**
     * Sets the XP value of the orb.
     *
     * @param value
     *         the XP value
     */
    public void setXPValue(short value);

    /**
     * Gets the closest {@link Player} to the XP Orb.<br>
     * The Orb will gravitate towards the player.
     *
     * @return the closest {@link Player} or {@code null} if no player is in range
     */
    public Player getClosestPlayer();

}
