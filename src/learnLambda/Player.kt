package src.learnLambda

class Player(var name: String, var sport: String) {
    //TODO what is the difference of using var and not using var in constructor and function declaration
    fun changeSport(newSport: String) {
        sport = newSport
    }

    fun changeName(newName: String) {
        name = newName
    }

    fun printSport() {
        println(sport)
    }

    fun printName() {
        println(name)
    }

}