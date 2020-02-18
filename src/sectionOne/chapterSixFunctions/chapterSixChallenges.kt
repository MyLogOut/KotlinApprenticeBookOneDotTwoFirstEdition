package sectionOne.chapterSixFunctions

import java.lang.Integer.sum

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
    val number = 5
    val divisor = 1
    println("Is this number [$number] divisible by [$divisor]? It is ${isNumberDivisible(number,divisor)}")
    println("Is this number [$number] part of prime numbers? It is ${isPrime(number)}")
}//Gettin Prime numbers
fun challengeTwo() {
    for (toFibonacci in 0..20) {
        println("Fibonacci number of [$toFibonacci]: ${fibonacciSequence(toFibonacci)}")
    } // 1, 1, 2, 3, 5, 8, 13, 55
}
fun challengeThree() {

}
fun challengeFour(){

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
fun isNumberDivisible(number: Int, @Suppress("UNUSED_PARAMETER") divisor: Int): Boolean{
    return number % 2 == 0 || number % 2 == number
}
fun isPrime(number: Int): Boolean {
    var isPrime = false
    return if (number < 0) false
    else {
        for (elements in 2..(number)) {
            println("Number: [$number] divisible by [$elements], modulo: [${number % elements}]")
            if (number % elements == 0 && elements != number || number / 1 != number) {
                isPrime = false
                break
            } else isPrime = true
        }; isPrime
    }
}

fun fibonacciSequence(number: Int): Int {
    var previousValue = 0
    var actualValue = 1
    var sumContainer: Int
    val numberSum = ::sum
    sumContainer = if (number == 1 || number == 2) { return numberSum(1, 0)} else 0
    return if (number == 0) number else {
        for (counter in 2..number) {
            sumContainer = if (number == 1 || number == 2) numberSum(1, 0)
            else {
                sumContainer = numberSum(actualValue, previousValue)
                previousValue = actualValue
                actualValue = sumContainer
                sumContainer}
        }
        sumContainer
    }
}
