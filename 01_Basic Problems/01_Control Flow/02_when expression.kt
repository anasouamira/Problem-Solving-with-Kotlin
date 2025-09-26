fun main() {
// 2️⃣ When Expression

    // Exercise 3 – Traffic Light
    val color = readLine()!!
    when (color) {
        "red" -> println("Stop")
        "yellow" -> println("Wait")
        "green" -> println("Go")
        else -> println("Unknown")
    }

    // Exercise 4 – Score to Grade
    val score = readLine()!!.toInt()
    when (score) {
        in 90..100 -> println("A")
        in 70..89 -> println("B")
        else -> println("C")
    }

    // Exercise 5 – Multiple Conditions
    val num = readLine()!!.toInt()
    when {
        num == 0 -> println("Zero")
        num > 0 && num % 2 == 0 -> println("Even and positive")
        else -> println("Odd")
    }
}
