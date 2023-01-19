open class Employee(val name: String, val id: Int, var payRate: Double) {
  val label: String
    get() = "${this.name} (${this.id})"
  open fun getPay(hours: Double) = this.payRate * hours
}

class Instructor(name: String, id: Int, payRate: Double, var apptMonths: Int) : Employee(name, id, payRate) {
  override fun getPay(hours: Double) = this.payRate / this.apptMonths
}

fun main() {
  val e = Employee("Luke Skywalker", 933111111, 30.00)
  println("${e.label} makes ${e.getPay(160.0)} this month")

  val i = Instructor("Leia Organa", 933222222, 1000000.00, 9)
  println("${i.label} makes ${i.getPay(160.0)} this month")

  val iAsE: Employee = Instructor("Rey", 933333333, 1000000.00, 9)
  println("${iAsE.label} makes ${iAsE.getPay(160.0)} this month")

}
