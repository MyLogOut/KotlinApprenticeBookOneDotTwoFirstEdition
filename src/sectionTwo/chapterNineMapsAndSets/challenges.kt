package sectionTwo.chapterNineMapsAndSets

import java.lang.Exception

fun main() {
    challenges()
}

fun challenges() {
    challengeOne()
    challengeTwo()
    challengeThree()
    challengeFour()
    challengeFive()
    challengeSix()
    challengeSeven()
    challengeEight()
    challengeNine()
    challengeTen()
}

fun challengeOne(){
    /*1. Which of the following are valid statements?
    1. val map1: Map<Int to Int> = emptyMap()
    2. val map2 = emptyMap()
    3. val map3: Map<Int, Int> = emptyMap() <<
    For the next four statements, use the following map:
    val map4 = mapOf("One" to 1, "Two" to 2, "Three" to 3)
    4. map4[1]
    5. map4["One"] <<
    6. map4["Zero"] = 0
    7. map4[0] = "Zero"
    For the next three statements, use the following map:
    val map5 = mutableMapOf("NY" to "New York", "CA" to "California")
    8. map5["NY"] <<
    9. map5["WA"] = "Washington" <<
    10. map5["CA"] = null*/

}
fun challengeTwo(){
    /*2. Given a map with two-letter state codes as keys, and the full state names as values,
    write a function that prints all the states with names longer than eight characters.
    For example, for the map mapOf("NY" to "New York", "CA" to "California"), the
    output would be California.*/
    val states = mapOf("NY" to "New York", "CA" to "California", "WA" to "Washington")
    printStringHigherThanEight(states)
}
fun challengeThree(){
    /*3. Write a function that combines two maps into one. If a certain key appears in both
    maps, ignore the pair from the first maps. This is the function’s signature:
    fun mergeMaps(map1: Map<String, String>, map2: Map<String, String>):
            Map<String, String>*/
    val countries = mapOf("CR" to "Costa Rica", "FR" to "France", "USA" to "United States of America", "AR" to "Argentina")
    val countries2 = mapOf("CR" to "Costa Rica", "FR" to "France", "USA" to "United States of America", "MX" to "Mexico")
    println("Map of first Countries: ${countries.entries}\nMap of second Countries: ${countries2.entries}")
    println("Merged maps: ${mergeMaps(countries,countries2)}")
}
fun challengeFour(){
    /*4. Declare a function occurrencesOfCharacters that calculates which characters occur
    in a string, as well as how often each of these characters occur. Return the result as
    a map. This is the function signature:
    fun occurrencesOfCharacters(text: String): Map<Char, Int>
    Hint: String is a collection of characters that you can iterate over with a for statement.
    Bonus: To make your code shorter, maps have a special function that lets you add a
    default value if it is not found in the map. For example, map.getOrDefault('a',
    defaultValue = 0) returns 0 for the character 'a' if it is not found, instead of simply
    returning null.*/
    val loremIpsum = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum."
    println("Block of text: \n$loremIpsum\nNumber of times each of these characters appeared and repeated itself:\n${occurrencesOfCharacters(loremIpsum)}")
}
fun challengeFive(){
    /*5. Write a function that returns true if all of the values of a map are unique. Use a set
    to test uniqueness. This is the function signature:
    fun isInvertible(map: Map<String, Int>): Boolean*/

    val countries = mapOf("CR" to 1, "FR" to 2, "USA" to 3, "AR" to 1)
    println("\nThis map: $countries")
    println("Are its elements unique? ${isInvertible(countries)}")
}
fun challengeSix(){
    /*6. Given the map:
    val nameTitleLookup: Map<String, String?>
            = mutableMapOf("Mary" to "Engineer", "Patrick" to "Intern", "Ray" to
            "Hacker")
    Set the value of the key "Patrick" to null and completely remove the key and value for
        "Ray".*/
    val nameTitleLookup: MutableMap<String, String?>
            = mutableMapOf("Mary" to "Engineer", "Patrick" to "Intern", "Ray" to
            "Hacker")
    println("La terapia: ${nameTitleLookup}")
    nameTitleLookup["Patrick"] = null
    nameTitleLookup.remove("Ray")
    println("Los cambios: ${nameTitleLookup}")

}
fun challengeSeven(){

}
fun challengeEight(){

}
fun challengeNine(){

}
fun challengeTen(){

}

fun printStringHigherThanEight(states: Map<String, String>) {
    for (state in states) {
        if (state.value.length > 8) {
            println(state.value)
        }
    }
}

fun mergeMaps(map1: Map<String, String>, map2: Map<String, String>): Map<String, String> {
    val mergedMap = mutableMapOf<String, String>()
    val map1Keys = map1.keys
    val map1Values = map1.values
    val map2Keys = map2.keys
    val map2Values = map2.values
    val higherSizedMap = if (map1.size >= map2.size) map1.size else map2.size
    for (index in 0 until higherSizedMap) {
        if (!(map1.keys.contains(map2Keys.elementAt(index)))) {
            if (map1Keys.count() >= index) mergedMap[map1Keys.elementAt(index)] = map1Values.elementAt(index)
        }
        if (map2Keys.count() >= index) mergedMap[map2Keys.elementAt(index)] = map2Values.elementAt(index)
    }
    return mergedMap
}

fun occurrencesOfCharacters(text: String): Map<Char, Int> {
    val overchargedMap = mutableMapOf<Char, Int>()
    for (char in text) {
        if (overchargedMap.keys.contains(char)) overchargedMap[char.toLowerCase()] = overchargedMap.getValue(char) + 1
        else overchargedMap[char] = 1
    }
    return overchargedMap.toSortedMap()
}

fun isInvertible(map: Map<String, Int>): Boolean {
    val newSet = mutableSetOf<Int>()
    try {
        newSet.addAll(map.values)
    } catch (e: Exception) {
        println(e)
    }
    val uniqueValues = newSet.distinct()
    return uniqueValues.toList() == map.values.toList()
}

