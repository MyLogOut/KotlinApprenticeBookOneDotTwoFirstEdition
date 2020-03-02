package sectionThree.chapterEleven

import java.util.*

fun main() {
    val john = Person("John", "Wick")
    println(john.fullName)
    println(john.fullName)
    val marcus = john
    marcus.firstName = "Tyron"
    println(marcus.fullName)
    println(john.fullName)

    println("Are John and Marcus the same person? ${john === marcus}")

    val impostors = (0..100).map { Person("Tyron", "Shaquil") }

    println("Is here any match with John? ${impostors.map { it.firstName == "Tyron" && it.lastName == "Shaquil" }.contains(true)}")

    println("Does John is among those impostors? ${impostors.contains(john)}")

    val mutableImpostors = mutableListOf<Person>()
    mutableImpostors.addAll(impostors)
    println("Does this new impostor matches contains John? ${mutableImpostors.contains(john)}")
    mutableImpostors.add(Random().nextInt(5), john)
    println("And now? ${mutableImpostors.contains(john)}")
    val indexOfJohn = mutableImpostors.indexOf(john)
    if (indexOfJohn != -1) mutableImpostors[indexOfJohn].lastName = "Band"
    println("So our guy is: ${mutableImpostors[indexOfJohn].fullName}")

    val jane = Student(0,"Jane", "lastName")
    val history = Grade(letter = "B", points = 9.0, credits = 3.0)
    var math = Grade(letter = "A", points = 16.0, credits = 4.0)

    jane.recordGrade(history)
    jane.recordGrade(math)

    math = Grade("A",20.0,5.0)
    jane.recordGrade(math)
    println("${jane.getGradePointAverage()}")

    val albert = Student(1,"Albert", "Einstein")
    val richard = Student(2, "Richard", "Feynman")

    val albertCopy = albert.copy()

    println("Albert: $albert")
    println("Richard: $richard")
    println("Is Albert and Richard's content equal? ${albert == richard}")
    println("Is Albert and AlbertCopy's content equal? ${albert == albertCopy}")
    println("Are Albert and AlbertCopy references the same? ${albert === albertCopy}")

    val marie = StudentData(0,"Marie", "Curie")
    val emmy = StudentData(1, "Emmy", "Nether")
    val marieCopy = marie.copy()

    println(marie)
    println(emmy)
    println("Is Marie and Emmy's content equal? ${marie == emmy}")
    println("Is Marie and MarieCopy's content equal? ${marie == marieCopy}")
    println("Are Marie and MarieCopy referencing the same? ${marie === marieCopy}")

}