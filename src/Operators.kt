fun main() {
    //+, -, *, /, % are arithmetical operators

    var x = 4
    val y = 8

    //use ${} to include an expression
    println("x + y + 1= ${x + y + 1}")

    //integer division
    println(30/7)

    //division
    println(30.0/7.0)

    //=, +=, -=, *=, /=, %= are assignment operators
    x += 10
    println("x is now ${x}")

    //<, >, <=, >=, == are relational operators
    println(x > y)

    //&&, ||, ! are logical operators
    println(!(x > y) && x == 4)

    //TODO associativity and precedence
}
