package batman123579.moarores;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.common.network.NetworkMod.SidedPacketHandler;
import cpw.mods.fml.common.SidedProxy;
import batman123579.moarores.CommonProxy;

@NetworkMod(clientSideRequired=true,serverSideRequired=false, //Whether client side and server side are needed
clientPacketHandlerSpec = @SidedPacketHandler(channels = {"TutorialMod"}, packetHandler = PacketHandler.class), //For clientside packet handling
serverPacketHandlerSpec = @SidedPacketHandler(channels = {"TutorialMod"}, packetHandler = ServerPacketHandler.class)) //For serverside packet handling


@Mod(modid = "evenmoarores", name = "Even Moar Ores?", version = "Beta 0.1")


public class mod_MainClass {
	
	@SidedProxy(clientSide = "batman123579.moarores.ClientProxy", serverSide = "batman123579.moarores.CommonProxy") //Tells Forge the location of your proxies
	public static CommonProxy proxy;


@Instance("evenmoarfood") //The instance, this is very important later on
public static mod_MainClass instance = new mod_MainClass();


	
	
	//Creative Tab
	public static CreativeTabs EvenMoarOresTab;

	
//Add Blocks/Items
	
	//Blocks
	
	public static Block HematiteOre;
	
	
	//Items
	
	public static Item Hematite;
	
	EventManager eventmanager = new EventManager();
	
	@EventHandler
	public void InitTutorialMod(FMLInitializationEvent event){ //Your main initialization method

		//MULTIPLAYER ABILITY
		NetworkRegistry.instance().registerGuiHandler(this, proxy); //Registers the class that deals with GUI data

		
		//Registers CreativeTab
		EvenMoarOresTab = new EvenMoarOresTab(CreativeTabs.getNextID(), "Even Moar Tabs");

		
		//Renders Blocks/Items
		
		HematiteOre = new HematiteOre(3401).setHardness(6.0F).setResistance(10.0F).setStepSound(Block.soundStoneFootstep).setUnlocalizedName("HematiteOre");
		

		Hematite = new Hematite(22611).setUnlocalizedName("Hematite");
		
		

		
		//Register Block
		
		GameRegistry.registerBlock(HematiteOre,"MoarFoods.HematiteOre");
		
		
		//Add the Name
		LanguageRegistry.addName(HematiteOre, "Hematite Ore");

		
		LanguageRegistry.addName(Hematite, "Hematite");

		
//Recipes
		
		 //Crafting
		
		
		
		//Furnace
		
		GameRegistry.addSmelting(HematiteOre.blockID, new ItemStack(Hematite, 1), 0.7F);
		
//End of file!
		
	}
}