fun main() {
    val myRect = Rectangle(7.5, 3.5)
    println("area = ${myRect.area()}")
    println("perimeter = ${myRect.perimeter()}")
    if(myRect.isSquare())
        println("square")
    else
        println("not a square")
    if(myRect.isQuadrilateral())
        println("quadrilateral")
    else
        println("not a quadrilateral")
}
