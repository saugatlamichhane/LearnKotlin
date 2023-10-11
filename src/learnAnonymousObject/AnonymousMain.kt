package src.learnAnonymousObject

fun main() {
    val hsStudent = object: Student("Saugat") {
        override fun printLevel() {
            println("High School")
        }
    }
    hsStudent.printName()
    hsStudent.printLevel()
}
