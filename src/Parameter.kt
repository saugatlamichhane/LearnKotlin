fun main() {
    greet("Namaste", "Nepal")
    greet()
    //by default, it considers the arguments are for consecutive parameters starting from the first one
    greet("Privet")
    //can be explicitly stated for which parameter we are passing the argument
    greet(name = "Saugat")
}

//default parameters can be stated by using =
fun greet(word: String = "Hello", name: String = "World") {
    println("$word $name")
}
