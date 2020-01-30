package chapterSevenNullability

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

fun challengeOne() {
    //The commented ones are invalid statements
    @Suppress("CanBeVal")
    var name: String? = "Ray"
    //var age: Int = null
    //val distance: Float = 26.7
    @Suppress("CanBeVal")
    var middleName: String? = null
    println("$name $middleName")
}
fun challengeTwo() {
    // Wrong answer of 2 from a misunderstanding
    // Correct answer on challengeFour()
    // There are 2 key pass to make this work: First it must be a multiple number of the divisor.
    // second the divisor must be different to 0
    val number = 10
    val divisor = 2
    val divisibleTimes = divideToZeroIfWhole(number, divisor)
    if (divisibleTimes != null) {
        println("Number of times [$number] can be divided by [$divisor]: $divisibleTimes")
    } else {
        println(divisibleTimes ?: "[$number] is not divisible by [$divisor]")
    }

}
fun challengeThree() {
    val number = 10
    val divisor = 3
    val divisibleTimes = divideToZeroIfWhole(number, divisor)
    println("Number of times [$number] can be divided by [$divisor]: ${divisibleTimes ?: 0} as an integer division")
}
fun challengeFour(){
    // This is the correct answer to challenge 2.
    val number = 10
    val divisor = 2
    val divisibleTimes = divideIfWhole(number, divisor)
    if (divisibleTimes != null) {
        println("Number of times [$number] can be divided by [$divisor]: $divisibleTimes")
    } else {
        println(divisibleTimes ?: "[$number] is not divisible by [$divisor]")
    }
}
fun challengeFive(){

}
fun challengeSix() {

}
fun challengeSeven(){

}
fun challengeEight(){

}
fun challengeNine(){

}
fun challengeTen(){

}
fun divideIfWhole(number: Int, divisor: Int): Int? {
    return if (divisor != 0 && number % divisor == 0) {
        println("Divisible: ${number.div(divisor)}.")
        number.div(divisor)
    } else null
}
fun divideToZeroIfWhole(number: Int, divisor: Int): Int? {
    var passedNumber: Int = number
    var divisible: Int
    var timesCounter = 0
    return if (divisor != 0 && number % divisor == 0) {
        do {
            divisible = passedNumber.div(divisor)
            timesCounter += if (number == 0) 0 else 1
            println("Divisible: $divisible. timesCounter: $timesCounter")
            passedNumber = divisible
        } while ((divisible % divisor == 0 && divisible != 0 && timesCounter != 1) || (divisible == 1 && timesCounter != 1 ))
        timesCounter
    } else null
}
