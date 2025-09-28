// 🔹 Question / Task:
// Write a program that reads a person's age, whether they have a driver licence,
// and whether they have a recommendation. Then decide if the person is hired or rejected
// based on the following criteria:
// - The person is accepted if they are at least 21 years old OR have a driver licence,
//   AND they do NOT have a recommendation.
// - Keep asking until the person meets the criteria to be hired.

import java.util.Scanner

// Data class to hold person's information (equivalent to struct in C++)
data class PersonInfo(
    var age: Int,                   // Person's age
    var hasDriverLicence: Boolean,  // Does the person have a driver licence? (true = yes, false = no)
    var hasRecommendation: Boolean  // Does the person have a recommendation? (true = yes, false = no)
)

// Function to read person's information from user input
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

// Function to check if the person is accepted
fun isAccepted(person: PersonInfo): Boolean {
    // Accepted if age >= 21 OR has driver licence, AND does NOT have recommendation
    return (person.age >= 21 || person.hasDriverLicence) && !person.hasRecommendation
}

// Function to print result based on acceptance
fun printInfo(scanner: Scanner, person: PersonInfo) {
    // Keep asking while the person is NOT accepted
    var p = person
    while (!isAccepted(p)) {
        println("You are rejected")
        println("*****************************************")
        println("Enter again")
        p = readInfo(scanner) // Re-read the person's info
    }

    println("*****************************************")
    println("You are hired")
}

fun main() {
    val scanner = Scanner(System.`in`)
    printInfo(scanner, readInfo(scanner)) // Start the program by reading info and printing result
}
