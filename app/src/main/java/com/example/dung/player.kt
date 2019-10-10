import android.content.ClipData
import android.os.Build
import androidx.annotation.RequiresApi
import com.example.dung.Weapon
import com.example.dung.loot

class Player(val name: String, var level: Int = 1, var lives: Int = 3, var score: Int = 0) {
    var weapon: Weapon = Weapon("Fist", 1)
     private val inventory = ArrayList<loot>()


    fun show() {
        if (lives > 0) {
            println("$name is alive")
        } else {
            println("$name is dead")
        }
    }

    override fun toString(): String {
        return """
            name: $name
            lives: $lives
            level: $level
            score: $score
            weapon: ${weapon}
            """
    }

    fun getLoot (item: loot) {
        inventory.add(item)
        // code to saved the inventory goes here
    }

    fun dropLoot(item: loot): Boolean {
        return if (inventory.contains(item)) {
            inventory.remove(item)
            true
        } else {
            false
        }
    }

  /* fun dropLoot(name: String): Boolean {
      for (item in inventory) {
           if (item.name == name) {
               inventory.remove(item)
               return true }
       }
       return false
   }*/

    fun dropLoot(name: String): Boolean {
        var result = false
        for (item in inventory) {
            if (item.name == name) {
                inventory.remove(item)
                result = true
                break
            }
        }
        return result
    }

    fun showInventory() {
        var total = 0.0
        println("$name's Inventory")
        for (item in inventory) {
            println(item)
            total += item.value
        }
        println("================================")
        println("Total score is: $total")
        println("================================")
    }
}