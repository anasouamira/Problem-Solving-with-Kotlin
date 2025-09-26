fun main() {

    // 1️⃣ If as Expression and Statement

    // Exercise 1 – Positive or Negative
    val n = readLine()!!.toInt()
    if (n > 0) {
        println("Positive")
    } else {
        println("Negative or Zero")
    }

    // Exercise 2 – Absolute Value
    val x = readLine()!!.toInt()
    val absX = if (x >= 0) x else -x  // if used as an expression
    println("Absolute: $absX")
}
