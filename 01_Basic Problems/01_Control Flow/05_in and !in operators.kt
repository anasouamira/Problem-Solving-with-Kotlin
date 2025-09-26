fun main() {
    // Exercise 11 – Range Check
    val age = readLine()!!.toInt()
    if (age in 18..60) println("Allowed") else println("Not allowed")

    // Exercise 12 – Outside Range
    val x2 = readLine()!!.toInt()
    if (x2 !in 1..100) println("Out of range") else println("In range")
}
