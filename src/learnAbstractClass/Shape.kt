package src.learnAbstractClass

abstract class Shape(val name: String) {
    init {
        println("Shape created")
    }

    abstract fun perimeter(): Double

    abstract fun area(): Double

    fun printName() {
        println(name)
    }

}