package src.learnOverloading

class Person(val name: String, val height: Double) {
    constructor(height: Double): this("anonymous", height)

    fun printName() {
        println(name)
    }
}