fun main() {
    // Exercise 13 – Skip and Stop
    for (i in 1..10) {
        if (i == 5) continue    // skip 5
        if (i == 8) break       // stop at 8
        println(i)
    }

    // Exercise 14 – Labeled Break
    outer@ for (i in 1..3) {
        for (j in 1..3) {
            if (i == 2 && j == 2) {
                println("Found")
                break@outer      // exit both loops
            }
            println("$i $j")
        }
    }
}

