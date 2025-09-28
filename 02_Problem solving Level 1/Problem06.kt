// 🔹 Question / Task:
// Write a program that reads a student's grade (0-100) and prints the corresponding letter grade:
// A: 90-100, B: 80-89, C: 70-79, D: 60-69, E: 50-59, F: below 50

import java.util.Scanner

// Function to read a grade between 0 and 100
fun readGrade(scanner: Scanner): Int {
    var grade: Int
    do {
        print("Enter the grade (0-100): ")
        grade = scanner.nextInt()
        if (grade < 0 || grade > 100) {
            println("Invalid grade! Please enter a value between 0 and 100.")
        }
    } while (grade < 0 || grade > 100)  // Repeat until valid input
    return grade
}

// Function to check and print the letter grade
fun checkAverage(grade: Int) {
    when {
        grade >= 90 -> println("Grade: A")
        grade >= 80 -> println("Grade: B")
        grade >= 70 -> println("Grade: C")
        grade >= 60 -> println("Grade: D")
        grade >= 50 -> println("Grade: E")
        else        -> println("Grade: F")
    }
}

fun main() {
    val scanner = Scanner(System.`in`)
    val grade = readGrade(scanner)   // Read valid grade
    checkAverage(grade)              // Print corresponding letter grade
}
