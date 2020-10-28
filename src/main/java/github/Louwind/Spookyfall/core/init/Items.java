package github.Louwind.Spookyfall.core.init;

import github.Louwind.Features.impl.item.DebugStickItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;

public class Items {

    public static final Item CAMPSITE_DEBUG_STICK = new DebugStickItem(new Identifier("spookyfall:campsite"), new Item.Settings());

    public static final Item HAY_BALE_CART_DEBUG_STICK = new DebugStickItem(new Identifier("spookyfall:hay_bale_cart"), new Item.Settings());

    public static final Item PUMPKIN_CART_DEBUG_STICK = new DebugStickItem(new Identifier("spookyfall:pumpkin_cart"), new Item.Settings());

}
