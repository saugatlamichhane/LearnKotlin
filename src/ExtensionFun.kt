fun main() {
    val x = readLine()?.toInt()
    if(x != null) {
        println(x.isEven())
    }
}
fun Int.isEven(): Boolean {
    return this%2 == 0;
}