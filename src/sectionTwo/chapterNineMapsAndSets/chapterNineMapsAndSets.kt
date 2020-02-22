package sectionTwo.chapterNineMapsAndSets

fun main() {
    val yearOfBirth = mapOf("Annie" to 1990, "Bryan" to 1991, "Cruig" to 1992, "Donnie" to 1993)
    println(yearOfBirth)
    val namesAndScores = mutableMapOf("Annie" to 2, "Bryan" to 2, "Cruig" to 8, "Donnie" to 6)
    println(namesAndScores)

    val robData = mutableMapOf("name" to "Rob",
        "profession" to "CardPlayer",
        "country" to "USA")
    robData.put("state","CA")
    robData["city"] = "San Francisco"
    getPlayerCityAndState(robData)

    robData.put("name", "Robbie")
    robData["profession"] = "Mailman"
    val pair = "nickname" to "Robby D"
    robData += pair

    println(robData)

    robData.remove("city")
    robData.remove("state", "CA")

    for ((player, score) in namesAndScores) {
        println("$player - $score")
    }

    for (player in namesAndScores.keys) {
        print("$player, ")
    }

    println("some string".hashCode())
    println(1.hashCode())
    println(false.hashCode())

    val names = setOf("Annie", "Bryan", "Cruig", "Bonnie", "Annie")
    println(names)

    val hashSet = HashSet<Int>()
    println(hashSet)

    val someArray = arrayOf(1, 2, 3, 1)
    val someSet = mutableListOf(*someArray)
    println(someSet)

    println(someSet.contains(1))
    println(4 in someSet)
    someSet.add(5)

    val removedOne = someSet.remove(1)
    println(removedOne)

    println(someSet)



}

fun getPlayerCityAndState(player: MutableMap<String, String>) {
    println("${player["name"]}\nCity: ${player["city"]}\nState: ${player["state"]}")
}