package chapterThreeTypesAndOperations

fun main() {
    val dateMMDDYY = Triple(3,1,2)
    val (month, day, year) = dateMMDDYY
    println("Month: $month, day: $day and year: $year")
    val (theMonth, _, theYear) = dateMMDDYY

    val (modifiedMonth, theSameYear) = Pair(theMonth + 4, theYear)
    println("modifiedMonth: $modifiedMonth, theSameYear: $theSameYear")

}