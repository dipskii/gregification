import gregtech.recipes.builders.*

def fixUpWood(removeID, addID, log, plank) {
    crafting.remove(removeID)
    crafting.addShapeless(addID, item(plank) * 2, [item(log)])
    crafting.addShaped("${addID}_saw", item(plank) * 4, [
        [ore("craftingToolSaw")],
        [item(log)]
    ]
)

mods.gregtech.cutter.recipeBuilder()
    .inputs(item(log))
    .fluidInputs(fluid("water") * 4)
    .outputs(item(plank) * 6, item("gregtech:meta_dust", 1617) * 2)
    .duration(400)
    .EUt(7)
    .buildAndRegister();

mods.gregtech.cutter.recipeBuilder()
    .inputs(item(log))
    .fluidInputs(fluid("distilled_water") * 4)
    .outputs(item(plank) * 6, item("gregtech:meta_dust", 1617) * 2)
    .duration(300)
    .EUt(7)
    .buildAndRegister();

mods.gregtech.cutter.recipeBuilder()
    .inputs(item(log))
    .fluidInputs(fluid("lubricant") * 4)
    .outputs(item(plank) * 6, item("gregtech:meta_dust", 1617) * 2)
    .duration(200)
    .EUt(7)
    .buildAndRegister();

mods.gregtech.assembler.recipeBuilder()
    .inputs(item(log), item("minecraft:flint"))
    .outputs(item("minecraft:crafting_table"))
    .duration(80).EUt(6)
    .buildAndRegister();
}


fixUpWood("harvestcraft:minecraft_planks_meta_1_x4_pammaple",       "maple_planks",             "harvestcraft:pammaple",     "minecraft:planks:1")
fixUpWood("harvestcraft:minecraft_planks_meta_3_x4_pampaperbark",   "paperbark_planks",         "harvestcraft:pampaperbark", "minecraft:planks:3")
fixUpWood("harvestcraft:minecraft_planks_meta_3_x4_pamcinnamon",    "cinnamon_planks",          "harvestcraft:pampaperbark", "minecraft:planks:3")
fixUpWood("biomesoplenty:sacred_oak_planks",                        "sacred_oak_planks",        "biomesoplenty:log_0:4",     "biomesoplenty:planks_0")
fixUpWood("biomesoplenty:cherry_planks",                            "cherry_planks",            "biomesoplenty:log_0:5",     "biomesoplenty:planks_0:1")
fixUpWood("biomesoplenty:umbran_planks",                            "umbran_planks",            "biomesoplenty:log_0:6",     "biomesoplenty:planks_0:2")
fixUpWood("biomesoplenty:fir_planks",                               "fir_planks",               "biomesoplenty:log_0:7",     "biomesoplenty:planks_0:3")
fixUpWood("biomesoplenty:ethereal_planks",                          "ethereal_planks",          "biomesoplenty:log_1:4",     "biomesoplenty:planks_0:4")
fixUpWood("biomesoplenty:magic_planks",                             "magic_planks",             "biomesoplenty:log_1:5",     "biomesoplenty:planks_0:5")
fixUpWood("biomesoplenty:mangrove_planks",                          "mangrove_planks",          "biomesoplenty:log_1:6",     "biomesoplenty:planks_0:6")
fixUpWood("biomesoplenty:palm_planks",                              "palm_planks",              "biomesoplenty:log_1:7",     "biomesoplenty:planks_0:7")
fixUpWood("biomesoplenty:redwood_planks",                           "redwood_planks",           "biomesoplenty:log_2:4",     "biomesoplenty:planks_0:8")
fixUpWood("biomesoplenty:willow_planks",                            "willow_planks",            "biomesoplenty:log_2:5",     "biomesoplenty:planks_0:9")
fixUpWood("biomesoplenty:pine_planks",                              "pine_planks",              "biomesoplenty:log_2:6",     "biomesoplenty:planks_0:10")
fixUpWood("biomesoplenty:hellbark_planks",                          "hellbark_planks",          "biomesoplenty:log_2:7",     "biomesoplenty:planks_0:11")
fixUpWood("biomesoplenty:jacaranda_planks",                         "jacaranda_planks",         "biomesoplenty:log_3:4",     "biomesoplenty:planks_0:12")
fixUpWood("biomesoplenty:mahogany_planks",                          "mahogany_planks",          "biomesoplenty:log_3:5",     "biomesoplenty:planks_0:13")
fixUpWood("biomesoplenty:ebony_planks",                             "ebony_planks",             "biomesoplenty:log_3:6",     "biomesoplenty:planks_0:14")
fixUpWood("biomesoplenty:eucalyptus_planks",                        "eucalyptus_planks",        "biomesoplenty:log_3:7",     "biomesoplenty:planks_0:15")
fixUpWood("forestry:planks_larch",                                  "larch_planks",             "forestry:logs.0:0",         "forestry:planks.0:0")
fixUpWood("forestry:planks_teak",                                   "teak_planks",              "forestry:logs.0:1",         "forestry:planks.0:1")
fixUpWood("forestry:planks_acacia",                                 "desert_acacia_planks",     "forestry:logs.0:2",         "forestry:planks.0:2")
fixUpWood("forestry:planks_lime",                                   "lime_planks",              "forestry:logs.0:3",         "forestry:planks.0:3")
fixUpWood("forestry:planks_chesnut",                                "chesnut_planks",           "forestry:logs.1:0",         "forestry:planks.0:4")
fixUpWood("forestry:planks_wenge",                                  "wenge_planks",             "forestry:logs.1:1",         "forestry:planks.0:5")
fixUpWood("forestry:planks_baobab",                                 "baobab_planks",            "forestry:logs.1:2",         "forestry:planks.0:6")
fixUpWood("forestry:planks_sequoia",                                "sequoia_planks",           "forestry:logs.1:3",         "forestry:planks.0:7")
fixUpWood("forestry:planks_kapok",                                  "kapok_planks",             "forestry:logs.2:0",         "forestry:planks.0:8")
fixUpWood("forestry:planks_ebony",                                  "forestry_ebony_planks",    "forestry:logs.2:1",         "forestry:planks.0:9")
fixUpWood("forestry:planks_mahogany",                               "forestry_mahogany_planks", "forestry:logs.2:2",         "forestry:planks.0:10")
fixUpWood("forestry:planks_balsa",                                  "balsa_planks",             "forestry:logs.2:3",         "forestry:planks.0:11")
fixUpWood("forestry:planks_willow",                                 "forestry_willow_planks",   "forestry:logs.3:0",         "forestry:planks.0:12")
fixUpWood("forestry:planks_walnut",                                 "walnut_planks",            "forestry:logs.3:1",         "forestry:planks.0:13")
fixUpWood("forestry:planks_greenheart",                             "greenheart_planks",        "forestry:logs.3:2",         "forestry:planks.0:14")
fixUpWood("forestry:planks_cherry",                                 "forestry_cherry_planks",   "forestry:logs.3:3",         "forestry:planks.0:15")
fixUpWood("forestry:planks_mahoe",                                  "mahoe_planks",             "forestry:logs.4:0",         "forestry:planks.1:0")
fixUpWood("forestry:planks_poplar",                                 "poplar_planks",            "forestry:logs.4:1",         "forestry:planks.1:1")
fixUpWood("forestry:planks_palm",                                   "forestry_palm_planks",     "forestry:logs.4:2",         "forestry:planks.1:2")
fixUpWood("forestry:planks_papaya",                                 "papaya_planks",            "forestry:logs.4:3",         "forestry:planks.1:3")
fixUpWood("forestry:planks_pine",                                   "forestry_pine_planks",     "forestry:logs.5:0",         "forestry:planks.1:4")
fixUpWood("forestry:planks_plum",                                   "plum_planks",              "forestry:logs.5:1",         "forestry:planks.1:5")
fixUpWood("forestry:planks_maple",                                  "forestry_maple_planks",    "forestry:logs.5:2",         "forestry:planks.1:6")
fixUpWood("forestry:planks_citrus",                                 "citrus_planks",            "forestry:logs.5:3",         "forestry:planks.1:7")
fixUpWood("forestry:planks_giganteum",                              "giganteum_planks",         "forestry:logs.6:0",         "forestry:planks.1:8")
fixUpWood("forestry:planks_ipe",                                    "ipe_planks",               "forestry:logs.6:1",         "forestry:planks.1:9")
fixUpWood("forestry:planks_padauk",                                 "padauk_planks",            "forestry:logs.6:2",         "forestry:planks.1:10")
fixUpWood("forestry:planks_cocobolo",                               "cocobolo_planks",          "forestry:logs.6:3",         "forestry:planks.1:11")
fixUpWood("forestry:planks_zebrawood",                              "zebrawood_planks",         "forestry:logs.7:0",         "forestry:planks.1:12")