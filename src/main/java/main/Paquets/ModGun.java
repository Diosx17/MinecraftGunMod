package main.Paquets;

import main.gun;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.*;


public class ModGun {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, gun.MODID);

    public static final RegistryObject<Item> AMMO = ITEMS.register("ammo", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> GUN = ITEMS.register("gun", () -> new Item(new Item.Properties()));
    
}