fun main() {
   // Exercise 7 – Calculator with Local Helper
fun calculate() {
    // local helper function
    fun add(x: Int, y: Int): Int {
        return x + y
    }
    println("Sum is: ${add(5, 7)}")
}
}
