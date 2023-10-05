fun main() {
    val list = listOf(2, 5, 4)
    printAvg(list)
    println("the power is ${pow(2, 3)}")
}

//single line function
fun multiply(a: Int, b: Int) = a*b;

//function
//return int
fun pow(a: Int, b: Int): Int {
    var result = 1;
    for(i in 1..b) {
        result = multiply(result, a)
    }
    return result;
}
//passing list as parameter
//doesn't return
fun printAvg(list: List<Int>) {
    var sum = 0.0;
    for(item in list){
        sum += item;
    }
    println("avg is ${sum/list.size}")
}