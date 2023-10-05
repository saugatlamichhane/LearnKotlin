fun main(){
    val usrInput = readLine()
    var age = 2;
    if(usrInput != null) {
        age = usrInput.toInt()
        //can use with String too
        when(age) {
            in 0..2 -> println("you are a kid!")
            in 3..12 -> println("you are a child")
            in 13..19 -> println("you are a teenager")
            20, 21 -> println("you crossed teenage")
            22 -> println("you are now 22")
            else -> println("you are an adult")
        }
    }
    //case can have multiple lines
    val sex = readLine()
    if(sex != null) {
        when(sex) {
            "male" -> {
                if(age > 30)
                    println("you should have married by now")
            }
            "female" -> {
                if(age > 25)
                    println("you should have married by now")
            }
        }
    }
}