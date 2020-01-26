package chapterFourBasicControlFlow


import java.lang.NumberFormatException
import kotlin.math.log2
import kotlin.random.Random.Default.nextDouble

fun main() {
    challenges()
}
fun challenges() {
    challengeThree()
    challengeFour()
    challengeFive()
    challengeSix()
    challengeSeven()
    challengeEight()
    challengeNine()
    challengeTen()

}
fun challengeThree() {
    val position: (Int) -> Int = { a: Int -> if(a>63) 0 else a}
    var cell: Int = position(((0..63).random()))
    println(cell)
    val row: (Int) -> Int = {a: Int -> when (a){ in 0..7 -> 0; in 8..15 -> 1; in 16..23-> 2; in 24..31 -> 3; in 32..39 -> 4
        in 40..47 -> 5; in 48..55 -> 6; in 56..63 -> 7; else -> {println("Out of bounds");0}} }
    val column: (Int) -> Int = {a: Int -> when (a){
        in 0..56 step 8 -> 0
        in 1..57 step 8 -> 1
        in 2..58 step 8 -> 2
        in 3..59 step 8 -> 3
        in 4..60 step 8 -> 4
        in 5..61 step 8 -> 5
        in 6..62 step 8 -> 6
        in 7..63 step 8 -> 7
        else -> {println("Out of bounds");0}} }
    var counter = 0

    do {
        println("Cell: $cell belongs to Row: ${row(cell)}, Column: ${column(cell)}.")
        counter += 1
        cell = if (cell == 63) 0 else position((0..63).random())
    } while (counter < 128)

}
fun challengeFour(){

}
fun challengeFive(){

}
fun challengeSix(){
    var value: Any? = null
    do {
        value = try {value ?: readLine().toString().toDouble()} catch (exception: NumberFormatException) { println(exception); -1}
        println(value)
        val number = if (value is Double) nextDouble(0.0,value.toString().toDouble()) else (0..100).random().toDouble()
        val intNumber = (0..100).random()
        println("First number: $number")
        println("Log2($number):  ${log2(number)}") //log2(number)
        println("Module of $number: ${intNumber % 2}")

        println("Second number: $intNumber")
        println("Log2($intNumber):  ${log2(intNumber.toDouble())}")
        println("Module of $intNumber: ${intNumber % 2}")
        do { value = try {readLine()!!} catch (exception: NumberFormatException) { println(exception); -1 } }
        while (value == -1)
    } while (value != "exit")

}
fun challengeSeven(){
    // Not correctly working, needing to fix exclusion of 0 and 1 but I don't want to at this moment.
    @Suppress("CanBeVal")
    var value: Any? = null
    @Suppress("CanBeVal")
    do {
        var counter = 0
        var storage: MutableList<Double> = mutableListOf()
        println("Actual Storage Count: $storage")
        value = try {if (value.toString().isEmpty()) readLine().toString().toDouble() else value} catch (exception: NumberFormatException) { println(exception); -1}
            val number = if (value is Double) nextDouble(0.0,value.toString().toDouble()) else (0..100).random().toDouble()
            val intNumber = (0..100).random()
            println("First number: $number")
        if ((if (number==2.0) (log2(number)*2  % 2) else log2(number) % 2) == 0.0) {counter+=1; storage.add(log2(number))}
            println("Log2($number):  ${ log2(number) } ") //log2(number)
            println("Module of $number: ${intNumber % 2}")
        if (log2(intNumber.toDouble())  % 2 == 0.0) {counter+=1; storage.add(log2(intNumber.toDouble()))}
            println("Second number: $intNumber")
            println("Log2($intNumber): ${log2(intNumber.toDouble())} ")
            println("Module of $intNumber: ${intNumber % 2}")
            do { value = try {if (value.toString().isEmpty()) readLine().toString().toDouble() else null} catch (exception: NumberFormatException) { println(exception); -1 } }
            while (value == -1)
        } while (counter < 11)
}
fun challengeEight(){

}
fun challengeNine(){

}
fun challengeTen(){

}