// paper
crafting.addShapeless('log_to_dust', item('gregtech:meta_dust', 1617) * 4, [ore('logWood'), ore('toolMortar')])
crafting.addShapeless('plank_to_dust', item('gregtech:meta_dust', 1617) * 1, [ore('plankWood'), ore('toolMortar')])
crafting.addShaped('wood_paper', item('minecraft:paper') * 2, [
        [item('gregtech:meta_dust', 1617), item('gregtech:meta_dust', 1617), item('gregtech:meta_dust', 1617)],
        [item('gregtech:meta_dust', 1617), fluid('water'), item('gregtech:meta_dust', 1617)],
        [item('gregtech:meta_dust', 1617), item('gregtech:meta_dust', 1617), item('gregtech:meta_dust', 1617)]
])

// carpets
crafting.remove('minecraft:white_carpet')
crafting.addShaped('white_carpet', item('minecraft:carpet', 0) * 1, [
        [item('minecraft:wool'), item('minecraft:wool')],
        ]
)

crafting.remove('minecraft:orange_carpet')
crafting.addShaped('orange_carpet', item('minecraft:carpet', 1) * 1, [
        [item('minecraft:wool', 1), item('minecraft:wool', 1)],
        ]
)

crafting.remove('minecraft:magenta_carpet')
crafting.addShaped('magenta_carpet', item('minecraft:carpet', 2) * 1, [
        [item('minecraft:wool', 2), item('minecraft:wool', 2)],
        ]
)

crafting.remove('minecraft:light_blue_carpet')
crafting.addShaped('light_blue_carpet', item('minecraft:carpet', 3) * 1, [
        [item('minecraft:wool', 3), item('minecraft:wool', 3)],
        ]
)

crafting.remove('minecraft:yellow_carpet')
crafting.addShaped('yellow_carpet', item('minecraft:carpet', 4) * 1, [
        [item('minecraft:wool', 4), item('minecraft:wool', 4)],
        ]
)

crafting.remove('minecraft:lime_carpet')
crafting.addShaped('lime_carpet', item('minecraft:carpet', 5) * 1, [
        [item('minecraft:wool', 5), item('minecraft:wool', 5)],
        ]
)

crafting.remove('minecraft:pink_carpet')
crafting.addShaped('pink_carpet', item('minecraft:carpet', 6) * 1, [
        [item('minecraft:wool', 6), item('minecraft:wool', 6)],
        ]
)

crafting.remove('minecraft:gray_carpet')
crafting.addShaped('gray_carpet', item('minecraft:carpet', 7) * 1, [
        [item('minecraft:wool', 7), item('minecraft:wool', 7)],
        ]
)

crafting.remove('minecraft:light_gray_carpet')
crafting.addShaped('light_gray_carpet', item('minecraft:carpet', 8) * 1, [
        [item('minecraft:wool', 8), item('minecraft:wool', 8)],
        ]
)

crafting.remove('minecraft:cyan_carpet')
crafting.addShaped('cyan_carpet', item('minecraft:carpet', 9) * 1, [
        [item('minecraft:wool', 9), item('minecraft:wool', 9)],
        ]
)

crafting.remove('minecraft:purple_carpet')
crafting.addShaped('purple_carpet', item('minecraft:carpet', 10) * 1, [
        [item('minecraft:wool', 10), item('minecraft:wool', 10)],
        ]
)

crafting.remove('minecraft:blue_carpet')
crafting.addShaped('blue_carpet', item('minecraft:carpet', 11) * 1, [
        [item('minecraft:wool', 11), item('minecraft:wool', 11)],
        ]
)

crafting.remove('minecraft:brown_carpet')
crafting.addShaped('brown_carpet', item('minecraft:carpet', 12) * 1, [
        [item('minecraft:wool', 12), item('minecraft:wool', 12)],
        ]
)

crafting.remove('minecraft:green_carpet')
crafting.addShaped('green_carpet', item('minecraft:carpet', 13) * 1, [
        [item('minecraft:wool', 13), item('minecraft:wool', 13)],
        ]
)

crafting.remove('minecraft:red_carpet')
crafting.addShaped('red_carpet', item('minecraft:carpet', 14) * 1, [
        [item('minecraft:wool', 14), item('minecraft:wool', 14)],
        ]
)

crafting.remove('minecraft:black_carpet')
crafting.addShaped('black_carpet', item('minecraft:carpet', 15) * 1, [
        [item('minecraft:wool', 15), item('minecraft:wool', 15)],
        ]
)


// Ghast Tear
recipemap('chemical_reactor').recipeBuilder()
        .inputs(ore('dustTinyPotassium'))
        .inputs(ore('dustTinyLithium'))
        .fluidInputs(fluid('salt_water') * 1000)
        .outputs(item('minecraft:ghast_tear'))
        .duration(400).EUt(30).buildAndRegister()

// Skeleton Skull
recipemap('assembler').recipeBuilder()
        .inputs(item('minecraft:bone'))
        .outputs(item('minecraft:skull'))
        .duration(100).EUt(4).buildAndRegister()

// Bones
recipemap('extractor').recipeBuilder()
        .inputs(ore('dirt'))
        .outputs(item('minecraft:bone'))
        .duration(100).EUt(16).buildAndRegister()

// Prismarine
recipemap('autoclave').recipeBuilder()
        .inputs(item('minecraft:prismarine_crystals'))
        .fluidInputs(liquid('water') * 250)
        .outputs(item('minecraft:prismarine_shard'))
        .duration(1200).EUt(24).buildAndRegister()

recipemap('autoclave').recipeBuilder()
        .inputs(item('minecraft:prismarine_crystals'))
        .fluidInputs(liquid('distilled_water') * 50)
        .outputs(item('minecraft:prismarine_shard') * 2)
        .duration(600).EUt(24).buildAndRegister()

recipemap('macerator').recipeBuilder()
        .inputs(ore('gemPrismarine'))
        .outputs(item('minecraft:prismarine_crystals'))
        .duration(120).EUt(2).buildAndRegister()

// Slime Ball
recipemap('chemical_bath').recipeBuilder()
        .inputs(ore('dustAsbestos'))
        .fluidInputs(liquid('glue') * 250)
        .outputs(item('minecraft:slime_ball'))
        .duration(200).EUt(16).buildAndRegister()

recipemap('centrifuge').recipeBuilder()
        .inputs(item('minecraft:slime_ball'))
        .fluidOutputs(liquid('glue') * 250)
        .outputs(metaitem('dustAsbestos'))
        .duration(200).EUt(24).buildAndRegister()

// Sponge
recipemap('compressor').recipeBuilder()
        .inputs(ore('foilPolycaprolactam') * 2)
        .outputs(item('minecraft:sponge'))
        .duration(200).EUt(2).buildAndRegister()

// Blaze Powder
crafting.remove('minecraft:blaze_powder')

//Eye of Ender
crafting.remove('minecraft:ender_eye')

// Fire Resistance
crafting.shapelessBuilder().name('fire_resistance_short')
        .output(item('minecraft:potion').withNbt([
            "Potion": "minecraft:fire_resistance"
        ]))
        .input(item('minecraft:potion').withNbt([
            "Potion": "minecraft:water"
        ]))
        .input(ore('dustSugar'))
        .input(ore('dustStone'))
        .input(ore('dustLead'))
        .register()

crafting.shapelessBuilder().name('fire_resistance_long')
        .output(item('minecraft:potion').withNbt([
            "Potion": "minecraft:long_fire_resistance"
        ]))
        .input(item('minecraft:potion').withNbt([
            "Potion": "minecraft:water"
        ]))
        .input(ore('dustRedstone'))
        .input(ore('dustSugar'))
        .input(ore('dustStone'))
        .input(ore('dustLead'))
        .register()

// XP Bottle
recipemap('large_chemical_reactor').recipeBuilder()
        .inputs(item('minecraft:glass_bottle'))
        .inputs(ore('dustTinySugar'))
        .inputs(ore('dustTinyGold'))
        .fluidInputs(liquid('water') * 100)
        .outputs(item('minecraft:experience_bottle'))
        .duration(20).EUt(256).buildAndRegister()

// Nether Star
recipemap('chemical_reactor').recipeBuilder()
        .inputs(ore('dustDiamond'))
        .inputs(ore('dustIridium'))
        .fluidInputs(liquid('rocket_fuel') * 1000)
        .fluidInputs(liquid('nether_air') * 8000)
        .outputs(metaitem('dustNetherStar') * 2)
        .duration(200).EUt(7680).buildAndRegister()