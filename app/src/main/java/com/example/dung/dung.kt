import android.os.Build
import androidx.annotation.RequiresApi
import com.example.dung.*

@RequiresApi(Build.VERSION_CODES.N)
fun main(args : Array<String>) {

    fun main(args: Array<String>) {


        val conan = Player("Conan")
        conan.getLoot(loot("Invisibility", lootTye.POTION, 4.0))
        conan.getLoot(loot("Mithril", lootTye.ARMOR, 183.0))
        conan.getLoot(loot("Ring of speed", lootTye.POTION, 25.0))
        conan.getLoot(loot("Red Potion", lootTye.POTION, 2.0))
//    conan.getLoot(Loot("Cursed Shield", LootType.ARMOR, -8.0))
        conan.getLoot(loot("Brass Ring", lootTye.RING, 1.0))
        conan.getLoot(loot("Chain Mail", lootTye.ARMOR, 4.0))
        conan.getLoot(loot("Gold Ring", lootTye.RING, 12.0))
        conan.getLoot(loot("Gold Ring", lootTye.RING, 12.0))
        conan.getLoot(loot("Gold Ring", lootTye.RING, 12.0))
        conan.getLoot(loot("Health Potion", lootTye.POTION, 3.0))
        conan.getLoot(loot("Silver Ring", lootTye.RING, 6.0))
        conan.getLoot(loot("Silver Ring", lootTye.RING, 6.0))
        conan.showInventory()

        conan.dropLoot("Gold Ring")
        conan.showInventory()

        conan.dropLoot("Silver Ring")
        conan.showInventory()

        val dropped = conan.dropLoot("Something not present")
        println(dropped)

        println(conan.dropLoot("Something else"))

        if (conan.dropLoot("A bit of junk")) {
            println("junk dropped")
        } else {
            println("You don't have any junk")
        }
    }
}