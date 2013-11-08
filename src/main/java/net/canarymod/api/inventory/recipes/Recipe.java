package net.canarymod.api.inventory.recipes;

import net.canarymod.api.inventory.CraftingMatrix;
import net.canarymod.api.inventory.Item;

/**
 * IRecipe wrapper interface
 *
 * @author Jason (darkdiplomat)
 */
public interface Recipe {

    /**
     * Gets the Recipe's resulting {@link Item}
     *
     * @return the resulting {@link Item}
     */
    public Item getResult();

    /**
     * Gets the size of the Recipe
     *
     * @return the recipe size
     */
    public int getRecipeSize();

    /**
     * Gets if the Recipe is Shapeless or not
     *
     * @return {@code true} if shapeless; {@code false} if not
     */
    public boolean isShapeless();

    /**
     * Gets if the Recipe is Shaped or not
     *
     * @return {@code true} if shaped; {@code false} if not
     */
    public boolean isShaped();

    /**
     * Checks the CraftingMatrix if it matches the Recipe
     *
     * @param matrix
     *         the matrix to check
     *
     * @return {@code true} if matches; {@code false} if not
     */
    public boolean matchesMatrix(CraftingMatrix matrix);

}
