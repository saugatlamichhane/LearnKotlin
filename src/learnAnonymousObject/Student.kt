package src.learnAnonymousObject

abstract class Student(val name: String) {
    fun printName() {
        println(name)
    }

    abstract fun printLevel()
}