fun startsWithC(s: String): Boolean = s.startsWith('c')

fun main() {
    val pets = listOf("cat", "dog", "lizard", "canary", "cow", "fish")
    println(pets.filter(::startsWithC))
    println(pets.filter({ pet -> pet.startsWith('c') }))
    println(pets.filter{ pet -> pet.startsWith('c') })
    println(pets.filter{ it.startsWith('c') })
}
