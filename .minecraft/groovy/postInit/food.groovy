crafting.addShaped('silken_tofu', item('harvestcraft:firmtofuitem') * 1, [
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
// crafting.remove('harvestcraft:item_itemsalt')
// crafting.remove('harvestcraft:item_foodsalt')
// crafting.remove('harvestcraft:item') // needs recipe

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
crafting.addShapeless('tatertots', item('harvestcraft:tatertotsitem') * 1, [item('harvestcraft:bakewareitem'), item('minecraft:potato'), ore('foodFlour'), ore('dustSalt')])
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
crafting.addShapeless('potatochips', item('harvestcraft:potatochipsitem') * 1, [item('harvestcraft:potitem'), item('minecraft:potato'), ore('dustSalt'), item('harvestcraft:oliveoilitem')])

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
crafting.addShapeless('greenbeancasserole', item('harvestcraft:greenbeancasseroleitem') * 1, [item('harvestcraft:bakewareitem'), ore('cropBean'), ore('listAllmushroom'), item('harvestcraft:onionitem'), ore('listAllheavycream'), ore('foodFlour'), ore('dustSalt')])

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
crafting.addShapeless('deviledegg', item('harvestcraft:deviledeggitem') * 1, [item('harvestcraft:mixingbowlitem'), ore('listAllegg'), item('harvestcraft:mayoitem'), item('harvestcraft:mustarditem'), item('harvestcraft:spiceleafitem'), ore('dustSalt'), item('harvestcraft:blackpepperitem')])

crafting.remove('harvestcraft:damperitem_itemsalt')
crafting.remove('harvestcraft:damperitem_foodsalt')
crafting.remove('harvestcraft:curryitem_itemsalt')
crafting.remove('harvestcraft:curryitem_foodsalt')
crafting.remove('harvestcraft:crawfishetoufeeitem') // needs recipe
crafting.addShapeless('crawfishetoufee', item('harvestcraft:crawfishetoufeeitem') * 1, [item('harvestcraft:bakewareitem'), item('harvestcraft:crayfishrawitem'), item('harvestcraft:butteritem'), item('harvestcraft:onionitem'), item('harvestcraft:celeryitem'), item('harvestcraft:riceitem'), ore('dustSalt'), item('harvestcraft:chilipepperitem'), ore('foodFlour')])

crafting.remove('harvestcraft:crackersitem') // needs recipe
crafting.addShapeless('crackers', item('harvestcraft:crackersitem') * 1, [item('harvestcraft:bakewareitem'), item('harvestcraft:doughitem'), item('harvestcraft:butteritem'), ore('dustSalt')])

crafting.remove('harvestcraft:crackeritem') // needs recipe
crafting.addShapeless('cracker', item('harvestcraft:crackeritem') * 1, [item('harvestcraft:bakewareitem'), ore('foodFlour'), item('harvestcraft:oliveoilitem'), ore('dustSalt'), ore('listAllwater')])

crafting.remove('harvestcraft:cornedbeefitem') // needs recipe
crafting.addShapeless('cornedbeef', item('harvestcraft:cornedbeefitem') * 1, [item('harvestcraft:potitem'), ore('listAllbeefraw'), ore('dustSalt'), ore('listAllsugar'), item('harvestcraft:cinnamonitem'), item('harvestcraft:mustardseedsitem'), item('harvestcraft:peppercornitem'), item('harvestcraft:spiceleafitem'), item('harvestcraft:gingeritem')])

crafting.remove('harvestcraft:cornchipsitem_itemsalt')
crafting.remove('harvestcraft:cornchipsitem_foodsalt')
crafting.remove('harvestcraft:clamchowderitem_one') // needs recipe
crafting.addShapeless('clamchowder', item('harvestcraft:clamchowderitem') * 1, [item('harvestcraft:potitem'), item('harvestcraft:clamrawitem'), ore('listAllporkraw'), item('harvestcraft:onionitem'), item('minecraft:potato'), item('harvestcraft:butteritem'), item('harvestcraft:blackpepperitem'), ore('dustSalt')])

crafting.remove('harvestcraft:chorizoitem_itemsalt')
crafting.remove('harvestcraft:chorizoitem_foodsalt')
crafting.remove('harvestcraft:cheeseitem_itemsalt')
crafting.remove('harvestcraft:cheeseitem_foodsalt')
crafting.remove('harvestcraft:cevicheitem') // needs recipe
crafting.addShapeless('ceviche', item('harvestcraft:cevicheitem') * 1, [item('harvestcraft:bakewareitem'), ore('listAllfishraw'), ore('dustSalt'), ore('cropLemon'), item('harvestcraft:onionitem'), item('harvestcraft:sweetpotatoitem'), item('harvestcraft:spiceleafitem')])

crafting.remove('harvestcraft:butteritem_itemsalt')
crafting.remove('harvestcraft:butteritem_foodsalt')
crafting.remove('harvestcraft:buttercookieitem') // needs recipe
crafting.addShapeless('buttercookie', item('harvestcraft:buttercookieitem') * 1, [item('harvestcraft:bakewareitem'), ore('foodFlour'), ore('dustSalt'), item('harvestcraft:vanillaitem'), item('harvestcraft:butteritem'), ore('listAllsugar'), ore('listAllegg')])

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