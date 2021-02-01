
package net.mcreator.moreores.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.AxeItem;

import net.mcreator.moreores.MoreOresModElements;

@MoreOresModElements.ModElement.Tag
public class EndisiteAxeItem extends MoreOresModElements.ModElement {
	@ObjectHolder("more_ores:endisite_axe")
	public static final Item block = null;
	public EndisiteAxeItem(MoreOresModElements instance) {
		super(instance, 23);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new AxeItem(new IItemTier() {
			public int getMaxUses() {
				return 1879;
			}

			public float getEfficiency() {
				return 10f;
			}

			public float getAttackDamage() {
				return 12f;
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
		}, 1, -3.3f, new Item.Properties().group(ItemGroup.TOOLS)) {
		}.setRegistryName("endisite_axe"));
	}
}
