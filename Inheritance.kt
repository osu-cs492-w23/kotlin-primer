class Employee(val name: String, val id: Int, var payRate: Double) {
  val label: String
    get() = "${this.name} (${this.id})"
  fun getPay(hours: Double) = this.payRate * hours
}

fun main() {
  val e = Employee("Luke Skywalker", 933111111, 30.00)
  println("${e.label} makes ${e.getPay(160.0)} this month")
}
