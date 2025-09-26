// ============================================================================
// Console Input in Kotlin
// ============================================================================
// - The standard way to read user input from the console is `readLine()`.
// - readLine() reads a full line of text from standard input (keyboard).
// - It returns a nullable String (String?) because input can be null
//   (for example, if the end of stream is reached).
// ============================================================================

fun main() {

    // ------------------------------------------------------------
    // 1️⃣ Simple String input
    // ------------------------------------------------------------
    print("Enter your name: ")       // Prompt the user (no newline)
    val name: String? = readLine()    // Read input as nullable String
    // We can safely handle the nullable type using ?: (Elvis operator)
    val safeName: String = name ?: "Guest"
    println("Hello, $safeName!")      // Greet the user

    // ------------------------------------------------------------
    // 2️⃣ Reading an Int from console
    // ------------------------------------------------------------
    print("Enter your age: ")
    val ageInput: String? = readLine()
    // Convert String? to Int safely using toIntOrNull
    val age: Int = ageInput?.toIntOrNull() ?: 0
    println("Next year you will be ${age + 1} years old.")

    // ------------------------------------------------------------
    // 3️⃣ Reading Double (e.g., for decimal numbers)
    // ------------------------------------------------------------
    print("Enter your GPA (e.g., 3.5): ")
    val gpaInput: String? = readLine()
    val gpa: Double = gpaInput?.toDoubleOrNull() ?: 0.0
    println("Your GPA is $gpa")

    // ------------------------------------------------------------
    // 4️⃣ Example of multiple inputs on one line
    // ------------------------------------------------------------
    print("Enter two numbers separated by space: ")
    val numbers = readLine()?.split(" ")  // Splits input into list
    // Safely parse
    val firstNum = numbers?.getOrNull(0)?.toIntOrNull() ?: 0
    val secondNum = numbers?.getOrNull(1)?.toIntOrNull() ?: 0
    println("Sum = ${firstNum + secondNum}")

    // ------------------------------------------------------------
    // Notes:
    // - Always check for null or invalid format to avoid exceptions.
    // - readLine() returns text; convert to Int, Double, etc. as needed.
    // - In IDEs like IntelliJ, the console input works in the Run/Debug window.
}

    // ------------------------------------------------------------
    fun analyzeInput(input: Any) {
        when (input) {
            is String -> println("String of length ${input.length}")
            is Int -> println("Integer doubled: ${input * 2}")
            null -> println("Input is null")
            else -> println("Unknown type")
        }
    }

    analyzeInput("Kotlin") // String branch
    analyzeInput(100)      // Int branch
    analyzeInput(null)     // Null branch
    analyzeInput(3.14)     // Unknown type branch
}