package github.Louwind.Spookyfall.core.init;

import com.google.common.base.Suppliers;
import github.Louwind.Features.impl.item.DebugStickItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;

import static net.minecraft.world.gen.feature.DefaultFeatureConfig.INSTANCE;

public class Items {

    public static final Item CAMPSITE_DEBUG_STICK = new DebugStickItem(new Identifier("spookyfall:campsite"), Suppliers.ofInstance(INSTANCE), new Item.Settings());

    public static final Item HAY_BALE_CART_DEBUG_STICK = new DebugStickItem(new Identifier("spookyfall:hay_bale_cart"), Suppliers.ofInstance(INSTANCE), new Item.Settings());

    public static final Item PUMPKIN_CART_DEBUG_STICK = new DebugStickItem(new Identifier("spookyfall:pumpkin_cart"), Suppliers.ofInstance(INSTANCE), new Item.Settings());

}
