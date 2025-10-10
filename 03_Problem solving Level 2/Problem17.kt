/*
Problem17 |========================================================

Write a program to guess a 3-Letter Password (all capital)?

Input :
AAD

Output :
Trial[1] : AAA
Trial[2] : AAB
...
Password is AAD
Found After 4 Trial(s)
===============================================================
*/

// ===========================================================
// Example 1 — Classic C++ Style Logic
// ===========================================================
fun guessPasswordClassic(originalPassword: String) {
    var word: String
    var counter = 0

    println("\n--- Classic Approach ---")

    for (i in 65..90) {      // First letter A-Z
        for (j in 65..90) {  // Second letter A-Z
            for (k in 65..90) { // Third letter A-Z
                word = "${i.toChar()}${j.toChar()}${k.toChar()}"
                counter++

                println("Trial [$counter] : $word")

                if (word == originalPassword) {
                    println("\nPassword is $word")
                    println("Found after $counter Trial(s)")
                    return
                }
            }
        }
    }
}

// ===========================================================
// Example 2 — Optimized Kotlin Version
// ===========================================================
fun guessPasswordOptimized(originalPassword: String) {
    var counter = 0

    println("\n--- Optimized Kotlin Approach ---")

    ('A'..'Z').forEach { first ->
        ('A'..'Z').forEach { second ->
            ('A'..'Z').forEach { third ->
                counter++
                val word = "$first$second$third"
                println("Trial [$counter] : $word")
                if (word == originalPassword) {
                    println("\nPassword is $word")
                    println("Found after $counter Trial(s)")
                    return
                }
            }
        }
    }
}

// ===========================================================
// Main Function
// ===========================================================
fun main() {
    print("Please enter a 3-Letter Password (all capital)? ")
    val password = readLine()?.uppercase() ?: "AAA"

    // Classic approach
    guessPasswordClassic(password)

    // Optimized approach
    guessPasswordOptimized(password)
}
