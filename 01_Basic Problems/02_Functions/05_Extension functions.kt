// ===========================================
//  Extension Functions in Kotlin
// ===========================================

// 1️⃣ You can add new functions to an existing class
//     - without inheriting from the class
//     - without modifying its original code
//     - Great for adding utilities or helper methods

// Here we create an extension function for the String class
fun String.removeSpaces(): String {
    // 'this' refers to the String instance on which the function is called
    return this.replace(" ", "")
}

// Another example: extension for Int to check if it's even
fun Int.isEven(): Boolean {
    return this % 2 == 0
}

// You can also define extension functions for your own classes
data class Rectangle(val width: Int, val height: Int)

// Add an extension function to calculate area
fun Rectangle.area(): Int {
    return this.width * this.height
}

fun main() {
    // ===========================================
    // Using String extension
    val phrase = "Kotlin Extension Functions"
    println(phrase.removeSpaces())
    // Output: "KotlinExtensionFunctions"

    // Using Int extension
    val number = 42
    println("Is $number even? ${number.isEven()}")
    // Output: Is 42 even? true

    // Using Rectangle extension
    val rect = Rectangle(5, 10)
    println("Rectangle area = ${rect.area()}")
    // Output: Rectangle area = 50

    // ===========================================
    // Notes:
    // - Extension functions do NOT actually modify the class
    // - They are resolved statically (at compile time)
    // - They are very useful to add helper methods cleanly
    // ===========================================
}
