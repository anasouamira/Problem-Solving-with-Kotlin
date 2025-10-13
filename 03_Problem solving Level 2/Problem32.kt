import kotlin.random.Random

/* ===============================================================
   🧩 Example 1 — Same Methodology (as the C++ version)
   =============================================================== */

// Function to generate a random number between From and To (inclusive)
fun randomNumber(from: Int, to: Int): Int {
    return Random.nextInt(from, to + 1)
}

// Function to fill an array with random numbers
fun fillArrayWithRandomNumbers(arr: IntArray, size: Int): IntArray {
    for (i in 0 until size) {
        arr[i] = randomNumber(1, 100)
    }
    return arr
}

// Function to print an array
fun printArray(arr: IntArray, size: Int) {
    for (i in 0 until size) {
        print("${arr[i]} ")
    }
    println()
}

// Function to copy array into another in reverse order
fun copyArrayInReverseOrder(source: IntArray, destination: IntArray, size: Int) {
    for (i in 0 until size) {
        destination[i] = source[size - 1 - i]
    }
}

fun main() {
    print("Enter number of elements: ")
    val size = readln().toInt()

    val arr = IntArray(100)
    val arr2 = IntArray(100)

    fillArrayWithRandomNumbers(arr, size)
    copyArrayInReverseOrder(arr, arr2, size)

    println("\nArray 1 elements:")
    printArray(arr, size)

    println("\nArray 2 elements after copying in reversed order:")
    printArray(arr2, size)
}


/* ===============================================================
   💎 Example 2 — Professional & Idiomatic Kotlin Version
   =============================================================== */

fun main2() {
    print("Enter number of elements: ")
    val size = readln().toInt().coerceIn(1, 100) // ensures between 1 and 100

    // Create array1 with random numbers and array2 as reversed copy
    val array1 = IntArray(size) { Random.nextInt(1, 101) }
    val array2 = array1.reversedArray()

    println("\nArray 1 elements:")
    println(array1.joinToString(" "))

    println("\nArray 2 elements after copying in reversed order:")
    println(array2.joinToString(" "))
}
