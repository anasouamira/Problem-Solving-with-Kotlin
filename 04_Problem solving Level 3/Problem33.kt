import kotlin.random.Random

/* ===============================================================
   🧩 Example 1 — Same Methodology (as the C++ version)
   =============================================================== */

// Enum for character types
enum class CharType {
    SmallLetter,
    CapitalLetter,
    SpecialCharacter,
    Digit
}

// Function to generate a random number between From and To
fun randomNumber(from: Int, to: Int): Int {
    return Random.nextInt(from, to + 1)
}

// Function to get a random character based on character type
fun getRandomCharacter(charType: CharType): Char {
    return when (charType) {
        CharType.SmallLetter -> randomNumber(97, 122).toChar()
        CharType.CapitalLetter -> randomNumber(65, 90).toChar()
        CharType.SpecialCharacter -> randomNumber(33, 47).toChar()
        CharType.Digit -> randomNumber(48, 57).toChar()
    }
}

// Function to generate a random word of given length and character type
fun generateWord(charType: CharType, length: Int): String {
    var word = ""
    for (i in 1..length) {
        word += getRandomCharacter(charType)
    }
    return word
}

// Function to generate a key of format XXXX-XXXX-XXXX-XXXX
fun generateKey(): String {
    var key = ""
    key += generateWord(CharType.CapitalLetter, 4) + "-"
    key += generateWord(CharType.CapitalLetter, 4) + "-"
    key += generateWord(CharType.CapitalLetter, 4) + "-"
    key += generateWord(CharType.CapitalLetter, 4)
    return key
}

// Function to fill an array with generated keys
fun fillArrayWithKeys(arr: Array<String>, arrLength: Int) {
    for (i in 0 until arrLength) {
        arr[i] = generateKey()
    }
}

// Function to print the array elements
fun printStringArray(arr: Array<String>, arrLength: Int) {
    println("\nArray elements:\n")
    for (i in 0 until arrLength) {
        println("Array[$i] : ${arr[i]}")
    }
}

// Function to read a positive number
fun readPositiveNumber(message: String): Int {
    var number: Int
    do {
        print(message)
        number = readln().toIntOrNull() ?: 0
    } while (number <= 0)
    return number
}

fun main() {
    val arr = Array(100) { "" }
    val arrLength = readPositiveNumber("How many keys do you want to generate? ")

    fillArrayWithKeys(arr, arrLength)
    printStringArray(arr, arrLength)
}


/* ===============================================================
   💎 Example 2 — Professional & Idiomatic Kotlin Version
   =============================================================== */

fun main2() {
    print("How many keys do you want to generate? ")
    val count = readln().toInt().coerceIn(1, 100)

    // Helper lambda to generate one section of key
    val section = { (1..4).map { ('A'..'Z').random() }.joinToString("") }

    // Generate list of formatted keys
    val keys = List(count) { List(4) { section() }.joinToString("-") }

    println("\nArray elements:\n")
    keys.forEachIndexed { index, key ->
        println("Array[$index] : $key")
    }
}
