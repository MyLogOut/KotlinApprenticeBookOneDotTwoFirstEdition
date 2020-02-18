package sectionOne.chapterThreeTypesAndOperations

fun main(){ challenges() }
fun challenges() {
    challengeOne()
    challengeTwo(challengeOne())
    challengeThree()
    challengeFour()
    challengeFive()
    challengeSix()
    challengeSeven()
    challengeEight()
    challengeNine()
    challengeTen()
}
fun challengeOne(): Pair<Int, Int> {
    return (2 to 3)
}
fun challengeTwo(coordinates: Pair<Int, Int>){
    val (row, column) = coordinates
    println("Row: $row . Column: $column .")
}
fun challengeThree(){
    //val character: Character = "Dog" You should not initialize a Char data
                                // type with double quotes
    val character = 'd'
    val string = "Dog"
    //val string: String = 'd' You should not initialize a String data
                            // type with single quotes
    println("Character: $character belongs to $string String")
}
fun challengeFour(){
    val date = Triple(15, 8, 2015)
    //val day = date.First Not a valid parameter since it is
                        // not a good practice to capitalize
                        // names of variables, or fields
    println(date)
}
fun challengeFive(){
    val name = "Dick"
    //name += " Lucas" Constant value declarations can not be modified.
    println(name)
}
fun challengeSix(){
    val triple = Triple(100, 1.5, 10)
    val value = triple.second
    println("Data type: Double. Value: $value .")
}
fun challengeSeven(){
    val newDate = Triple(15, 8, 2015)
    val month = newDate.second
    println("Data type: Int.  Value: $month .")
}
fun challengeEight(){
    val number = 10
    val multiplier = 5
    val summary = "$number multiplied by $multiplier equals ${number *
            multiplier}"
    println("Data type: String. Value: $summary")
}
fun challengeNine() {
    val a = 4
    val b: Short = 100
    val c: Byte = 12
    println("Data type: Int. Value: ${(a+b)-c}")
}
fun challengeTen() {
    println("Difference between ${kotlin.math.PI} and ${kotlin.math.PI.toFloat()}\n" +
            "is: ${kotlin.math.PI.toFloat() - kotlin.math.PI}")
    //In text, the number of decimals, the lost of precision
    // between Double and Float, where Double is more
    // precise
}
