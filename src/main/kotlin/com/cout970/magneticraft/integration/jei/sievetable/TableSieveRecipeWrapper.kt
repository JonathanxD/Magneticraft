package com.cout970.magneticraft.integration.jei.sievetable

import com.cout970.magneticraft.api.internal.registries.machines.tablesieve.TableSieveRecipe
import com.cout970.magneticraft.api.registries.machines.tablesieve.ITableSieveRecipe
import mezz.jei.api.recipe.IRecipeWrapper
import net.minecraft.client.Minecraft
import net.minecraftforge.fluids.FluidStack

/**
 * Created by cout970 on 23/07/2016.
 */
class TableSieveRecipeWrapper(val recipe: ITableSieveRecipe) : IRecipeWrapper {

    override fun drawAnimations(minecraft: Minecraft, recipeWidth: Int, recipeHeight: Int) {}

    override fun drawInfo(minecraft: Minecraft, recipeWidth: Int, recipeHeight: Int, mouseX: Int, mouseY: Int) {}

    override fun getTooltipStrings(mouseX: Int, mouseY: Int): MutableList<String>? = mutableListOf()

    override fun getFluidInputs(): MutableList<FluidStack>? = mutableListOf()

    override fun handleClick(minecraft: Minecraft, mouseX: Int, mouseY: Int, mouseButton: Int): Boolean = false

    override fun getOutputs(): MutableList<Any?>? = mutableListOf(recipe.primaryOutput, recipe.secondaryOutput)

    override fun getFluidOutputs(): MutableList<FluidStack>? = mutableListOf()

    override fun getInputs(): MutableList<Any?>? = mutableListOf(recipe.input)
}