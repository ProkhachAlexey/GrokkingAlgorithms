package part1

class BinarySearch {
    fun elementIndex(list: List<Int>, item: Int): Int? {
        var low = 0
        var high: Int = list.size - 1

        while (low <= high) {
            val mid: Int = (low + high) / 2
            val guess = list[mid]
            if (guess == item)
                return mid
            if (guess > item)
                high = mid - 1
            else
                low = mid + 1
        }
        return null
    }

    companion object {
        val myList = listOf(1, 3, 4, 5, 7, 13)
    }
}
