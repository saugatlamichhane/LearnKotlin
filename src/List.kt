fun main(){
    val myList = mutableListOf("Saugat", "Sushank", "Sudip")
    //unlike arrays, the size of list can be changed
    //remove() for removing a member of an array
    myList.remove("Saugat")
    //removeAt() for removing the member at certain index
    myList.removeAt(1)
    //add() for adding a member to the list
    myList.add("Trailblazer")
    //printing members of list
    for(item in myList)
        println(item)

    //taking user input and storing in list
    val usrList = mutableListOf<String>()
    for(i in 0 until 6) {
        val usrInput = readLine()
        if(usrInput != null) {
            usrList.add(usrInput)
        }
    }
    //printing list at once
    println(usrList)
}