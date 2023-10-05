fun main() {
    val array = intArrayOf(3, 5, 8)
    //array can be passed too using *
    val sum = getSum(5, 6, 3, 4, *array, 9, 3)
    println(sum)
}
//vararg can be used to pass data if we don't know how many of them we have to pass
fun getSum(vararg numbers: Int): Int {
    var sum = 0;
    //members can be accessed like a list
    for(x in numbers) {
        sum += x;
    }
    return sum;
}

