package codingkids.mc.sword;

import codingkids.mc.sword.proxy.CommonProxy;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by Wilson Wu on 2020/02/11.
 */
@Mod(modid = Reference.MODID, version = Reference.VERSION, name = Reference.NAME,
        acceptedMinecraftVersions = Reference.ACCEPTED_VERSION)
public class Sword {

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static CommonProxy proxy;

    public static Item mySword;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event){
        mySword = new ItemSword(EnumHelper.addToolMaterial("demo_sword", 4, 1000, 100F, 50000F, 100));
        mySword.setRegistryName("demo_sword");
        mySword.setTranslationKey("cksword.demo_sword");
        mySword.setCreativeTab(CreativeTabs.COMBAT);
    }

    @EventHandler
    public void init(FMLInitializationEvent event){

    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event){

    }

}
