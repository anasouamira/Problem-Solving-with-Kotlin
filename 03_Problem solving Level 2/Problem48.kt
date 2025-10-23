// ===============================================================
// Problem 48 | Custom Floor Function without using built-in floor()
// ===============================================================

import kotlin.math.floor

// Function to find the floor of a floating-point number
// Floor of a number = greatest integer less than or equal to the number
fun myFloor(number: Float): Int {
    // If number is positive, floor is the integer part
    return if (number > 0)
        number.toInt()
    else {
        // If negative and not exact integer, subtract 1
        if (number == number.toInt().toFloat())
            number.toInt() // exact integer case
        else
            number.toInt() - 1
    }
}

// Function to read a floating-point number from user
fun readNumber(): Float {
    print("Please enter a number: ")
    return readLine()!!.toFloat()
}

fun main() {
    // Read number from user
    val number = readNumber()

    // Display result using custom floor function
    println("My Floor Result  : ${myFloor(number)}")

    // Display result using built-in Kotlin floor() function
    println("Kotlin floor Result: ${floor(number)}")

    // ==============================================================
    // Kotlin Professional Version (concise & expressive)
    // ==============================================================

    println("\n================ Kotlin Professional Version ================\n")

    print("Enter a number: ")
    val input = readLine()!!.toFloat()

    // One-line custom floor using expression body
    val customFloor = if (input >= 0 || input == input.toInt().toFloat())
        input.toInt()
    else
        input.toInt() - 1

    println("My Floor Result  : $customFloor")
    println("Kotlin floor Result: ${floor(input)}")
}
