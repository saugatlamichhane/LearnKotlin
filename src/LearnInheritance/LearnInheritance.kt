package src.LearnInheritance

fun main() {
    val student = Student("Saugat", "male", 18, "Kathmandu", 12, "Morgan Int'l School")
    println("My new age is ${student.addAge()}")
    println("My new address is ${student.changeAddress("Kushma")}")
}