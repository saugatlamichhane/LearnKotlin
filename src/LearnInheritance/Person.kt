package src.LearnInheritance

open class Person(name: String, sex: String, var age: Int, var address: String) {
    //visibility modifiers
    //public: visible within any class
    //private: visible within the same class only
    //protected: visible within the same and inherited class
    //constructor can also be private
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