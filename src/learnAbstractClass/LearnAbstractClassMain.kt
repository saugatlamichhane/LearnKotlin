package src.learnAbstractClass

fun main() {
    val rectangle = Rectangle("rectangle", 3.0,1.4)
    rectangle.printName()
    println("area = ${rectangle.area()}")
    println("perimeter = ${rectangle.perimeter()}")
}