package violentninjad.violentapi;
//Copyright ViolentNInjaD 2014

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import violentninjad.violentapi.proxy.IProxy;
import violentninjad.violentapi.reference.Reference;
import violentninjad.violentapi.utility.CraftingHelper;
import violentninjad.violentapi.utility.LogHelper;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.MOD_VERSION)
public class ViolentAPI {

    @Mod.Instance(Reference.MOD_ID)
    public static ViolentAPI Instance;

    @SidedProxy(clientSide = Reference.ProxyRef.CLIENT_PROXY, serverSide = Reference.ProxyRef.SERVER_PROXY)
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {

        LogHelper.info("ViolentAPI initialization has begun!");

    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {



        LogHelper.info("ViolentAPI initialization has completed!");

    }

}
