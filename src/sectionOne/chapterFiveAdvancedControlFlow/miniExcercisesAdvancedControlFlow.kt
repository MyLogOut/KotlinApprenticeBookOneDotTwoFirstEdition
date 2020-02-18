package sectionOne.chapterFiveAdvancedControlFlow

import kotlin.math.pow
import kotlin.math.sqrt

fun main() {
    val range = (0..10)

    for (values in range) {
        println(".pow($values): ${values.toDouble().pow(2)}")
    }
    for (values in range) {
        println("Sqrt($values): ${sqrt(values.toDouble())}")
    }

    var sum = 0
    for (row in 1 until 9 step 2) {
        for (column in 0 until 8) {
            sum += row * column
        }
    }
    println(sum)

    val age = readLine().toString().toInt()
    println(when (age){
        in 0..2 -> {"Infant"}
        in 3..12 -> {"Child"}
        in 13..19 -> {"Teenager"}
        in 20..39 -> {"Adult"}
        in 40..60 -> {"Middle aged"}
        else -> {"Elderly"}
    })
    val nameAndAge = Pair("Patrick", 24)
    println(when (nameAndAge.second){
        in 0..2 -> {"${nameAndAge.first} is an Infant."}
        in 3..12 -> {"${nameAndAge} is a Child."}
        in 13..19 -> {"${nameAndAge} is a Teenager."}
        in 20..39 -> {"${nameAndAge.first} is an Adult with ${nameAndAge.second} years old."}
        in 40..60 -> {"${nameAndAge} is a Middle aged."}
        else -> {"${nameAndAge} is an Elderly."}
    })
    println()
}