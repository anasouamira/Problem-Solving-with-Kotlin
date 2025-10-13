import kotlin.random.Random

/* ===============================================================
   🧩 Example 1 — Same Logic as C++ Version (Educational)
   =============================================================== */

// Function to generate a random number between From and To
fun randomNumber(from: Int, to: Int): Int {
    return Random.nextInt(from, to + 1)
}

// Function to fill an array with random numbers
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

// Function to find the position (index) of a number in the array
fun findNumberPositionInArray(number: Int, arr: IntArray, arrLength: Int): Int {
    for (i in 0 until arrLength) {
        if (arr[i] == number)
            return i  // found → return index
    }
    return -1 // not found
}

// Function to read a number from the user
fun readNumber(): Int {
    print("\nPlease enter a number to search for? ")
    return readln().toInt()
}

fun main() {
    print("Enter number of elements: ")
    val arrLength = readln().toInt().coerceIn(1, 100)
    val arr = IntArray(100)

    fillArrayWithRandomNumbers(arr, arrLength)

    println("\nArray 1 elements:")
    printArray(arr, arrLength)

    val number = readNumber()
    println("\nNumber you are looking for is: $number")

    val numberPosition = findNumberPositionInArray(number, arr, arrLength)

    if (numberPosition == -1)
        println("The number is not found :-(")
    else {
        println("The number found at position: $numberPosition")
        println("The number found its order  : ${numberPosition + 1}")
    }
}


/* ===============================================================
   💎 Example 2 — Professional & Idiomatic Kotlin Version
   =============================================================== */

fun main2() {
    print("Enter number of elements: ")
    val n = readln().toInt().coerceIn(1, 100)

    // Generate list of random numbers from 1 to 100
    val numbers = List(n) { Random.nextInt(1, 101) }

    println("\nArray elements:")
    println(numbers.joinToString(" "))

    // Ask user for the number to search
    print("\nPlease enter a number to search for: ")
    val target = readln().toInt()

    println("\nNumber you are looking for is: $target")

    // Search for the number and show results
    val index = numbers.indexOf(target)
    if (index == -1) {
        println("The number is not found :-(")
    } else {
        println("The number found at position: $index")
        println("The number found its order  : ${index + 1}")
    }
}
