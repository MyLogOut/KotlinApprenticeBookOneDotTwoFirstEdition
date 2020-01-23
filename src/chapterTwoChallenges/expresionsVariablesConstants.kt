package chapterTwoChallenges

fun main() {
    val myAge = 24
    var averageAge: Double = myAge.toDouble()

    averageAge = (averageAge+30)/2

    println(averageAge)

    val testNumber = 3
    val evenOdd = testNumber % 2
    println(evenOdd)
    for (count in 0..testNumber){
        println("${(count + testNumber) % 2} : ${(count + testNumber % 2)}")
    }

    chapterTwoChallenges()
}