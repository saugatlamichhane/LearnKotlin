package src.learnOverloading

fun  main() {
    val person = Person(6.0)
    person.printName()
    val saugat = Person("Saugat", 5.9)
    saugat.printName()
    if(isTall(saugat))
        println("Saugat is tall")
    else
        println("Saugat is not tall")
    if(isTall(saugat, person))
        println("${saugat.name} is taller than ${person.name}")
    else
        println("${saugat.name} is not taller than ${person.name}")
}

fun isTall(person1: Person, person2: Person): Boolean {
    return person1.height > person2.height
}

fun isTall(person: Person): Boolean {
    return person.height > 5.8
}