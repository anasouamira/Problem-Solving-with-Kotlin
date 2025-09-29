// 🔹 Question / Task:
// Write a program that reads a student's grade (0-100) and prints the corresponding letter grade:
// A: 90-100, B: 80-89, C: 70-79, D: 60-69, E: 50-59, F: below 50

import java.util.Scanner

// -----------------------------------------------------------
// Example 1 – Same methodology as the original C++ solution
// -----------------------------------------------------------

// Function to read a grade between 0 and 100
fun readGrade(scanner: Scanner): Int {
    var grade: Int
    do {
        print("Enter the grade (0-100): ")
        grade = scanner.nextInt()
        if (grade < 0 || grade > 100) {
            println("Invalid grade! Please enter a value between 0 and 100.")
        }
    } while (grade < 0 || grade > 100)
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

fun runExample1(scanner: Scanner) {
    val grade = readGrade(scanner)
    checkAverage(grade)
}

// -----------------------------------------------------------
// Example 2 – More Kotlin-idiomatic solution
// -----------------------------------------------------------
// Uses readLine(), safe parsing, and a single when block.

fun runExample2() {
    println("\n=== Example 2: Kotlin-idiomatic ===")
    print("Enter a grade (0–100): ")
    val grade = readLine()?.toIntOrNull()

    if (grade == null || grade !in 0..100) {
        println("Invalid grade! Please enter a value between 0 and 100.")
        return
    }

    val letter = when (grade) {
        in 90..100 -> "A"
        in 80..89  -> "B"
        in 70..79  -> "C"
        in 60..69  -> "D"
        in 50..59  -> "E"
        else       -> "F"
    }
    println("Grade: $letter")
}

// -----------------------------------------------------------
// Main
// -----------------------------------------------------------

fun main() {
    val scanner = Scanner(System.`in`)
    println("=== Example 1: Classic style ===")
    runExample1(scanner)

    // Then show the concise version
    runExample2()
}
