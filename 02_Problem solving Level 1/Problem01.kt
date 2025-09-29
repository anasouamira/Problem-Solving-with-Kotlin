// 🔹 Question / Task:
// Write a program that reads a person's age, whether they have a driver licence,
// and whether they have a recommendation. Then decide if the person is hired or rejected
// based on the following criteria:
// - The person is accepted if they are at least 21 years old OR have a driver licence,
//   AND they do NOT have a recommendation.
// - Keep asking until the person meets the criteria to be hired.

import java.util.Scanner

// ------------------------------------------------------------------
// Example 1 – Same methodology as the original (struct-like, looped)
// ------------------------------------------------------------------

data class PersonInfo(
    var age: Int,                   // Person's age
    var hasDriverLicence: Boolean,  // Driver licence? true/false
    var hasRecommendation: Boolean  // Recommendation? true/false
)

// Read input exactly like the C++ version
fun readInfo(scanner: Scanner): PersonInfo {
    println("*****************************************")
    print("Enter your Age: ")
    val age = scanner.nextInt()

    print("Do you have Driver Licence? Enter number (yes = 1 / no = 0): ")
    val hasDriverLicence = scanner.nextInt() == 1

    print("Do you have Recommendation? Enter number (yes = 1 / no = 0): ")
    val hasRecommendation = scanner.nextInt() == 1

    return PersonInfo(age, hasDriverLicence, hasRecommendation)
}

// Check if person is accepted
fun isAccepted(person: PersonInfo): Boolean {
    return (person.age >= 21 || person.hasDriverLicence) && !person.hasRecommendation
}

// Loop until accepted
fun runExample1(scanner: Scanner) {
    var p = readInfo(scanner)
    while (!isAccepted(p)) {
        println("You are rejected")
        println("*****************************************")
        println("Enter again")
        p = readInfo(scanner)
    }
    println("*****************************************")
    println("You are hired")
}

// ------------------------------------------------------------------
// Example 2 – More Kotlin-idiomatic solution
// ------------------------------------------------------------------
// Uses readLine(), nullable parsing, and a single loop without a separate data class.

fun runExample2() {
    println("\n=== Example 2: Kotlin-idiomatic ===")
    while (true) {
        print("Enter age: ")
        val age = readLine()?.toIntOrNull() ?: continue

        print("Driver licence? (1=yes, 0=no): ")
        val hasLicence = readLine()?.toIntOrNull() == 1

        print("Recommendation? (1=yes, 0=no): ")
        val hasRecommendation = readLine()?.toIntOrNull() == 1

        val accepted = (age >= 21 || hasLicence) && !hasRecommendation
        if (accepted) {
            println("You are hired")
            break
        } else {
            println("You are rejected — please try again\n")
        }
    }
}

// ------------------------------------------------------------------
// Main
// ------------------------------------------------------------------

fun main() {
    val scanner = Scanner(System.`in`)
    println("=== Example 1: Classic style ===")
    runExample1(scanner)

    // Then show the idiomatic version
    runExample2()
}
