
package net.mcreator.moreores.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.HoeItem;

import net.mcreator.moreores.MoreOresModElements;

@MoreOresModElements.ModElement.Tag
public class EndisiteHoeItem extends MoreOresModElements.ModElement {
	@ObjectHolder("more_ores:endisite_hoe")
	public static final Item block = null;
	public EndisiteHoeItem(MoreOresModElements instance) {
		super(instance, 25);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new HoeItem(new IItemTier() {
			public int getMaxUses() {
				return 1300;
			}

			public float getEfficiency() {
				return 10f;
			}

			public float getAttackDamage() {
				return 3f;
			}

			public int getHarvestLevel() {
				return 4;
			}

			public int getEnchantability() {
				return 17;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(EndisiteingotItem.block, (int) (1)));
			}
		}, -2.6f, new Item.Properties().group(ItemGroup.TOOLS)) {
		}.setRegistryName("endisite_hoe"));
	}
}
