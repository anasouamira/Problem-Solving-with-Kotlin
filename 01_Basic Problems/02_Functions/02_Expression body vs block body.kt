fun main() {
    // ===========================================
    // 1️⃣ Block Body Function
    // - Enclosed in curly braces { }
    // - Can contain multiple statements
    // - Requires explicit 'return' for returning a value
    // ===========================================
    fun addBlock(a: Int, b: Int): Int {
        val sum = a + b
        println("Calculating sum in block body: $sum")
        return sum // explicit return is required
    }

    val resultBlock = addBlock(5, 7)
    println("Result from block body function: $resultBlock\n")

    // ===========================================
    // 2️⃣ Expression Body Function
    // - Defined with '=' followed by a single expression
    // - The expression's value is automatically returned
    // - More concise for simple functions
    // ===========================================
    fun addExpression(a: Int, b: Int): Int = a + b

    val resultExpr = addExpression(5, 7)
    println("Result from expression body function: $resultExpr\n")

    // ===========================================
    // 3️⃣ Differences
    // - Block body: can have multiple statements, needs explicit return
    // - Expression body: single expression, return is implicit
    // - Expression body is shorter and cleaner for simple calculations
    // ===========================================
}
