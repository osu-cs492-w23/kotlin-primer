package edu.oregonstate.pets

interface Pet {
    var name: String
    val foodType: String
    fun speak()
}

fun feedPet(pet: Pet) {
    println("Feeding ${pet.name} some ${pet.foodType}")
    pet.speak()
}

class Cat(override var name: String) : Pet {
    override val foodType = "fish"
    override fun speak() = println("${this.name} says meow")
}

class Dog(override var name: String) : Pet {
    override val foodType = "kibble"
    override fun speak() = println("${this.name} says woof")
}
