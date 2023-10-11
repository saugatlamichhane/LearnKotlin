package src.learnGenerics

class Section<T>(val name: T) {
    fun printSection() {
        println(name)
    }
}