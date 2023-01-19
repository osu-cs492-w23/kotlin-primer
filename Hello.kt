fun printGreeting(who: String, greeting: String = "Hello", punctuation: String = "!") {
  println("$greeting, $who$punctuation")
}

fun powerOf(base: Int, exponent: Int): Int {
  var result = 1
  for (i in exponent downTo 1) result *= base
  return result
}

fun timesTwo(x: Int) = x * 2

fun main() {
  printGreeting("world", "Greetings")
  printGreeting("CS 492")
  printGreeting("world", punctuation = "!!!!!!!!")
  printGreeting(punctuation = "!!!!!!!!", who = "world")

  println("2^8 = ${powerOf(2, 8)}")
  println("2*8 = ${timesTwo(8)}")

  // println("Hello, world!")

  // var a: Int = 16
  // var b = 32
  // // b = 4.25
  // // b = 4.25 as Int

  // var x: Double
  // x = 4.toDouble()

  // b *= 4

  // val n = 128
  // // n = 32

  // var nonNull: String = "This string can't be null"
  // // nonNull = null

  // var nullable: String? = "This string is nullable"
  // nullable = null

  // var inferredNonNull = "This is still not nullable"
  // // inferredNonNull = null

  // println(nonNull.length)
  // println(nullable?.length)
  // // a?.b?.c?.d?.e

  // val l: Int = nullable?.length ?: 0
  // println(l)

  // var lengthStr = "The length of nullable is $l"
  // println(lengthStr)

  // println("The length of nullable is between ${l - 1} and ${l + 1}")

  // if (l > 0) {
  //   println("The string is not empty")
  // } else {
  //   println("The string is empty")
  // }

  // val max = if (a > b) a else b
  // println("max: $max")

  // if (l in 1..10) {
  //   println("The string is a short one")
  // } else if (l in 11..25) {
  //   println("The string is a medium one")
  // } else if (l > 25) {
  //   println("The string is a long one")
  // } else {
  //   println("The string is empty")
  // }

  // when (l) {
  //   in 1..10 -> {
  //     println("The string is a short one")
  //   }
  //   in 11..25 -> println("The string is a medium one")
  //   in 25..Int.MAX_VALUE -> println("The string is a long one")
  //   else -> println("The string is empty")
  // }

  // when {
  //   l > 25 -> println("The string is a long one")
  //   else -> println("The string is NOT a long one")
  // }

  // val donuts = listOf("glazed", "sugar", "buttermilk")
  val mutableDonuts = mutableListOf("glazed", "sugar", "buttermilk")
  // mutableDonuts.add("cream filled")
  // println("donuts: $donuts")
  // println("mutableDonuts: $mutableDonuts")

  // val donutsArr = arrayOf("glazed", "sugar", "buttermilk")
  // println("donutsArr: $donutsArr")

  // val numbersList = listOf(1, 2, 3)
  // val numbersArr = intArrayOf(1, 2, 3)

  val squares = IntArray(10) { it * it }
  val squares = IntArray(10) { i -> i * i }
  val squares = IntArray(10, { i -> i * i })

  // for (donut in donuts) {
  //   println(donut)
  // }

  // for ((i, donut) in donuts.withIndex()) {
  //   println("donuts[$i]: $donut")
  // }

  // for (i in 1..9) print(i)
}
