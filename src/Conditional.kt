fun main() {
    val a = 3;
    val b = 4;
    //conditional assignment
    val c = if(a > b) a else b
    println(c)

    val d = 5;
    //if-else ladder
    if(a == c && c == d) {
        println("a is equal to d")
    } else if(b == c && c == d) {
        println("b is equal to d")
    } else {
        println("neither a nor b is equal to d")
    }
}