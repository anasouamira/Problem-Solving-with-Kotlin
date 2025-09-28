

fun main() {
   // ===== Exercise 10 – SAM conversion (Runnable) =====
fun exercise10() {
    val t = Thread { println("Running in thread") } // SAM conversion to Runnable
    t.start()
    t.join() // wait for thread to finish so output appears before program exit
}

}
