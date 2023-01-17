class Student(val name: String, val id: Int, var gpa: Double)

class Glass(val full: Double = 0.5)

class Rectangle(var width: Int, var height: Int) {
    val area: Int
        get() = this.width * this.height

    fun print() {
        println("This is a $width x $height rectangle")
    }

    private fun privateMethod() {

    }
}

class Greeting(val who: String) {
    init {
        println("Init block in Greeting class, who: $who")
    }
    val greeting = "Hello, $who"
    init {
        println("greeting: $greeting")
    }
}

class Human(val pets: MutableList<Pet> = mutableListOf())

class Pet(val name: String) {
    constructor(name: String, owner: Human) : this(name) {
        owner.pets.add(this)
    }
}

fun main() {
    val s = Student("Luke Skywalker", 933111111, 3.75)
    println("${s.name} (${s.id}) ${s.gpa}")
    s.gpa = 3.9
    println("${s.name} (${s.id}) ${s.gpa}")

    val g1 = Glass()
    val g2 = Glass(1.0)

    val r = Rectangle(4, 8)
    println(r.area)
    r.height = 16
    println(r.area)

    var greeting = Greeting("world")
    println(greeting.greeting)

    val h = Human()
    val p1 = Pet("Scruffy")
    val p2 = Pet("Hobbes", h)
    println("human has ${h.pets.size} pets")

    r.print()
}
