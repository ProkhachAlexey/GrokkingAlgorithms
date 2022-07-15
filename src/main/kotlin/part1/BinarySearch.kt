package part1

fun main() {
    val myList = listOf(1, 3, 5, 7, 9)
    println(binarySearch(myList, 3))
    println(binarySearch(myList, -1))
}

private fun binarySearch(list: List<Int>, item: Int): Int? {
    var low = 0
    var high = list.size - 1

    while (low <= high) {
        val mid = (low + high) / 2
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