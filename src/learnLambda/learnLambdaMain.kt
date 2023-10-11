package src.learnLambda

fun main() {
    val list = listOf(0, 5, -3, -6, -40, 56, 34, 28, -13)
    println(list)
    list.filter { it > 0 }
    println(list)

    val player1 = Player("Saugat", "Cricket")
    val player2 = Player("Shishir", "Futsal")
    val player3 = Player("Sandep", "Cricket")
    val player4 = Player("Bibek", "Football")
    val player5 = Player("Sudip", "Tennis")

    val playerList = listOf(player1, player2, player3, player4, player5)

    for(player in playerList) {
        player.printName()
        player.printSport()
    }

    val finalPlayerList = playerList.filterList { it.sport == "Cricket" }
    //for accessing other parameters
    //take more than one parameter in extension functions
    //while passing
    //team, sport -> team == "trailblazer" && sport == "Cricket"
    for(player in finalPlayerList) {
        player.printName()
        player.printSport()
    }
}

fun List<Player>.filterList(filterFun: (Player) -> (Boolean)): List<Player> {
    val resultList = mutableListOf<Player>()
    for(player in this) {
        if(filterFun(player)) {
            resultList.add(player)
        }
    }
    return resultList
}
