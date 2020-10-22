package github.Louwind.Spookyfall.core.init;

import com.google.common.base.Suppliers;
import github.Louwind.Features.impl.item.DebugStickItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;

import static net.minecraft.world.gen.feature.DefaultFeatureConfig.INSTANCE;

public class Items {

    public static final Item CAMPSITE_DEBUG_STICK = new DebugStickItem(new Identifier("spookyfall:campsite"), Suppliers.ofInstance(INSTANCE), new Item.Settings());

}
