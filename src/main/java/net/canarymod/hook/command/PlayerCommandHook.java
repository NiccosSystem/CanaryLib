package net.canarymod.hook.command;


import net.canarymod.api.entity.living.humanoid.Player;
import net.canarymod.hook.CancelableHook;


/**
 * Player command hook. Contains a player and a command String Array
 *
 * @author Chris Ksoll
 */
public final class PlayerCommandHook extends CancelableHook {
    private Player player;
    private String[] command;

    public PlayerCommandHook(Player player, String[] textInput) {
        this.player = player;
        command = textInput;
    }

    /**
     * Get command that was issued by the {@link Player}
     *
     * @return
     */
    public String[] getCommand() {
        return command;
    }

    /**
     * Get the {@link Player} who issued this command
     *
     * @return
     */
    public Player getPlayer() {
        return player;
    }

    /**
     * Returns object array in this order: PLAYER, COMMAND
     */
    @Override
    public Object[] getDataSet() {
        return new Object[] { player, command };
    }
}
