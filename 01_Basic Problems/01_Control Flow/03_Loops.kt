fun main() {
// Exercise 6 – Count Up
    for (i in 1..10) println(i)

    // Exercise 7 – Count Down
    for (i in 10 downTo 1) println(i)

    // Exercise 8 – While Input
    var input: Int
    do {
        input = readLine()!!.toInt()
    } while (input != 0)

    // Exercise 9 – Do-While Guess
    var word: String
    do {
        word = readLine()!!
    } while (word != "kotlin")

}
