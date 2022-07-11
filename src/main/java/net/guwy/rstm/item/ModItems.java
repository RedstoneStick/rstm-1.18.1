package net.guwy.rstm.item;

import net.guwy.rstm.ModCreativeModTabs;
import net.guwy.rstm.RsTm;
import net.guwy.rstm.item.custom.BurnableItem;
import net.guwy.rstm.item.custom.BoomStickItem;
import net.guwy.rstm.item.custom.TooltipItem;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, RsTm.MOD_ID);


    // Tools
    public static final RegistryObject<Item> BOOMSTICK = ITEMS.register("boomstick",
            () -> new BoomStickItem(new Item.Properties().tab(ModCreativeModTabs.EQUIPMENT)
                    .durability(1)));

    public static final RegistryObject<Item> TITANIUM_SWORD = ITEMS.register("titanium_sword",
            () -> new SwordItem(ModTiers.TITANIUM, 3, -3f,
                    new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));

    public static final RegistryObject<Item> TITANIUM_AXE = ITEMS.register("titanium_axe",
            () -> new AxeItem(ModTiers.TITANIUM, 5, -3.5f,
                    new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));

    public static final RegistryObject<Item> TITANIUM_PICKAXE = ITEMS.register("titanium_pickaxe",
            () -> new PickaxeItem(ModTiers.TITANIUM, 1, -2.8f,
                    new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));

    public static final RegistryObject<Item> TITANIUM_SHOVEL = ITEMS.register("titanium_shovel",
            () -> new ShovelItem(ModTiers.TITANIUM, 1, -3f,
                    new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));

    public static final RegistryObject<Item> TITANIUM_HOE = ITEMS.register("titanium_hoe",
            () -> new HoeItem(ModTiers.TITANIUM, -3, 0f,
                    new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));

    //public static final RegistryObject<Item> SCRAP_METAL_SWORD = ITEMS.register("scrap_metal_sword",
    //        () -> new SwordItem(ModTiers.TITANIUM, 3, -3f,
    //                new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));



    // Ingots
    public static final RegistryObject<Item> MAGNESIUM_INGOT = ITEMS.register("magnesium_ingot",
            () -> new Item(new Item.Properties().tab(ModCreativeModTabs.MATERIALS)));

    public static final RegistryObject<Item> PLATINUM_INGOT = ITEMS.register("platinum_ingot",
            () -> new Item(new Item.Properties().tab(ModCreativeModTabs.MATERIALS)));

    public static final RegistryObject<Item> THORIUM_INGOT = ITEMS.register("thorium_ingot",
            () -> new Item(new Item.Properties().tab(ModCreativeModTabs.MATERIALS)));

    public static final RegistryObject<Item> TITANIUM_INGOT = ITEMS.register("titanium_ingot",
            () -> new Item(new Item.Properties().tab(ModCreativeModTabs.MATERIALS)));

    public static final RegistryObject<Item> URANIUM_INGOT = ITEMS.register("uranium_ingot",
            () -> new Item(new Item.Properties().tab(ModCreativeModTabs.MATERIALS)));

    public static final RegistryObject<Item> STEEL_INGOT = ITEMS.register("steel_ingot",
            () -> new Item(new Item.Properties().tab(ModCreativeModTabs.MATERIALS)));



    // Nuggets
    public static final RegistryObject<Item> MAGNESIUM_NUGGET = ITEMS.register("magnesium_nugget",
            () -> new Item(new Item.Properties().tab(ModCreativeModTabs.MATERIALS)));

    public static final RegistryObject<Item> PALLADIUM_NUGGET = ITEMS.register("palladium_nugget",
            () -> new Item(new Item.Properties().tab(ModCreativeModTabs.MATERIALS)));

    public static final RegistryObject<Item> PLATINUM_NUGGET = ITEMS.register("platinum_nugget",
            () -> new Item(new Item.Properties().tab(ModCreativeModTabs.MATERIALS)));

    public static final RegistryObject<Item> THORIUM_NUGGET = ITEMS.register("thorium_nugget",
            () -> new Item(new Item.Properties().tab(ModCreativeModTabs.MATERIALS)));

    public static final RegistryObject<Item> TITANIUM_NUGGET = ITEMS.register("titanium_nugget",
            () -> new Item(new Item.Properties().tab(ModCreativeModTabs.MATERIALS)));

    public static final RegistryObject<Item> URANIUM_NUGGET = ITEMS.register("uranium_nugget",
            () -> new Item(new Item.Properties().tab(ModCreativeModTabs.MATERIALS)));



    // Dusts
    public static final RegistryObject<Item> FLUORITE_DUST = ITEMS.register("fluorite_dust",
            () -> new Item(new Item.Properties().tab(ModCreativeModTabs.MATERIALS)));

    public static final RegistryObject<Item> MAGNESIUM_DUST = ITEMS.register("magnesium_dust",
            () -> new Item(new Item.Properties().tab(ModCreativeModTabs.MATERIALS)));

    public static final RegistryObject<Item> NITER_DUST = ITEMS.register("niter_dust",
            () -> new Item(new Item.Properties().tab(ModCreativeModTabs.MATERIALS)));

    public static final RegistryObject<Item> PLATINUM_DUST = ITEMS.register("platinum_dust",
            () -> new Item(new Item.Properties().tab(ModCreativeModTabs.MATERIALS)));

    public static final RegistryObject<Item> SULFUR_DUST = ITEMS.register("sulfur_dust",
            () -> new Item(new Item.Properties().tab(ModCreativeModTabs.MATERIALS)));

    public static final RegistryObject<Item> THORIUM_DUST = ITEMS.register("thorium_dust",
            () -> new Item(new Item.Properties().tab(ModCreativeModTabs.MATERIALS)));

    public static final RegistryObject<Item> TITANIUM_DUST = ITEMS.register("titanium_dust",
            () -> new Item(new Item.Properties().tab(ModCreativeModTabs.MATERIALS)));

    public static final RegistryObject<Item> URANIUM_DUST = ITEMS.register("uranium_dust",
            () -> new Item(new Item.Properties().tab(ModCreativeModTabs.MATERIALS)));



    // Crushed
    public static final RegistryObject<Item> FLUORITE_CLUSTER = ITEMS.register("fluorite_cluster",
            () -> new Item(new Item.Properties().tab(ModCreativeModTabs.MATERIALS)));

    public static final RegistryObject<Item> MAGNESIUM_CRUSHED = ITEMS.register("magnesium_crushed",
            () -> new Item(new Item.Properties().tab(ModCreativeModTabs.MATERIALS)));

    public static final RegistryObject<Item> PLATINUM_CRUSHED = ITEMS.register("platinum_crushed",
            () -> new Item(new Item.Properties().tab(ModCreativeModTabs.MATERIALS)));

    public static final RegistryObject<Item> THORIUM_CRUSHED = ITEMS.register("thorium_crushed",
            () -> new Item(new Item.Properties().tab(ModCreativeModTabs.MATERIALS)));

    public static final RegistryObject<Item> TITANIUM_CRUSHED = ITEMS.register("titanium_crushed",
            () -> new Item(new Item.Properties().tab(ModCreativeModTabs.MATERIALS)));

    public static final RegistryObject<Item> URANIUM_CRUSHED = ITEMS.register("uranium_crushed",
            () -> new Item(new Item.Properties().tab(ModCreativeModTabs.MATERIALS)));



    // Raw Ores
    public static final RegistryObject<Item> MAGNESIUM_RAW = ITEMS.register("magnesium_raw",
            () -> new Item(new Item.Properties().tab(ModCreativeModTabs.MATERIALS)));

    public static final RegistryObject<Item> THORIUM_RAW = ITEMS.register("thorium_raw",
            () -> new Item(new Item.Properties().tab(ModCreativeModTabs.MATERIALS)));

    public static final RegistryObject<Item> TITANIUM_RAW = ITEMS.register("titanium_raw",
            () -> new Item(new Item.Properties().tab(ModCreativeModTabs.MATERIALS)));

    public static final RegistryObject<Item> URANIUM_RAW = ITEMS.register("uranium_raw",
            () -> new Item(new Item.Properties().tab(ModCreativeModTabs.MATERIALS)));



    // Misc Materials
    public static final RegistryObject<Item> SCRAP_METAL = ITEMS.register("scrap_metal",
            () -> new TooltipItem(new Item.Properties().tab(ModCreativeModTabs.MATERIALS),
                    "tooltip.rstm.scrap_metal"));

    public static final RegistryObject<Item> ASH = ITEMS.register("ash",
            () -> new TooltipItem(new Item.Properties().tab(ModCreativeModTabs.MATERIALS),
                    "tooltip.rstm.ash"));

    public static final RegistryObject<Item> DUST = ITEMS.register("dust",
            () -> new TooltipItem(new Item.Properties().tab(ModCreativeModTabs.MATERIALS),
                    "tooltip.rstm.dust"));



    // Components
    public static final RegistryObject<Item> IGNITER = ITEMS.register("igniter", () -> new TooltipItem(
            new Item.Properties().tab(ModCreativeModTabs.MATERIALS), "tooltip.rstm.crafting_material"));



    // Circuits
    public static final RegistryObject<Item> CIRCUIT_BASIC = ITEMS.register(
            "circuit_basic", () -> new TooltipItem(new Item.Properties().
                    tab(ModCreativeModTabs.MATERIALS), "tooltip.rstm.crafting_material"));

    public static final RegistryObject<Item> CIRCUIT_BASIC_INCOMPLETE = ITEMS.register(
            "circuit_basic_incomplete", () -> new TooltipItem(new Item.Properties().
                    tab(ModCreativeModTabs.MATERIALS), "tooltip.rstm.crafting_material"));

    public static final RegistryObject<Item> CIRCUIT_ENHANCED = ITEMS.register(
            "circuit_enhanced", () -> new TooltipItem(new Item.Properties().
                    tab(ModCreativeModTabs.MATERIALS), "tooltip.rstm.crafting_material"));

    public static final RegistryObject<Item> CIRCUIT_ENHANCED_INCOMPLETE = ITEMS.register(
            "circuit_enhanced_incomplete", () -> new TooltipItem(new Item.Properties().
                    tab(ModCreativeModTabs.MATERIALS), "tooltip.rstm.crafting_material"));

    public static final RegistryObject<Item> CIRCUIT_ADVANCED = ITEMS.register(
            "circuit_advanced", () -> new TooltipItem(new Item.Properties().
                    tab(ModCreativeModTabs.MATERIALS), "tooltip.rstm.crafting_material"));

    public static final RegistryObject<Item> CIRCUIT_ADVANCED_INCOMPLETE = ITEMS.register(
            "circuit_advanced_incomplete", () -> new TooltipItem(new Item.Properties().
                    tab(ModCreativeModTabs.MATERIALS), "tooltip.rstm.crafting_material"));

    public static final RegistryObject<Item> CIRCUIT_INDUSTRIAL_GRADE = ITEMS.register(
            "circuit_industrial_grade", () -> new TooltipItem(new Item.Properties().
                    tab(ModCreativeModTabs.MATERIALS), "tooltip.rstm.crafting_material"));

    public static final RegistryObject<Item> CIRCUIT_INDUSTRIAL_GRADE_INCOMPLETE = ITEMS.register(
            "circuit_industrial_grade_incomplete", () -> new TooltipItem(new Item.Properties().
                    tab(ModCreativeModTabs.MATERIALS), "tooltip.rstm.crafting_material"));

    public static final RegistryObject<Item> CIRCUIT_OVERCLOCKED = ITEMS.register(
            "circuit_overclocked", () -> new TooltipItem(new Item.Properties().
                    tab(ModCreativeModTabs.MATERIALS), "tooltip.rstm.crafting_material"));

    public static final RegistryObject<Item> CIRCUIT_OVERCLOCKED_INCOMPLETE = ITEMS.register(
            "circuit_overclocked_incomplete", () -> new TooltipItem(new Item.Properties().
                    tab(ModCreativeModTabs.MATERIALS), "tooltip.rstm.crafting_material"));

    public static final RegistryObject<Item> CIRCUIT_RELIABLE = ITEMS.register(
            "circuit_reliable", () -> new TooltipItem(new Item.Properties().
                    tab(ModCreativeModTabs.MATERIALS), "tooltip.rstm.crafting_material"));

    public static final RegistryObject<Item> CIRCUIT_RELIABLE_ASSEMBLY = ITEMS.register(
            "circuit_reliable_assembly", () -> new TooltipItem(new Item.Properties().
                    tab(ModCreativeModTabs.MATERIALS), "tooltip.rstm.crafting_material"));

    public static final RegistryObject<Item> CIRCUIT_RELIABLE_INCOMPLETE = ITEMS.register(
            "circuit_reliable_incomplete", () -> new TooltipItem(new Item.Properties().
                    tab(ModCreativeModTabs.MATERIALS), "tooltip.rstm.crafting_material"));

    public static final RegistryObject<Item> CIRCUIT_AVIONICS = ITEMS.register(
            "circuit_avionics", () -> new TooltipItem(new Item.Properties().
                    tab(ModCreativeModTabs.MATERIALS), "tooltip.rstm.crafting_material"));

    public static final RegistryObject<Item> CIRCUIT_AVIONICS_INCOMPLETE = ITEMS.register(
            "circuit_avionics_incomplete", () -> new TooltipItem(new Item.Properties().
                    tab(ModCreativeModTabs.MATERIALS), "tooltip.rstm.crafting_material"));

    public static final RegistryObject<Item> CIRCUIT_CAPACITIVE = ITEMS.register(
            "circuit_capacitive", () -> new TooltipItem(new Item.Properties().
                    tab(ModCreativeModTabs.MATERIALS), "tooltip.rstm.crafting_material"));

    public static final RegistryObject<Item> CIRCUIT_CAPACITIVE_INCOMPLETE = ITEMS.register(
            "circuit_capacitive_incomplete", () -> new TooltipItem(new Item.Properties().
                    tab(ModCreativeModTabs.MATERIALS), "tooltip.rstm.crafting_material"));



    // Plates
    public static final RegistryObject<Item> SHEET_STEEL = ITEMS.register(
            "sheet_steel", () -> new TooltipItem(new Item.Properties().
                    tab(ModCreativeModTabs.MATERIALS), "tooltip.rstm.crafting_material"));

    public static final RegistryObject<Item> SHEET_TITANIUM = ITEMS.register(
            "sheet_titanium", () -> new TooltipItem(new Item.Properties().
                    tab(ModCreativeModTabs.MATERIALS), "tooltip.rstm.crafting_material"));



    // Wires
    public static final RegistryObject<Item> WIRE_COPPER = ITEMS.register(
            "wire_copper", () -> new TooltipItem(new Item.Properties().
                    tab(ModCreativeModTabs.MATERIALS), "tooltip.rstm.crafting_material"));

    public static final RegistryObject<Item> WIRE_GOLD = ITEMS.register(
            "wire_gold", () -> new TooltipItem(new Item.Properties().
                    tab(ModCreativeModTabs.MATERIALS), "tooltip.rstm.crafting_material"));

    public static final RegistryObject<Item> WIRE_STEEL = ITEMS.register(
            "wire_steel", () -> new TooltipItem(new Item.Properties().
                    tab(ModCreativeModTabs.MATERIALS), "tooltip.rstm.crafting_material"));



    // Coils
    public static final RegistryObject<Item> COIL_COPPER = ITEMS.register(
            "coil_copper", () -> new TooltipItem(new Item.Properties().
                    tab(ModCreativeModTabs.MATERIALS), "tooltip.rstm.crafting_material"));

    public static final RegistryObject<Item> COIL_GOLD = ITEMS.register(
            "coil_gold", () -> new TooltipItem(new Item.Properties().
                    tab(ModCreativeModTabs.MATERIALS), "tooltip.rstm.crafting_material"));



    // Foils
    public static final RegistryObject<Item> FOIL_COPPER = ITEMS.register(
            "foil_copper", () -> new TooltipItem(new Item.Properties().
                    tab(ModCreativeModTabs.MATERIALS), "tooltip.rstm.crafting_material"));

    public static final RegistryObject<Item> FOIL_IRON = ITEMS.register(
            "foil_iron", () -> new TooltipItem(new Item.Properties().
                    tab(ModCreativeModTabs.MATERIALS), "tooltip.rstm.crafting_material"));

    public static final RegistryObject<Item> FOIL_STEEL = ITEMS.register(
            "foil_steel", () -> new TooltipItem(new Item.Properties().
                    tab(ModCreativeModTabs.MATERIALS), "tooltip.rstm.crafting_material"));

    public static final RegistryObject<Item> FOIL_TITANIUM = ITEMS.register(
            "foil_titanium", () -> new TooltipItem(new Item.Properties().
                    tab(ModCreativeModTabs.MATERIALS), "tooltip.rstm.crafting_material"));



    // Motors
    public static final RegistryObject<Item> MOTOR = ITEMS.register(
            "motor", () -> new TooltipItem(new Item.Properties().
                    tab(ModCreativeModTabs.MATERIALS), "tooltip.rstm.crafting_material"));



    // Panels
    public static final RegistryObject<Item> PANEL_GLASS_REINFORCED = ITEMS.register(
            "panel_glass_reinforced", () -> new TooltipItem(new Item.Properties().
                    tab(ModCreativeModTabs.MATERIALS), "tooltip.rstm.crafting_material"));

    public static final RegistryObject<Item> PANEL_INSULATOR = ITEMS.register(
            "panel_insulator", () -> new TooltipItem(new Item.Properties().
                    tab(ModCreativeModTabs.MATERIALS), "tooltip.rstm.crafting_material"));



    // Solid Fuels
    public static final RegistryObject<Item> ROCKET_FUEL_SUGAR = ITEMS.register("rocket_fuel_sugar",
            () -> new BurnableItem(new Item.Properties().tab(ModCreativeModTabs.MATERIALS), 800));

    public static final RegistryObject<Item> ROCKET_FUEL_SOLID = ITEMS.register("rocket_fuel_solid",
            () -> new BurnableItem(new Item.Properties().tab(ModCreativeModTabs.MATERIALS), 3200));



    // Foods
    public static final RegistryObject<Item> NOODLES_CHICKEN_XL = ITEMS.register("noodles_chicken_xl",
            () -> new Item(new Item.Properties().tab(ModCreativeModTabs.EQUIPMENT).food(ModFoods.NOODLES_CHICKEN_XL)));

    public static final RegistryObject<Item> NOODLES_CURRY = ITEMS.register("noodles_curry",
            () -> new Item(new Item.Properties().tab(ModCreativeModTabs.EQUIPMENT).food(ModFoods.NOODLES_CURRY)));



    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
