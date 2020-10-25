package github.Louwind.Spookyfall.core;

import github.Louwind.Spookyfall.core.init.Items;
import net.fabricmc.api.ModInitializer;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static net.minecraft.util.registry.Registry.*;

public class Spookyfall implements ModInitializer {

    @Override
    public void onInitialize() {
        Registry.register(ITEM, new Identifier("spookyfall:campsite_debug_stick"), Items.CAMPSITE_DEBUG_STICK);
        Registry.register(ITEM, new Identifier("spookyfall:hay_bale_cart_debug_stick"), Items.HAY_BALE_CART_DEBUG_STICK);
        Registry.register(ITEM, new Identifier("spookyfall:pumpkin_cart_debug_stick"), Items.PUMPKIN_CART_DEBUG_STICK);
    }

}
