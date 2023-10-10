package src.learnObject

import kotlin.random.Random


class Circle(val radius: Double) {

    companion object {
        fun randomCircle() = Circle(Random.nextDouble(1.0, 5.0))
    }
    fun area(): Double {
        return ImpConstants.PI * radius * radius
    }
}