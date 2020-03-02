package sectionThree.chapterEleven

import sectionTwo.chapterTenLambdas.first

class Student(val id: Int,
              val firstName: String,
              val lastName: String,
              private val grades: MutableList<Grade> = mutableListOf(),
              private var credits: Double = 0.0
              ) {
    override fun hashCode(): Int {
        val prime = 31
        var result = 1

        result = prime*result + firstName.hashCode()
        result = prime*result + id
        result = prime*result + lastName.hashCode()

        return result
    }

    override fun equals(other: Any?): Boolean {
        val obj = other as Student?
        return when {
            this === other -> true
            other == null -> false
            javaClass != other.javaClass -> false
            firstName != obj?.firstName -> false
            id != obj.id -> false
            lastName != obj.lastName -> false
            else -> true
        }
    }

    override fun toString(): String {
        return "Student (firstName=$firstName, lastName=$lastName, id=$id)"
    }

    fun copy(id: Int = this.id,
             firstName: String = this.firstName,
             lastName: String = this.lastName
    ) = Student(id, firstName, lastName)

    fun recordGrade(grade: Grade) {
        grades.add(grade)
        credits += grade.credits
    }
    fun getGradePointAverage(): Double {
        var points = 0.0
        var credits = 0.0
        grades.forEach { points += it.points; credits = it.credits }
        return points/credits
    }
}