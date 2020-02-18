package sectionTwo.chapterEight

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
/*    1. Which of the following 1-10 are valid statements?
    1. val array1 = Array<Int>()
    2. val array2 = arrayOf()
    3. val array3: Array<String> = arrayOf() <<
    For the next three statements, array4 has been declared as:
    val array4 = arrayOf(1, 2, 3)
    4. println(array4[0]) <<
    5. println(array4[5])
    6. array4[0] = 4 <<
    For the final five statements, array5 has been declared as:
    val array5 = arrayOf(1, 2, 3)
    7. array5[0] = array5[1] <<
    8. array5[0] = "Six"
    9. array5 += 6
    10. for item in array5 { println(item) }*/

}
fun challengeTwo(){
    /*2. Write a function that removes the first occurrence of a given integer from a list of
            integers. This is the signature of the function:
    fun removeOne(item: Int, list: List<Int>): List<Int>*/
    val scores = listOf(4, 2, 3, 5, 8)
    val changedScores = removeElement(4, scores)
    println("Scores $scores")
    if (scores == changedScores) println("Item wasn't removed: $changedScores")
    else println("Item removed successfully: $changedScores")
}
fun challengeThree(){
    /*3. Write a function that removes all occurrences of a given integer from a list of
    integers. This is the signature of the function:
    fun remove(item: Int, list: List<Int>): List<Int>*/
    val scores = listOf(4, 2, 3, 4, 5, 8, 4)
    val changedScores = removeElements(4, scores)
    println("Scores: $scores")
    if (scores == changedScores) println("Items weren't removed: $changedScores")
    else println("Items removed successfully: $changedScores")
}
fun challengeFour(){
    /*4. Arrays and lists have a reverse() method that reverses all the elements in-place,
    that is, within the original array or list. Write a function that does a similar thing,
    without using reverse(), and returns a new array with the elements of the original
    array in reverse order. This is the signature of the function:
    fun reverse(array: Array<Int>): Array<Int>*/
    val scores = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
    val changedScores = reverseElementsOrder(scores)
    println("Scores: $scores\nReversed: $changedScores")
}
fun challengeFive(){
    /*5. The function below returns a random number between from (inclusive) and the to
            (exclusive):
    import java.util.Random
    val random = Random()
    fun rand(from: Int, to: Int) : Int {
        return random.nextInt(to - from) + from
    }
    Use it to write a function that shuffles the elements of an array in random order. This is
    the signature of the function:
    fun randomized(array: Array<Int>): Array<Int>*/
    val scores = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
    println("Original array: ${scores.toList()}\nRandomized array: ${randomizeArray(scores).toList()}")
}
fun challengeSix(){
    /*6. Write a function that calculates the minimum and maximum value in an array of
            integers. Calculate these values yourself; don’t use the methods min and max. Return
    null if the given array is empty.
    This is the signature of the function:
    fun minMax(numbers: Array<Int>): Pair<Int, Int>?
    Hint: You can use the Int.MIN_VALUE and Int.MAX_VALUE constants within the function.*/
    val scores = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
    val minMaxScores = minMaxValueFromArray(scores)
    println("Min score: ${minMaxScores?.first} .\nMax score: ${minMaxScores?.second} .")
}
fun challengeSeven(){

}
fun challengeEight(){

}
fun challengeNine(){

}fun challengeTen(){

}

fun removeElement(element: Int, list: List<Int>): List<Int> {
    val newList: MutableList<Int> = list.toMutableList()
    for (item in list) {
        return if (item == element) {
            newList.remove(element)
            newList
        } else list
    }
    return list
}

fun removeElements(element: Int, list: List<Int>): List<Int> {
    val newList: MutableList<Int> = list.toMutableList()
    for (item in list) {
        if (item == element) {
            newList.remove(item)
        }
    }
    return newList
}

fun reverseElementsOrder(list: List<Int>): List<Int> {
    val reversedList = mutableListOf<Int>()
    for ((index, item) in (list.size - 1 downTo 0).withIndex()) {
        reversedList.add(index, list[item])
    }
    return reversedList
}

fun randomizeArray(array: Array<Int>): Array<Int> {
    val newArray: Array<Int> = Array(array.size) {-1}
    val randomElementsHistory = mutableListOf<Int>()
    var actualRandomElement: Int
    val getNextRandomElement: (Array<Int>) -> Int =
        { number: Array<Int> -> (number.indices).random() }

    while (randomElementsHistory.size != array.size) {
        for (element in array) {
            do {
                actualRandomElement = getNextRandomElement(array)
            } while(actualRandomElement in randomElementsHistory)
            randomElementsHistory.add(actualRandomElement)

            newArray[actualRandomElement] = element
        }
    }

    return newArray
}

fun minMaxValueFromArray(array: Array<Int>): Pair<Int, Int>? {
    var min = array[0]
    var max = array[0]
    for (elements in array) {
        if (elements >= Int.MIN_VALUE && elements <= Int.MAX_VALUE) {
            if ((elements <= min)) min = elements
            if ((elements >= max)) max = elements
        } else return null
    }
    return (min to max)
}

