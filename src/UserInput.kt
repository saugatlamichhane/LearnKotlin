fun main() {
    val usrInput1 = readLine()
    println("you entered \"$usrInput1\"")

    //converting to int
    //TODO check if it is Int type
    val usrInput2 = readLine()
    //check if user-input is null
    if (usrInput2 != null) {
        println(usrInput2.toInt() + 8)
    }

    //alternative way: check if user-inputted int is null
    val usrInput3 = readLine()?.toInt()
    if(usrInput3 != null) {
        println(usrInput3)
    }

    //TODO learn about readln() and readlnOrNull()
}