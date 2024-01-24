crafting.addShaped('silken_tofu', item('harvestcraft:silkentofuitem') * 1, [
    [ore('toolHammer')],
    [item('harvestcraft:soybeanitem')],
    [item('harvestcraft:soybeanitem')]
    ]
)

crafting.addShaped('soybean_to_tofu', item('harvestcraft:firmtofuitem') * 8, [
    [item('harvestcraft:silkentofuitem'), item('harvestcraft:silkentofuitem'), item('harvestcraft:silkentofuitem')],
    [item('harvestcraft:silkentofuitem'), ore('listAllwater'), item('harvestcraft:silkentofuitem')],
    [item('harvestcraft:silkentofuitem'), item('harvestcraft:silkentofuitem'), item('harvestcraft:silkentofuitem')]
    ]
)

// oh pams... why must you have a million recipes that craft the same thing.......
// this is (almost) completely unneeded, but it makes the JEI recipe list look nicer! 

crafting.remove('harvestcraft:zombiejerkyitem_itemsalt_itemsalt')
crafting.remove('harvestcraft:zombiejerkyitem_itemsalt_foodsalt')
crafting.remove('harvestcraft:zombiejerkyitem_itemsalt_dustsalt')
crafting.remove('harvestcraft:zombiejerkyitem_foodsalt_foodsalt')
crafting.remove('harvestcraft:zombiejerkyitem_foodsalt_dustsalt')
crafting.remove('harvestcraft:yorkshirepuddingitem_itemsalt')
crafting.remove('harvestcraft:yorkshirepuddingitem_foodsalt')
crafting.remove('harvestcraft:yorkshirepuddingitem_dustsalt')
crafting.remove('harvestcraft:veggiestripsitem_itemsalt')
crafting.remove('harvestcraft:veggiestripsitem_foodsalt')
crafting.remove('harvestcraft:tortillachipsitem')
crafting.remove('harvestcraft:tatertotsitem') // needs recipe
crafting.addShapeless('tater_tots', item('harvestcraft:tatertotsitem') * 1, [item('harvestcraft:bakewareitem'), item('minecraft:potato'), ore('foodFlour'), ore('dustSalt')])
crafting.remove('harvestcraft:taffyitem_itemsalt')
crafting.remove('harvestcraft:taffyitem_foodsalt')
crafting.remove('harvestcraft:sunflowerwheatrollsitem_itemsalt')
crafting.remove('harvestcraft:sunflowerwheatrollsitem_foodsalt')
crafting.remove('harvestcraft:steamedpeasitem_itemsalt')
crafting.remove('harvestcraft:steamedpeasitem_foodsalt')
crafting.remove('harvestcraft:steamedpeasitem_dustsalt')
crafting.remove('harvestcraft:spicymustardporkitem_itemsalt')
crafting.remove('harvestcraft:spicymustardporkitem_foodsalt')
crafting.remove('harvestcraft:soysauceitem_itemsalt')
crafting.remove('harvestcraft:soysauceitem_foodsalt')
crafting.remove('harvestcraft:softpretzelitem_itemsalt')
crafting.remove('harvestcraft:softpretzelitem_foodsalt')
crafting.remove('harvestcraft:sausageitem_itemsalt')
crafting.remove('harvestcraft:sausageitem_foodsalt')
crafting.remove('harvestcraft:saltedsunflowerseedsitem_itemsalt')
crafting.remove('harvestcraft:saltedsunflowerseedsitem_foodsalt')
crafting.remove('harvestcraft:saltedcaramelitem_itemsalt')
crafting.remove('harvestcraft:saltedcaramelitem_foodsalt')
crafting.remove('harvestcraft:saladdressingitem_itemsalt')
crafting.remove('harvestcraft:saladdressingitem_foodsalt')
crafting.remove('harvestcraft:roastpotatoesitem_itemsalt')
crafting.remove('harvestcraft:roastpotatoesitem_foodsalt')
crafting.remove('harvestcraft:roastchickenitem_itemsalt')
crafting.remove('harvestcraft:roastchickenitem_foodsalt')
crafting.remove('harvestcraft:rawtofaconitem_itemsalt')
crafting.remove('harvestcraft:rawtofaconitem_foodsalt')
crafting.remove('harvestcraft:ramenitem') // needs recipe
crafting.addShapeless('ramen', item('harvestcraft:ramenitem') * 1, [item('harvestcraft:potitem'), item('harvestcraft:noodlesitem'), item('harvestcraft:stockitem'), ore('dustSalt')])

crafting.remove('harvestcraft:potatosoupitem_itemsalt')
crafting.remove('harvestcraft:potatosoupitem_foodsalt')
crafting.remove('harvestcraft:potatochipsitem') // needs recipe
crafting.addShapeless('potato_chips', item('harvestcraft:potatochipsitem') * 1, [item('harvestcraft:potitem'), item('minecraft:potato'), ore('dustSalt'), item('harvestcraft:oliveoilitem')])

crafting.remove('harvestcraft:porksausageitem_itemsalt')
crafting.remove('harvestcraft:porksausageitem_foodsalt')
crafting.remove('harvestcraft:pitepaltitem_itemsalt')
crafting.remove('harvestcraft:pitepaltitem_foodsalt')
crafting.remove('harvestcraft:picklesitem_itemsalt')
crafting.remove('harvestcraft:picklesitem_foodsalt')
crafting.remove('harvestcraft:pickledonionsitem_itemsalt')
crafting.remove('harvestcraft:pickledonionsitem_foodsalt')
crafting.remove('harvestcraft:pickledbeetsitem_itemsalt')
crafting.remove('harvestcraft:pickledbeetsitem_foodsalt')
crafting.remove('harvestcraft:pepperoniitem_itemsalt')
crafting.remove('harvestcraft:pepperoniitem_foodsalt')
crafting.remove('harvestcraft:oystersauceitem_itemsalt')
crafting.remove('harvestcraft:oystersauceitem_foodsalt')
crafting.remove('harvestcraft:okrachipsitem_itemsalt')
crafting.remove('harvestcraft:okrachipsitem_foodsalt')
crafting.remove('harvestcraft:misopasteitem_x4_itemsalt')
crafting.remove('harvestcraft:misopasteitem_x4_foodsalt')
crafting.remove('harvestcraft:mettbrotchenitem') // needs recipe
crafting.addShapeless('mettbrotchen', item('harvestcraft:mettbrotchenitem') * 1, [item('harvestcraft:cuttingboarditem'), ore('listAllporkraw'), item('harvestcraft:onionitem'), item('harvestcraft:blackpepperitem'), ore('dustSalt')])

crafting.remove('harvestcraft:mashedpotatoesitem_itemsalt')
crafting.remove('harvestcraft:mashedpotatoesitem_foodsalt')
crafting.remove('harvestcraft:kimchiitem_itemsalt')
crafting.remove('harvestcraft:kimchiitem_foodsalt')
crafting.remove('harvestcraft:icecreamitem_itemsalt')
crafting.remove('harvestcraft:icecreamitem_foodsalt')
crafting.remove('harvestcraft:hotsauceitem_x6_itemsalt')
crafting.remove('harvestcraft:hotsauceitem_x6_foodsalt')
crafting.remove('harvestcraft:haggisitem') // needs recipe
crafting.addShapeless('haggis', item('harvestcraft:haggisitem') * 1, [item('harvestcraft:potitem'), item('minecraft:rotten_flesh'), item('minecraft:spider_eye'), item('harvestcraft:onionitem'), item('harvestcraft:oatsitem'), ore('dustSalt'), item('harvestcraft:blackpepperitem'), item('harvestcraft:spiceleafitem')])

crafting.remove('harvestcraft:gritsitem') // needs recipe
crafting.addShapeless('grits', item('harvestcraft:gritsitem') * 1, [item('harvestcraft:potitem'), item('harvestcraft:cornmealitem'), ore('listAllmilk'), ore('listAllwater'), ore('dustSalt')])

crafting.remove('harvestcraft:greenbeancasseroleitem') // needs recipe
crafting.addShapeless('greenbean_casserole', item('harvestcraft:greenbeancasseroleitem') * 1, [item('harvestcraft:bakewareitem'), ore('cropBean'), ore('listAllmushroom'), item('harvestcraft:onionitem'), ore('listAllheavycream'), ore('foodFlour'), ore('dustSalt')])

crafting.remove('harvestcraft:gravlaxitem_itemsalt')
crafting.remove('harvestcraft:gravlaxitem_foodsalt')
crafting.remove('harvestcraft:gourmetvenisonpattyitem_itemsalt')
crafting.remove('harvestcraft:gourmetvenisonpattyitem_foodsalt')
crafting.remove('harvestcraft:gourmetporkpattyitem_itemsalt')
crafting.remove('harvestcraft:gourmetporkpattyitem_foodsalt')
crafting.remove('harvestcraft:gourmetmuttonpattyitem_itemsalt')
crafting.remove('harvestcraft:gourmetmuttonpattyitem_foodsalt')
crafting.remove('harvestcraft:gourmetbeefpattyitem_itemsalt')
crafting.remove('harvestcraft:gourmetbeefpattyitem_foodsalt')
crafting.remove('harvestcraft:gherkinitem_itemsalt')
crafting.remove('harvestcraft:gherkinitem_foodsalt')
crafting.remove('harvestcraft:friesitem_itemsalt')
crafting.remove('harvestcraft:friesitem_foodsalt')
crafting.remove('harvestcraft:doughitem_itemsalt')
crafting.remove('harvestcraft:doughitem_foodsalt')
crafting.remove('harvestcraft:deviledeggitem') // needs recipe
crafting.addShapeless('deviled_egg', item('harvestcraft:deviledeggitem') * 1, [item('harvestcraft:mixingbowlitem'), ore('listAllegg'), item('harvestcraft:mayoitem'), item('harvestcraft:mustarditem'), item('harvestcraft:spiceleafitem'), ore('dustSalt'), item('harvestcraft:blackpepperitem')])

crafting.remove('harvestcraft:damperitem_itemsalt')
crafting.remove('harvestcraft:damperitem_foodsalt')
crafting.remove('harvestcraft:curryitem_itemsalt')
crafting.remove('harvestcraft:curryitem_foodsalt')
crafting.remove('harvestcraft:crawfishetoufeeitem') // needs recipe
crafting.addShapeless('crawfish_etoufee', item('harvestcraft:crawfishetoufeeitem') * 1, [item('harvestcraft:bakewareitem'), item('harvestcraft:crayfishrawitem'), item('harvestcraft:butteritem'), item('harvestcraft:onionitem'), item('harvestcraft:celeryitem'), item('harvestcraft:riceitem'), ore('dustSalt'), item('harvestcraft:chilipepperitem'), ore('foodFlour')])

crafting.remove('harvestcraft:crackersitem') // needs recipe
crafting.addShapeless('crackers', item('harvestcraft:crackersitem') * 1, [item('harvestcraft:bakewareitem'), item('harvestcraft:doughitem'), item('harvestcraft:butteritem'), ore('dustSalt')])

crafting.remove('harvestcraft:crackeritem') // needs recipe
crafting.addShapeless('cracker', item('harvestcraft:crackeritem') * 1, [item('harvestcraft:bakewareitem'), ore('foodFlour'), item('harvestcraft:oliveoilitem'), ore('dustSalt'), ore('listAllwater')])

crafting.remove('harvestcraft:cornedbeefitem') // needs recipe
crafting.addShapeless('corned_beef', item('harvestcraft:cornedbeefitem') * 1, [item('harvestcraft:potitem'), ore('listAllbeefraw'), ore('dustSalt'), ore('listAllsugar'), item('harvestcraft:cinnamonitem'), item('harvestcraft:mustardseedsitem'), item('harvestcraft:peppercornitem'), item('harvestcraft:spiceleafitem'), item('harvestcraft:gingeritem')])

crafting.remove('harvestcraft:cornchipsitem_itemsalt')
crafting.remove('harvestcraft:cornchipsitem_foodsalt')
crafting.remove('harvestcraft:clamchowderitem_one') // needs recipe
crafting.addShapeless('clam_chowder', item('harvestcraft:clamchowderitem') * 1, [item('harvestcraft:potitem'), item('harvestcraft:clamrawitem'), ore('listAllporkraw'), item('harvestcraft:onionitem'), item('minecraft:potato'), item('harvestcraft:butteritem'), item('harvestcraft:blackpepperitem'), ore('dustSalt')])

crafting.remove('harvestcraft:chorizoitem_itemsalt')
crafting.remove('harvestcraft:chorizoitem_foodsalt')
crafting.remove('harvestcraft:cheeseitem_itemsalt')
crafting.remove('harvestcraft:cheeseitem_foodsalt')
crafting.remove('harvestcraft:cevicheitem') // needs recipe
crafting.addShapeless('ceviche', item('harvestcraft:cevicheitem') * 1, [item('harvestcraft:bakewareitem'), ore('listAllfishraw'), ore('dustSalt'), ore('cropLemon'), item('harvestcraft:onionitem'), item('harvestcraft:sweetpotatoitem'), item('harvestcraft:spiceleafitem')])

crafting.remove('harvestcraft:butteritem_itemsalt')
crafting.remove('harvestcraft:butteritem_foodsalt')
crafting.remove('harvestcraft:buttercookieitem') // needs recipe
crafting.addShapeless('butter_cookie', item('harvestcraft:buttercookieitem') * 1, [item('harvestcraft:bakewareitem'), ore('foodFlour'), ore('dustSalt'), item('harvestcraft:vanillaitem'), item('harvestcraft:butteritem'), ore('listAllsugar'), ore('listAllegg')])

crafting.remove('harvestcraft:bolognaitem_x3_itemsalt')
crafting.remove('harvestcraft:bolognaitem_x3_foodsalt')
crafting.remove('harvestcraft:beefjerkyitem_itemsalt')
crafting.remove('harvestcraft:beefjerkyitem_foodsalt')
crafting.remove('harvestcraft:banananutbreaditem_itemsalt')
crafting.remove('harvestcraft:banananutbreaditem_foodsalt')
crafting.remove('harvestcraft:bakedturnipsitem_itemsalt')
crafting.remove('harvestcraft:bakedturnipsitem_foodsalt')

crafting.remove('harvestcraft:minecraft_bread')
crafting.remove('natura:common/bread')
furnace.add(item('harvestcraft:doughitem'), item('minecraft:bread'))

crafting.remove('harvestcraft:toastitem')
crafting.addShapeless('toast', item('harvestcraft:toastitem'), [item('minecraft:bread'), item('harvestcraft:butteritem')])

crafting.addShapeless('pistachio_butter', item('harvestcraft:pistachiobutteritem') * 2, [ore('toolMortar'), item('harvestcraft:pistachioitem'), item('harvestcraft:oliveoilitem')])
crafting.addShapeless('peanut_butter', item('harvestcraft:peanutbutteritem') * 2, [ore('toolMortar'), item('harvestcraft:peanutbutteritem'), item('harvestcraft:oliveoilitem')])
crafting.addShapeless('mochi', item('harvestcraft:mochiitem'), [ore('toolMortar'), item('harvestcraft:riceitem'), ore('listAllsugar'), ore('listAllwater')])
crafting.addShapeless('miso_paste', item('harvestcraft:misopasteitem') * 4, [ore('toolMortar'), item('harvestcraft:soybeanitem'), ore('listAllmushroom'), item('harvestcraft:riceitem'), ore('dustSalt')])
crafting.remove('harvestcraft:marzipanitem_foodhoneydrop')
crafting.addShapeless('marzipan', item('harvestcraft:marzipanitem'), [ore('toolMortar'), ore('dropSugar'), item('harvestcraft:almonditem')])
crafting.addShapeless('ground_nutmeg', item('harvestcraft:groundnutmegitem'), [ore('toolMortar'), item('harvestcraft:nutmegitem')])
crafting.addShapeless('ground_cinnamon', item('harvestcraft:groundcinnamonitem'), [ore('toolMortar'), item('harvestcraft:cinnamonitem')])
crafting.addShapeless('garam_masala', item('harvestcraft:garammasalaitem'), [ore('toolMortar'), item('harvestcraft:blackpepperitem'), item('harvestcraft:groundcinnamonitem'), item('harvestcraft:spiceleafitem'), item('harvestcraft:groundnutmegitem')])
crafting.addShapeless('wheat_flour', item('harvestcraft:flouritem'), [ore('toolMortar'), ore('cropWheat')])
crafting.addShapeless('taro_flour', item('harvestcraft:flouritem'), [ore('toolMortar'), item('harvestcraft:taroitem')])
crafting.addShapeless('soybean_flour', item('harvestcraft:flouritem'), [ore('toolMortar'), item('harvestcraft:soybeanitem')])
crafting.addShapeless('rye_flour', item('harvestcraft:flouritem'), [ore('toolMortar'), item('harvestcraft:ryeitem')])
crafting.addShapeless('rice_flour', item('harvestcraft:flouritem'), [ore('toolMortar'), item('harvestcraft:riceitem')])
crafting.addShapeless('quinoa_flour', item('harvestcraft:flouritem'), [ore('toolMortar'), item('harvestcraft:quinoaitem')])
crafting.addShapeless('potato_flour', item('harvestcraft:flouritem'), [ore('toolMortar'), item('minecraft:potato')])
crafting.addShapeless('pea_flour', item('harvestcraft:flouritem'), [ore('toolMortar'), item('harvestcraft:peasitem')])
crafting.addShapeless('oats_flour', item('harvestcraft:flouritem'), [ore('toolMortar'), item('harvestcraft:oatsitem')])
crafting.addShapeless('millet_flour', item('harvestcraft:flouritem'), [ore('toolMortar'), item('harvestcraft:milletitem')])
crafting.addShapeless('coconut_flour', item('harvestcraft:flouritem'), [ore('toolMortar'), item('harvestcraft:coconutitem')])
crafting.addShapeless('chickpea_flour', item('harvestcraft:flouritem'), [ore('toolMortar'), item('harvestcraft:chickpeaitem')])
crafting.addShapeless('chestnut_flour', item('harvestcraft:flouritem'), [ore('toolMortar'), ore('cropChesnut')])
crafting.addShapeless('cassava_flour', item('harvestcraft:flouritem'), [ore('toolMortar'), item('harvestcraft:cassavaitem')])
crafting.addShapeless('bean_flour', item('harvestcraft:flouritem'), [ore('toolMortar'), ore('cropBean')])
crafting.addShapeless('barley_flour', item('harvestcraft:flouritem'), [ore('toolMortar'), ore('cropBarley')])
crafting.addShapeless('banana_flour', item('harvestcraft:flouritem'), [ore('toolMortar'), item('harvestcraft:bananaitem')])
crafting.addShapeless('amaranth_flour', item('harvestcraft:flouritem'), [ore('toolMortar'), item('harvestcraft:amaranthitem')])
crafting.addShapeless('almond_flour', item('harvestcraft:flouritem'), [ore('toolMortar'), item('harvestcraft:almonditem')])
crafting.addShapeless('five_spice', item('harvestcraft:fivespiceitem'), [ore('toolMortar'), item('harvestcraft:peppercornitem'), item("harvestcraft:spiceleafitem"), item("harvestcraft:cinnamonitem"), item("harvestcraft:nutmegitem"), item("harvestcraft:gingeritem")])
crafting.addShapeless('curry_powder', item('harvestcraft:currypowderitem'), [ore('toolMortar'), item('harvestcraft:curryleafitem')])
crafting.addShapeless('cornmeal', item('harvestcraft:cornmealitem'), [ore('toolMortar'), item('harvestcraft:cornitem')])
crafting.addShapeless('cocoa_powder', item('harvestcraft:cocoapowderitem'), [ore('toolMortar'), item('minecraft:dye:3')])
crafting.addShapeless('chesnut_butter', item('harvestcraft:chestnutbutteritem') * 2, [ore('toolMortar'), ore('cropChesnut'), item('harvestcraft:oliveoilitem')])
crafting.addShapeless('cashew_butter', item('harvestcraft:cashewbutteritem') * 2, [ore('toolMortar'), item('harvestcraft:cashewitem'), item('harvestcraft:oliveoilitem')])
crafting.addShapeless('black_pepper', item('harvestcraft:blackpepperitem'), [ore('toolMortar'), item('harvestcraft:peppercornitem')])
crafting.addShapeless('almond_butter', item('harvestcraft:almondbutteritem'), [ore('toolMortar'), item('harvestcraft:almonditem'), item('harvestcraft:oliveoilitem')])