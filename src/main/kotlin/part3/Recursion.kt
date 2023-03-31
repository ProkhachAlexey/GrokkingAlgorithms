package part3

class Recursion {
    fun fact(x: Int): Int {
        var result = 1
        if (x < 0)
            throw NumberFormatException("number must be >= 0")
        return when (x) {
            0, 1 -> 1
            else -> {
//                for (item in 1..x) {
//                    result *= item
//                }
                x * fact(x - 1)
            }
        }
    }

    fun fibonacci(x: Int): Int {
        return when (x) {
            0 -> 0
            1 -> 1
            else -> {
                fibonacci(x - 2) + fibonacci(x - 1)
            }
        }
    }
}