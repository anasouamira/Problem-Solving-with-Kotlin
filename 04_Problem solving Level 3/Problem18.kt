/*
Problem18 |========================================================

Write a program to read a text and encrypt it, decrypt it.

Input :
Anas

Output :

Text Before Encryption : Anas
Text After Encryption  : Bobt
Text After Decryption  : Anas

===============================================================
*/

// ===========================================================
// Example 1 — Classic C++ Style Translation
// ===========================================================
fun encryptClassic(text: String, key: Int): String {
    val chars = text.toCharArray()
    for (i in chars.indices) {
        chars[i] = (chars[i].code + key).toChar() // Shift character by key
    }
    return String(chars)
}

fun decryptClassic(text: String, key: Int): String {
    val chars = text.toCharArray()
    for (i in chars.indices) {
        chars[i] = (chars[i].code - key).toChar() // Reverse shift by key
    }
    return String(chars)
}

// ===========================================================
// Example 2 — Optimized Kotlin Version
// ===========================================================
fun encryptOptimized(text: String, key: Int): String =
    text.map { (it.code + key).toChar() }.joinToString("")

fun decryptOptimized(text: String, key: Int): String =
    text.map { (it.code - key).toChar() }.joinToString("")

// ===========================================================
// Main Function
// ===========================================================
fun main() {
    print("Please enter Text? ")
    val text = readLine() ?: ""

    val key = 2

    // Classic Example
    val encryptedClassic = encryptClassic(text, key)
    val decryptedClassic = decryptClassic(encryptedClassic, key)

    println("\n--- Classic Approach ---")
    println("Text Before Encryption : $text")
    println("Text After Encryption  : $encryptedClassic")
    println("Text After Decryption  : $decryptedClassic")

    // Optimized Kotlin Example
    val encryptedOptimized = encryptOptimized(text, key)
    val decryptedOptimized = decryptOptimized(encryptedOptimized, key)

    println("\n--- Optimized Kotlin Approach ---")
    println("Text Before Encryption : $text")
    println("Text After Encryption  : $encryptedOptimized")
    println("Text After Decryption  : $decryptedOptimized")
}
