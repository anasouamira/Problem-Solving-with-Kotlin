// ==========================================================
// Example 1 : Same procedural style as the C++ version
// ==========================================================

import kotlin.math.abs

// Function to calculate the absolute value of a number manually
fun myAbs(number: Float): Float {
    return if (number > 0) number else number * -1
}

// Function to read a number from the user
fun readNumber(): Float {
    print("Please enter a number: ")
    return readLine()!!.toFloat()
}

fun main() {
    // --- First version (same as C++ logic) ---
    val number = readNumber()

    println("My abs Result : ${myAbs(number)}")
    println("Kotlin abs Result: ${abs(number)}")

    // ==========================================================
    // Example 2 : Professional Kotlin version (modern & clean)
    // ==========================================================
    println("\n================ Kotlin Professional Version ================\n")

    print("Enter a number: ")
    val input = readLine()!!.toFloat()

    // Manual abs using a single expression (expression body)
    val customAbs = if (input >= 0) input else -input

    // Print both results using string interpolation
    println("My abs Result : $customAbs")
    println("Kotlin abs Result: ${abs(input)}")
}
