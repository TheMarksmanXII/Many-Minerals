
package net.mcreator.moreores.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.moreores.MoreOresModElements;

@MoreOresModElements.ModElement.Tag
public class EndisiteShovelItem extends MoreOresModElements.ModElement {
	@ObjectHolder("more_ores:endisite_shovel")
	public static final Item block = null;
	public EndisiteShovelItem(MoreOresModElements instance) {
		super(instance, 27);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ShovelItem(new IItemTier() {
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
		}, 1, -2.7000000000000002f, new Item.Properties().group(ItemGroup.TOOLS)) {
		}.setRegistryName("endisite_shovel"));
	}
}
