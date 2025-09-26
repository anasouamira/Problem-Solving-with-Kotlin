fun main() {
    // ===========================================
    // 1️⃣ Local (Nested) Function
    // - A function defined inside another function
    // - Can only be called within the outer function
    // - Helps organize code and avoid repetition
    // ===========================================

    fun calculateSumAndAverage(numbers: List<Int>): Pair<Int, Double> {
        // Nested function to calculate sum
        fun sum(nums: List<Int>): Int {
            var total = 0
            for (n in nums) {
                total += n
            }
            return total
        }

        val totalSum = sum(numbers) // calling the nested function
        val average = totalSum.toDouble() / numbers.size
        return Pair(totalSum, average)
    }

    val numbersList = listOf(10, 20, 30, 40)
    val (sumResult, avgResult) = calculateSumAndAverage(numbersList)
    println("Sum: $sumResult, Average: $avgResult")

    // ===========================================
    // 2️⃣ Notes
    // - Local functions can access variables from the outer function
    // - They help keep helper functions encapsulated within the function they are needed
    // - Improves readability and maintainability
    // ===========================================
}
