import kotlin.random.Random

/* ===============================================================
   🧩 Example 1 — Educational Version (Same Logic as C++)
   =============================================================== */

// Function to read a number from the user
fun readNumber(): Int {
    print("\nPlease enter a number to search for? ")
    return readln().toInt()
}

// Function to generate a random number
fun randomNumber(from: Int, to: Int): Int {
    return Random.nextInt(from, to + 1)
}

// Function to fill array with random numbers between 1 and 100
fun fillArrayWithRandomNumbers(arr: IntArray, arrLength: Int): IntArray {
    for (i in 0 until arrLength)
        arr[i] = randomNumber(1, 100)
    return arr
}

// Function to print array elements
fun printArray(arr: IntArray, arrLength: Int) {
    for (i in 0 until arrLength)
        print("${arr[i]} ")
    println()
}

// Function to find number position in array (return -1 if not found)
fun findNumberPositionInArray(number: Int, arr: IntArray, arrLength: Int): Int {
    for (i in 0 until arrLength) {
        if (arr[i] == number)
            return i
    }
    return -1
}

// Function to check if number exists in array
fun isNumberInArray(number: Int, arr: IntArray, arrLength: Int): Boolean {
    return findNumberPositionInArray(number, arr, arrLength) != -1
}

// MAIN — Educational Version
fun main() {
    print("Enter number of elements: ")
    val arrLength = readln().toInt().coerceIn(1, 100)
    val arr = IntArray(100)

    fillArrayWithRandomNumbers(arr, arrLength)

    println("\nArray 1 elements:")
    printArray(arr, arrLength)

    val number = readNumber()
    println("\nNumber you are looking for is: $number")

    if (!isNumberInArray(number, arr, arrLength))
        println("No, The number is not found :-(")
    else
        println("Yes, The number is found :-)")
}


/* ===============================================================
   💎 Example 2 — Professional Kotlin Version
   =============================================================== */

fun main2() {
    print("Enter number of elements: ")
    val n = readln().toInt().coerceIn(1, 100)

    // Generate random list
    val numbers = List(n) { Random.nextInt(1, 101) }

    println("\nArray elements:")
    println(numbers.joinToString(" "))

    print("\nPlease enter a number to search for: ")
    val target = readln().toInt()

    println("\nNumber you are looking for is: $target")

    // Use idiomatic Kotlin list operations
    if (target in numbers)
        println("Yes, The number is found :-)")
    else
        println("No, The number is not found :-(")
}
