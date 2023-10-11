package src.learnGenerics

import src.learnLambda.Player

fun main() {
    val player1 = Player("Prawin", "Ludo")
    val player2 = Player("Sargam", "Chess")
    val player3 = Player("Saugat", "Scrabble")
    val player4 = Player("Prashant", "Scrabble")
    val player5 = Player("Sudip", "Chess")
    val playerList = listOf(player1, player2, player3, player4, player5)
    val finalPlayerList = playerList.customFilter { it.sport == "Scrabble" }
    for(player in finalPlayerList) {
        player.printName()
        player.printSport()
    }
    val finalList = (1..20).toList().customFilter { it in 6..9 }
    for(item in finalList)
        println(item)
}
//can allow passing specific type only
//fun <T: Number>
fun <T> List<T>.customFilter(filterFunction: (T) -> (Boolean)): List<T> {
    val resultList = mutableListOf<T> ()
    for(t in this) {
        if(filterFunction(t)) {
            resultList.add(t)
        }
    }
    return resultList
}