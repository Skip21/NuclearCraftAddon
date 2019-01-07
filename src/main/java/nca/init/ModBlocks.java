package nca.init;


import nca.blocks.MoissaniteOre;
import nca.blocks.BunkerBlocks;
import nca.blocks.FakeDiamond;
import nca.blocks.Ore;
import nca.blocks.Microwave;
import nca.blocks.NCABlockDoor;
import nca.blocks.TritiumLamp;
import nca.blocks.TritiumLightFrame;
import nca.tab.NCAddonTab;
import nca.util.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber(modid=Reference.MODID)
public class ModBlocks {

	public static Block fakediamond;
	public static Block microwave;
	public static Block reactordoor;
	public static Block moissaniteore;
	
 

	//Bunker Blocks
	public static Block oldconcrete; 
	public static Block tritiumlightframe;
	
	public static Block tritiumlampr;
	public static Block tritiumlampg;
	public static Block tritiumlampb;
	public static Block tritiumlampy;
	


	public static void init() {
		fakediamond = new FakeDiamond("fake_diamond", Material.IRON);
		microwave = new Microwave("microwave", Material.IRON);
		reactordoor = new NCABlockDoor("reactor_door", Material.IRON); 
		
		
		moissaniteore = new MoissaniteOre("moissanite_ore", Material.ROCK); 
		moissaniteore.setHardness(2f);
		
		
		//Bunker Blocks
		oldconcrete = new BunkerBlocks("old_concrete", Material.ROCK);  
		tritiumlightframe = new TritiumLightFrame("tritium_light_frame", Material.GROUND);

		tritiumlampr = new TritiumLamp("tritium_lamp_r", Material.GROUND);
		tritiumlampg = new TritiumLamp("tritium_lamp_g", Material.GROUND);
		tritiumlampb = new TritiumLamp("tritium_lamp_b", Material.GROUND);
		tritiumlampy = new TritiumLamp("tritium_lamp_y", Material.GROUND);

		//Creative Tab
		fakediamond.setCreativeTab(NCAddonTab.NC_ADDON_TAB);
		microwave.setCreativeTab(NCAddonTab.NC_ADDON_TAB);
		reactordoor.setCreativeTab(NCAddonTab.NC_ADDON_TAB); 
		moissaniteore.setCreativeTab(NCAddonTab.NC_ADDON_TAB);


		//Bunker Blocks
		oldconcrete.setCreativeTab(NCAddonTab.NC_ADDON_TAB); 
		tritiumlightframe.setCreativeTab(NCAddonTab.NC_ADDON_TAB); 

		tritiumlampr.setCreativeTab(NCAddonTab.NC_ADDON_TAB);
		tritiumlampg.setCreativeTab(NCAddonTab.NC_ADDON_TAB);
		tritiumlampb.setCreativeTab(NCAddonTab.NC_ADDON_TAB);
		tritiumlampy.setCreativeTab(NCAddonTab.NC_ADDON_TAB);
		
	}

	@SubscribeEvent
	public static void registerBlocks(RegistryEvent.Register<Block> event) {
		event.getRegistry().registerAll(fakediamond);
		event.getRegistry().registerAll(microwave);
		event.getRegistry().registerAll(reactordoor);
		event.getRegistry().registerAll(moissaniteore);



		//Bunker Blocks
		event.getRegistry().registerAll(oldconcrete);
		event.getRegistry().registerAll(tritiumlightframe);

		event.getRegistry().registerAll(tritiumlampr);
		event.getRegistry().registerAll(tritiumlampg);
		event.getRegistry().registerAll(tritiumlampb);
		event.getRegistry().registerAll(tritiumlampy);
	}

	@SubscribeEvent
	public static void regiterItemBlocks(RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(new ItemBlock(fakediamond).setRegistryName(fakediamond.getRegistryName()));
		event.getRegistry().registerAll(new ItemBlock(microwave).setRegistryName(microwave.getRegistryName()));
		event.getRegistry().registerAll(new ItemBlock(moissaniteore).setRegistryName(moissaniteore.getRegistryName()));



		//Bunker Blocks
		event.getRegistry().registerAll(new ItemBlock(oldconcrete).setRegistryName(oldconcrete.getRegistryName()));
		event.getRegistry().registerAll(new ItemBlock(tritiumlightframe).setRegistryName(tritiumlightframe.getRegistryName()));
		
		event.getRegistry().registerAll(new ItemBlock(tritiumlampr).setRegistryName(tritiumlampr.getRegistryName()));
		event.getRegistry().registerAll(new ItemBlock(tritiumlampg).setRegistryName(tritiumlampg.getRegistryName()));
		event.getRegistry().registerAll(new ItemBlock(tritiumlampb).setRegistryName(tritiumlampb.getRegistryName()));
		event.getRegistry().registerAll(new ItemBlock(tritiumlampy).setRegistryName(tritiumlampy.getRegistryName()));
		
	}

	@SubscribeEvent
	public static void registerRenders(ModelRegistryEvent event) {
		registerRender(Item.getItemFromBlock(fakediamond));
		registerRender(Item.getItemFromBlock(microwave));
		registerRender(Item.getItemFromBlock(reactordoor));
		registerRender(Item.getItemFromBlock(moissaniteore));


		//Bunker Blocks
		registerRender(Item.getItemFromBlock(oldconcrete));
		registerRender(Item.getItemFromBlock(tritiumlightframe));

		registerRender(Item.getItemFromBlock(tritiumlampr));
		registerRender(Item.getItemFromBlock(tritiumlampg));
		registerRender(Item.getItemFromBlock(tritiumlampb));
		registerRender(Item.getItemFromBlock(tritiumlampy));
		

	}

	public static void registerRender(Item item ) {
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation( item.getRegistryName(), "inventory"));

	}

}



