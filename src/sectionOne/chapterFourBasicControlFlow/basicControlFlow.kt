package sectionOne.chapterFourBasicControlFlow

fun main() {
    val teenAge = 13..19
    val myAge = 24
    val theirAge = 30
    val isTeenager = {a: Int -> a in teenAge }
    println(isTeenager(myAge))
    val bothTeenagers = {a: Int,b: Int -> a in teenAge && b in teenAge}
    println(bothTeenagers(myAge,theirAge))

    val reader = "Patrick"
    val author = "Richard Lucas"
    val authorIsReader = {theAuthor: String, theReader: String -> author.compareTo(reader) == 0 }
    println(authorIsReader(author,reader))

    val readerBeforeAuthor = {theAuthor: String, theReader:String -> reader < author}
    println(readerBeforeAuthor(author,reader))
}