package chapterFiveAdvancedControlFlow

import java.text.DecimalFormat


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
    var sum = 0
    for(i in 0..5) {//Number of iterations: 6
        sum += i
    }//Total value of sum: 15.
    println(sum)
}
fun challengeTwo() {
    var aLotOfAs = ""
    while (aLotOfAs.length < 10) {//0..9 range
        aLotOfAs += "a"
    }//There will be 10 instances of "a"
    println("aLotOfAs '$aLotOfAs:' ${aLotOfAs.count()}")
}
fun challengeThree() {
    val tripleMap: MutableMap<Int, Triple<Int, Int, Int>> = mutableMapOf()
    for (total in 0..4) {
        tripleMap[total] = when (total) {
            0->{ Triple(1, 5, 0) }
            1->{ Triple(2, 2, 2) }
            2->{ Triple(3, 0, 1) }
            3->{ Triple(3, 2, 5) }
            4->{ Triple(0, 2, 4) }
            else -> { Triple(0, 0, 0) }
        }
    }

    for ((key) in tripleMap) {
        val (x,y,z) = tripleMap.getValue(key)
        when {
            x == y && y == z -> println("x = y = z")
            z == 0 -> println("On the x/y plane")
            y == 0 -> println("On the x/z plane")
            x == 0 -> println("On the y/z plane")
            else -> println("Nothing special")
        }
    }
}
fun challengeFour(){
    //. A closed range can never be empty. Why?
    // Because it needs to iterate to be a range in the first place?
}
fun challengeFive(){
    //Print a countdown from 10 to 0. (Note: Do not use the downTo method)
    val countDown = (0..10).sortedDescending()
    for (values in countDown) {
        println("Count down from $values to 0: $values")
    }
}
fun challengeSix() {
    //6. Print 0.0, 0.1, 0.2, 0.3, 0.4, 0.5, 0.6, 0.7, 0.8, 0.9, 1.0
    val decimalFormat = DecimalFormat("#.#")
    var storage = 0.0
    for (values in 0..10){
        println(decimalFormat.format(storage).toDouble())
        storage += 0.1
    }
}
fun challengeSeven(){

}
fun challengeEight(){

}
fun challengeNine(){

}
fun challengeTen(){

}