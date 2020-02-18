package sectionOne.chapterSixFunctions

fun main() {
    printFullName(firstName = "Patrick",lastName = "Duarte")
    val fullName = calculateFullname("Patrick","Duarte")
    println(fullName)
    val fullNameWithLength = calculateFullname(Pair("Patrick","Duarte"))
    println(fullNameWithLength)
}
fun printFullName(firstName: String, lastName: String) {
    println("$firstName $lastName")
}
fun calculateFullname(firstName: String, secondName: String): String {
    return ("$firstName $secondName")
}
fun calculateFullname(fullName: Pair<String, String>): Pair<String, Int> {
    return Pair("${fullName.first} ${fullName.second}", fullName.first.length + fullName.second.length)
}