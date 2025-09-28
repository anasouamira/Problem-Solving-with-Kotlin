
fun main(){
    // Exercise 1 – Read and Print
// 1️⃣ Ask the user to type their name and store it in the variable `name`.
// 2️⃣ `readLine()` reads a line from the console as a String (nullable).
// 3️⃣ Print a greeting that includes the name (string template: $name).
    print("Enter your name: ")
    val name = readLine()
    println("Hello $name")

// Exercise 2 – Sum of Two Numbers
// 1️⃣ Ask for the first number and read it as String, then convert to Int using toInt().
//     We use `!!` because we assume the user will not enter null (but this can throw an exception if input is invalid).
// 2️⃣ Repeat for the second number.
// 3️⃣ Print the sum using string interpolation.
    print("Enter first number: ")
    val x = readLine()!!.toInt()
    print("Enter second number: ")
    val y = readLine()!!.toInt()
    println("Sum = ${x + y}")

// Exercise 3 – Safe Parse
// 1️⃣ Ask for a number and read it as String.
// 2️⃣ `toIntOrNull()` safely converts the string to Int or returns null if the input is not a valid number.
// 3️⃣ Print the result; could be an Int or null.
    print("Enter a number: ")
    val num = readLine()?.toIntOrNull()
    println("You entered: $num")

// Exercise 4 – Loop Until Number
// 1️⃣ Declare a nullable Int `n` to hold user input.
// 2️⃣ Use a `do-while` loop: it always runs at least once.
// 3️⃣ Inside the loop, ask for input and try to parse it with `toIntOrNull()`.
// 4️⃣ Repeat until the user enters a valid integer (n != null).
// 5️⃣ After the loop ends, print the valid number.
    var n: Int?
    do {
        print("Enter an integer: ")
        n = readLine()?.toIntOrNull()
    } while (n == null)
    println("Valid number: $n")

// Exercise 5 – Multiple Inputs
// 1️⃣ Ask the user to type several words separated by spaces.
// 2️⃣ `readLine()` reads the entire line as a single String or null.
// 3️⃣ `split(" ")` breaks the string into a List<String> by spaces.
// 4️⃣ Use Elvis operator `?:` to return an emptyList() if the input is null.
// 5️⃣ Use forEach to print each word on its own line.
    print("Enter words separated by space: ")
    val words = readLine()?.split(" ") ?: emptyList()
    words.forEach { println(it) }

}
