
package net.mcreator.moreores.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.World;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.entity.LivingEntity;

import net.mcreator.moreores.procedures.EndisiteSwordAttackMobProcedureProcedure;
import net.mcreator.moreores.MoreOresModElements;

import java.util.Map;
import java.util.HashMap;

@MoreOresModElements.ModElement.Tag
public class EndisiteSwordItem extends MoreOresModElements.ModElement {
	@ObjectHolder("more_ores:endisite_sword")
	public static final Item block = null;
	public EndisiteSwordItem(MoreOresModElements instance) {
		super(instance, 17);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 1999;
			}

			public float getEfficiency() {
				return 0f;
			}

			public float getAttackDamage() {
				return 8f;
			}

			public int getHarvestLevel() {
				return 0;
			}

			public int getEnchantability() {
				return 17;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(EndisiteingotItem.block, (int) (1)));
			}
		}, 3, -2.4f, new Item.Properties().group(ItemGroup.COMBAT)) {
			@Override
			public boolean hitEntity(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
				boolean retval = super.hitEntity(itemstack, entity, sourceentity);
				double x = entity.getPosX();
				double y = entity.getPosY();
				double z = entity.getPosZ();
				World world = entity.world;
				{
					Map<String, Object> $_dependencies = new HashMap<>();
					$_dependencies.put("entity", entity);
					EndisiteSwordAttackMobProcedureProcedure.executeProcedure($_dependencies);
				}
				return retval;
			}
		}.setRegistryName("endisite_sword"));
	}
}
