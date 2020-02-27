package sectionThree.chapterEleven

class Person (var firstName: String, var lastName: String) {
    val fullName
    get() = "$firstName $lastName"
}