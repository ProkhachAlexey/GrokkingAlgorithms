package part4

class Sum {
    fun sumLooper(list: List<Int>): Int {
        return if (list.isEmpty())
            0
        else {
            var result = 0
            for (item in list)
                result += item
            result
        }
    }

    fun sumRecursion(list: List<Int>): Int {
        return if (list.isEmpty())
            0
        else
            list.lastIndexOf(list.size - 1) + sumRecursion(list.dropLast(1))
    }

    companion object {
        val list = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
    }
}