package sectionTwo.chapterTenLambdas

import sectionOne.chapterSixFunctions.fibonacciSequence

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
    /*Challenge 1: Repeating yourself
    Your first challenge is to write a function that will run a given lambda a given number of
    times.
        Declare the function like so:
    fun repeatTask(times: Int, task: () -> Unit)
    The function should run the task lambda times number of times.
        Use this function to print "Kotlin Apprentice is a great book!" 10 times.*/
    val textString = "Kotlin Apprentice is a great book!"
    val theLambda: () -> Unit = { println(textString) }
    val times = 10
    repeatTask(times, theLambda)
}
fun challengeTwo(){
    /*Challenge 2: Lambda sums
    In this challenge, you’re going to write a function that you can reuse to create different
    mathematical sums.
    Declare the function like so:
    fun mathSum(length: Int, series: (Int) -> Int) -> Int
    The first parameter, length, defines the number of values to sum. The second
    parameter, series, is a lambda that can be used to generate a series of values. series
    should have a parameter that is the position of the value in the series and return the
    value at that position.
    mathSum should calculate length number of values, starting at position 1, and return
    their sum.
    Use the function to find the sum of the first 10 square numbers, which equals 385. Then
    use the function to find the sum of the first 10 Fibonacci numbers, which equals 143.
    For the Fibonacci numbers, you can use the function you wrote in the challenges of the
    functions chapter — or grab it from the solutions if you’re unsure what you’ve done is
    correct.*/
    val length = 10
    var result = mathSum(length) { it * it}
    println("First 10 squared numbers, which equals 385: $result")
    result = mathSum(length, ::fibonacciSequence)
    println("First 10 Fibonacci numbers, which equals 143: $result\n-------------------")
}
fun challengeThree(){
    /*Challenge 3: Functional ratings
    In this final challenge, you will have a list of app names with associated ratings they’ve
    been given. Note — these are all fictional apps!
    Create the data map like so:
    val appRatings = mapOf(
        "Calendar Pro" to arrayOf(1, 5, 5, 4, 2, 1, 5, 4),
        "The Messenger" to arrayOf(5, 4, 2, 5, 4, 1, 1, 2),
        "Socialise" to arrayOf(2, 1, 2, 2, 1, 2, 4, 2)
    )
    First, create a map called averageRatings which will contain a mapping of app names to
    average ratings. Use forEach to iterate through the appRatings map, then use reduce to
    calculate the average rating and store this rating in the averageRatings map.
    Finally, use filter and map chained together to get a list of the app names whose
    average rating is greater than 3.*/
    val appRatings = mutableMapOf<String, Array<Int>>()
    appRatings["Calendar Pro"] = arrayOf(1, 5, 5, 4, 2, 1, 5, 4)
    appRatings["The Messenger"] = arrayOf(5, 4, 2, 5, 4, 1, 1, 2)
    appRatings["Socialise"] = arrayOf(2, 1, 2, 2, 1, 2, 4, 2)
    val averageRatings: MutableMap<String, Double> = mutableMapOf()
    appRatings.forEach { averageRatings[it.key] = appRatings[it.key]!!.average() }
    println("AverageRatings [with my way of doing it]: $averageRatings}")
    averageRatings.clear()
    appRatings.forEach { appRatings[it.key]?.average()?.let { it1 -> averageRatings.put(it.key, it1) } }
    println("AverageRatings [with compiler's recommended way of doing it]: $averageRatings")
    averageRatings.clear()
    appRatings.forEach { averageRatings[it.key] = it.value.reduce { a, b -> a + b }.div(appRatings[it.key]!!.toList().count().toDouble()) }

    println("AverageRatings [With Indicated way of doing it]: $averageRatings")

}
fun challengeFour(){

}
fun challengeFive(){

}
fun challengeSix(){

}
fun challengeSeven(){

}
fun challengeEight(){

}
fun challengeNine(){

}
fun challengeTen(){

}

fun repeatTask(times: Int, task: () -> Unit) {
    for (iteration in 0 until times) {
        print("$iteration. ")
        run(task)
    }
}

fun mathSum(length: Int, series: (Int) -> Int): Int {
    var result = 0
    for (iteration in 0..length) {
        result += series(iteration)
    }
    return result
}

fun fibonacci(number: Int): Int {
    if (number <= 0) {
        return 0
    }
    if (number == 1 || number == 2) {
        return 1
    }
    return fibonacci(number - 1) + fibonacci(number - 2)
}