package src.learnAbstractClass

class Rectangle(name: String, val length: Double, val width: Double): Shape(name) {
    override fun perimeter(): Double {
        return 2*(length + width)
    }

    override fun area(): Double {
        return length * width
    }
}