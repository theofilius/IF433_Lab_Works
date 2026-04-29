package oop_00000107586_Theofilius.week09

data class Student(
    val name: String,
    val score: Int
)

fun main() {
    val students = listOf(
        Student("Andi", 85),
        Student("Budi", 72),
        Student("Citra", 90),
        Student("Dewi", 60),
        Student("Eko", 78)
    )

    println("Students: $students")

    val topStudentNames = students
        .filter { it.score >= 75 }
        .sortedBy { it.score }
        .map { it.name }

    println("Top student names: $topStudentNames")
}
