package sectionTwo.chapterTenLambdas

fun main() {
    miniExercises()
}

fun miniExercises() {
    val nameList = listOf("Laury", "Eternal", "Pebels", "Jhon")
    first(nameList)
    second(nameList)
    third(nameList)
}
fun first(nameList: List<String>) {
    /*1. Create a constant list called nameList which contains some names as strings. Any
            names will do — make sure there’s more than three. Now use fold to create a string
    which is the concatenation of each name in the list.*/
    val nameListFold = nameList.fold("") { a, b -> "$a, $b"}
    println("Name list: $nameList\nName list Fold [.fold]$nameListFold")
}

fun second(nameList: List<String>) {
    /*2. Using the same nameList list, first filter the list to contain only names which have
    more than four characters in them, and then create the same concatenation of
    names as in the above exercise. (Hint: you can chain these operations together.)*/
    val onlyLengthHigherThanFour = nameList.filter { it.length > 4 }
    println("Only length higher than four characters on their names: $onlyLengthHigherThanFour")
    first(onlyLengthHigherThanFour)
}

fun third(nameList: List<String>) {
    /*3. Create a constant map called namesAndAges which contains some names as strings
            mapped to ages as integers. Now use filter to create a map containing only people
            under the age of 18.*/
    val namesAndAge = mutableMapOf<String, Int>()
    println("Names: $nameList")
    nameList.withIndex().forEach { namesAndAge[it.value] = it.index+15 }
    println("With their age: $namesAndAge")
    val teenagerOnly = namesAndAge.filter { it.value < 18 }
    println("Teenagers Only [Below Eighteen years old]: $teenagerOnly")
    fourth(namesAndAge)
}

fun fourth(namesAndAge: Map<String, Int>) {
    /*4. Using the same namesAndAges map, filter out the adults (those 18 or older) and then
    use map to convert to a list containing just the names (i.e., drop the ages).*/
    val namesOnly = namesAndAge.filter { it.value <= 18 }.keys.toList()
    println("Names and ages: $namesAndAge")
    println("Names and adults only: ${namesAndAge.filter { it.value >= 18 }}")
    println("Names only: $namesOnly")
}