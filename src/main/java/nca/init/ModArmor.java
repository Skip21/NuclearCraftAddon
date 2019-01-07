package nca.init;

import nca.items.ItemModArmor;
import nca.util.Reference;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;



@EventBusSubscriber

public class ModArmor {

	public static ArmorMaterial MATERIALNAME = EnumHelper.addArmorMaterial("hazmatsuit", Reference.MODID+":hazmatsuit", 50, new int[] {0,1,2,0}, 14, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 1.0f);

	public static ItemArmor HELMET_HAZMAT;
	public static ItemArmor CHESTPLATE_HAZMAT;
	public static ItemArmor LEGGINGS_HAZMAT;
	public static ItemArmor BOOTS_HAZMAT;

	public static void init(){
		HELMET_HAZMAT = new ItemModArmor(MATERIALNAME, 1, EntityEquipmentSlot.HEAD, "helmet_hazmat");
		HELMET_HAZMAT = new ItemModArmor(MATERIALNAME, 1, EntityEquipmentSlot.CHEST, "helmet_hazmat");
		HELMET_HAZMAT = new ItemModArmor(MATERIALNAME, 2, EntityEquipmentSlot.LEGS, "helmet_hazmat");
		HELMET_HAZMAT = new ItemModArmor(MATERIALNAME, 1, EntityEquipmentSlot.FEET, "helmet_hazmat");

	}

	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event){

	}

	@SubscribeEvent
	public static void registerRenders(ModelRegistryEvent event){

	}

	void registerRender(Item item){

	}

}
