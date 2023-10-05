fun main() {
    //while loop for printing numbers
    var i = 0
    while(i < 10) {
        println(i)
        i++
    }

    //while loop for printing members of array
    val myArray = arrayOf("Saugat", "Sudip", "Sushank");
    i = 0
    val arrSize = myArray.size
    while(i < arrSize) {
        println(myArray[i])
        i++
    }


    //for loop
    //inclusive ranges
    for(i in 1..3)
        println(i)
    for(i in 3 downTo 1)
        println(i)
    //exclusive range
    for(i in 1 until 3)
        println(i)

    //for-loop for printing members of array
    for(item in myArray)
        println(item)
}