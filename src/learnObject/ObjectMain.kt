package src.learnObject

fun main() {
    val circle = Circle(4.5)
    println("area = ${circle.area()}")
    val circle1 = Circle.randomCircle();
    println("random area = ${circle1.area()}")
}