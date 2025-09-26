// ============================================================================
// SAM Conversion in Kotlin
// ============================================================================
// SAM = Single Abstract Method
// It refers to an interface (usually a Java functional interface)
// that has exactly ONE abstract method.
// Kotlin can automatically convert a lambda into an instance
// of that interface, making code shorter and cleaner.
//
// This feature is most common when using Java APIs from Kotlin
// (e.g., Runnable, Comparator, listeners, etc.).
// ============================================================================

// --------------------------------------------------------------
// 1️⃣ Example with a Java functional interface: Runnable
// --------------------------------------------------------------
// Runnable has ONE abstract method: run()
fun runTask(r: Runnable) {
    r.run()
}

fun main() {
    // ----------------------------------------------
    // ✅ Without SAM conversion (classic way)
    // ----------------------------------------------
    val runnable1 = object : Runnable {
        override fun run() {
            println("Running with anonymous object!")
        }
    }
    runTask(runnable1)

    // ----------------------------------------------
    // ✅ With SAM conversion using a lambda
    // ----------------------------------------------
    // Kotlin detects that Runnable has only one abstract method,
    // so we can simply pass a lambda.
    runTask {
        println("Running with SAM conversion!")
    }

    // --------------------------------------------------------------
    // 2️⃣ Another example: Java Comparator
    // --------------------------------------------------------------
    // Comparator<T> has one abstract method: compare(T, T)
    val numbers = listOf(5, 3, 8, 1)

    // Without SAM conversion:
    val comparatorOld = object : Comparator<Int> {
        override fun compare(a: Int, b: Int): Int = a - b
    }
    println(numbers.sortedWith(comparatorOld)) // [1, 3, 5, 8]

    // With SAM conversion:
    val comparatorNew = Comparator<Int> { a, b -> a - b }
    println(numbers.sortedWith(comparatorNew)) // [1, 3, 5, 8]

    // --------------------------------------------------------------
    // 3️⃣ Custom Functional Interface in Kotlin
    // --------------------------------------------------------------
    // You can also define your own SAM interface in Kotlin using 'fun interface'
    fun interface MyAction {
        fun execute(message: String)
    }

    // Passing a lambda directly because of SAM conversion
    val greetAction: MyAction = MyAction { msg ->
        println("Greeting: $msg")
    }
    greetAction.execute("Hello SAM!")

    // --------------------------------------------------------------
    // Note:
    // - Kotlin supports SAM conversion automatically for Java interfaces.
    // - For Kotlin interfaces, you must mark it with 'fun interface'.
    // --------------------------------------------------------------
}
