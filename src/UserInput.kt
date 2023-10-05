fun main() {
    val usrInput1 = readLine()
    println("you entered \"$usrInput1\"")

    //converting to int
    //TODO check if it is Int type
    val usrInput2 = readLine()
    if (usrInput2 != null) {
        println(usrInput2.toInt() + 8)
    }
}