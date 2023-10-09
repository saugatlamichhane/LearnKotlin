package src.LearnInheritance

open class Person(name: String, sex: String, var age: Int, var address: String) {

    init {
        println("Hello, I am $name, a $age years old $sex, from $address")
    }

    fun addAge(): Int {
        age++
        return age
    }

    fun changeAddress(newAddress: String): String{
        address = newAddress
        return address
    }


}