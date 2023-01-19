import edu.oregonstate.pets.Cat
import edu.oregonstate.pets.Dog
import edu.oregonstate.pets.feedPet
// import edu.oregonstate.pets.*

import kotlin.random.Random

fun main() {
    val c = Cat("Hobbes")
    c.speak()

    val d = Dog("Snoopy")
    d.speak()

    feedPet(c)
    feedPet(d)

    val x = Random.nextInt(0, 100)

    // val strList = ArrayList<String>()
    // strList.add("one")
    // strList.add("two")
    // strList.add("three")

    val intList = ArrayList<Int>()
    intList.add(1)
    intList.add(2)
    intList.add(3)

    val strList = ArrayList<String>().apply {
        add("one")
        add("two")
        add("three")
    }

}
