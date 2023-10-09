class Rectangle (val length: Double, val breadth: Double) {

    //can define variables here
    val noOfSides = 4
    init {
        println("Rectangle created with length $length and breadth $breadth")
    }

    fun area() = length * breadth

    fun perimeter() = 2*(length + breadth)

    fun isQuadrilateral() = noOfSides == 4

    fun isSquare() = length == breadth
}