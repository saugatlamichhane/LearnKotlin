package src.LearnInheritance
class Student(name: String, sex: String, age: Int, address: String, grade: Int, school:String) : Person(name, sex, age, address){
    init {
        println("I read in grade $grade at $school")
    }
}