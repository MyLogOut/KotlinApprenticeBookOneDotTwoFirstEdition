package sectionThree.chapterEleven

import java.util.*

fun main() {
    val lads: MutableList<Person> = (0..99).map { Person("Ruth", "VanNinstelroy") }.toMutableList()
    val joe = Person("Arjen", "Robben")
    println("Does Joe belongs to the group? ${memberOf(joe, lads)}")
    lads.add(Random().nextInt(10), joe)
    println("And now? ${memberOf(joe, lads)}")
}

fun memberOf(person: Person, group: List<Person>): Boolean {
    return group.contains(person)
}
