package main.Paquets;

import main.gun;
import net.minecraft.world.item.BowItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.common.ForgeTier;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;

public class ModGun {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, gun.MODID);

    public static final RegistryObject<Item> AMMO = ITEMS.register("ammo", () -> new Item(new Item.Properties().stacksTo(64)));
    public static final RegistryObject<Item> GUN = ITEMS.register("gun", () -> new BowItem(new Item.Properties().stacksTo(1)));
    
    public static class Tiers {
        public static final Tier Gun_Tier = new ForgeTier(2,800,1.5f,3,350,null,() -> Ingredient.of(ModGun.AMMO.get()));
    }
}
