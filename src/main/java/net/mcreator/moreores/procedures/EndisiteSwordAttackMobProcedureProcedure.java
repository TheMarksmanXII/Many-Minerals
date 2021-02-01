package net.mcreator.moreores.procedures;

import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.moreores.MoreOresModElements;

import java.util.Map;

@MoreOresModElements.ModElement.Tag
public class EndisiteSwordAttackMobProcedureProcedure extends MoreOresModElements.ModElement {
	public EndisiteSwordAttackMobProcedureProcedure(MoreOresModElements instance) {
		super(instance, 45);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				System.err.println("Failed to load dependency entity for procedure EndisiteSwordAttackMobProcedure!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.LEVITATION, (int) 60, (int) 1, (false), (true)));
	}
}
