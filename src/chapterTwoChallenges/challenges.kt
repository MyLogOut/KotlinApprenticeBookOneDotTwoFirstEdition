package chapterTwoChallenges

import java.lang.Math.*
import java.text.DecimalFormat
import kotlin.math.pow

fun chapterTwoChallenges() {
    var exercisesSolved = 1
    val exercises = challengeOne(exercisesSolved)

    challengeTwo()
    exercisesSolved += 1
    println("Exercises solved until now: $exercisesSolved")

    challengeThree()
    exercisesSolved += 1
    println("Exercises solved until now: $exercisesSolved")

    challengeFour()
    exercisesSolved += 1
    println("Exercises solved until now: $exercisesSolved")

    challengeFive()
    exercisesSolved +=1
    println("Exercises solved until now: $exercisesSolved")

    challengeSix()
    exercisesSolved +=1
    println("Exercises solved until now: $exercisesSolved")

    challengeSeven()
    exercisesSolved +=1
    println("Exercises solved until now: $exercisesSolved")

    challengeEight()
    exercisesSolved +=1
    println("Exercises solved until now: $exercisesSolved")

    challengeNine()
    exercisesSolved +=1
    println("Exercises solved until now: $exercisesSolved out of $exercises")
}
fun challengeOne(exercisesSolved: Int): Int {
    val exercises = 9
    println("Exercises solved until now: $exercisesSolved")
    return exercises
}
fun challengeTwo() {
    var age = 16
    println("Age before: $age")
    age = 30
    println("Age after: $age")
}
fun challengeThree() {
    // Didn't understand the instructions
    val a = 46
    val b = 10

    // 1
    val answer1: Int = (a * 100) + b
    // 2
    val answer2: Int = (a * 100) + (b * 100)
    // 3
    val answer3: Int = (a * 100) + (b / 10)
    println("A value: $a.\nB value: $b.\nAnswer 1: $answer1.\nAnswer 2: $answer2.\nAnswer 3: $answer3.")
}
fun challengeFour() {
    println("Challenge 5 result: " + ((5 * 3) - (4 / (2 * 2))))
}
fun challengeFive() {
    val a = 46.0
    val b = 30.0
    val average = (a+b)/2

    println("A value: $a.\nB value: $b.\nAverage: $average.")
}
fun challengeSix() {
    var celsius = 28.0
    val fahrenheit: Double = ((celsius*9/5)+32)
    val decimalFormat = DecimalFormat("#.##")
    println("Hypothetical Current Temperature\nCelsius: $celsius to Fahrenheit: $fahrenheit . ")
    celsius = ((fahrenheit-32)*5/9)
    println("Fahrenheit: $fahrenheit to Celsius: ${decimalFormat.format(celsius).toDouble()} .\"")
}
fun challengeSeven() {
    val position: (Int) -> Int = { a: Int -> if(a>63) 0 else a}
    val cell: Int = position(((0..63).random()))
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
    println("Cell: $cell belongs to Row: ${row(cell)}, Column: ${column(cell)}.")
}
fun challengeEight() {
    val degrees = 73.00
    val toRadian: Double = PI/180
    //val toDegree: Double = 180/PI

    println("Degrees: $degrees to Radians: ${degrees*toRadian}")
}
fun challengeNine() {
    val x1 = 3.0
    val y1: Double = -12.0
    val x2: Double = -14.0
    val y2 = 5.0
    val decimalFormat = DecimalFormat("#.####")
    //sqrt((x2-x1).pow(2)+(y2-y1).pow(2)) formula derived from the
    //Pythagorean theorem
    println("Two-dimension distance between:\nx1: $x1\nx2: $x2\ny1: $y1\ny2: $y2\nDistance: ${decimalFormat.format(kotlin.math.sqrt((x2 - x1).pow(2) + (y2 - y1).pow(2)))} .")
}