package sectionTwo.chapterEightArraysAndLists

fun main() {
    val players = mutableListOf("Aly", "Buck", "Cinda", "Don")

    println(players.isEmpty())
    if (players.isNullOrEmpty()) println("There must be at least 2 players")
    else println("Let's begin!")

    val currentPlayer = players.first()
    println(currentPlayer)

    println(players.last())

    val minPlayer = players.min()
    /*minPlayer.let {
        println("$minPlayer is going to start")
    }*/
    println("$minPlayer is going to start")

    val maxPlayer = players.max()
    if (maxPlayer != null) println("$maxPlayer is the MAX player")

    val firstPlayer = players[0]
    println(firstPlayer)

    //val secondPlayer = players.get(1)
    val secondPlayer = players[1]
    println(secondPlayer)

    //val player = players[4]
    //println(player)

    val upcomingPlayersSlice = players.slice(1..2)
    println(upcomingPlayersSlice.joinToString())

    println(isEliminated("Bob", players))

    players.slice(1..3).contains("Aly")

    players.add("Ellie")

    players += "Guina"

    println(players)

    players.add(5,"Frank")

    println(players.joinToString())
    val wasPlayerRemoved = players.remove("Guina")
    println("It is $wasPlayerRemoved that Guina was removed")

    val removedPlayer = players.removeAt(2)
    println("$removedPlayer was removed")

    val indexOfThisPlayer = players.indexOf("Dan")
    println("The index of Dan is: $indexOfThisPlayer")

    println("Players: ${players.joinToString(" | ")}")
    players[4] = "Franklin"
    players[3] = "Annie"
    //players.set(3,"Annie")
    println("Updated: ${players.joinToString(" - ")}")
    players.sort()

    println("It is ${isEliminated("Buck", players)} buck is eliminated")

    val arrayOfInts = arrayOf(1, 2, 3)
    arrayOfInts[0] = 4

    val scores = listOf(2, 2, 8, 6, 1)
    println("Players: ${players.joinToString( ", ")}")
    players.forEach { println(it) }
    for (player in players) {
        println(player)
    }

    for ((index, player) in players.withIndex()) {
        println("${index.inc()}. $player")
    }
    println("${sumOfElements(scores)}")
    val leaderBoard: Map<List<String>,List<Int>> = mapOf(players to scores)

    println("Jugador        Resultado")
    for ((player, score) in leaderBoard.entries) {
        for (elements in leaderBoard.keys.first().toList().indices){
            println("${elements+1}. ${player[elements]}          ${score[elements]}")
        }
    }

    /*var nullableList: List<Int>? = listOf(1, 2, 3, 4)
    nullableList = null

    val listOfNullables: List<Int?> = listOf(1, 2, null, 4)
    // listOfNullables = null == error because just the elements can be null
    // besides the val declaration which was var

    var nullableListOfNullables: List<Int?>? = listOf(null)
    nullableListOfNullables = null*/

    
}

fun sumOfElements(list: List<Int>): Int {
    var sum = 0
    for (number in list) {
        sum += number
    }
    return sum
}
fun isEliminated(player: String, players: MutableList<String>): Boolean {
    return player !in players
}