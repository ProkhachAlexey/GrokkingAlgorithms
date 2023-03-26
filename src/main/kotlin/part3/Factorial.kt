package part3

class Factorial {
    fun fact(x: Int): Int {
        var result = 1
        if (x < 0)
            throw NumberFormatException("number must be >= 0")
        return when (x) {
            0, 1 -> 1
            else -> {
                for (item in 1..x) {
                    result *= item
                }
                result
            }
        }
    }
}