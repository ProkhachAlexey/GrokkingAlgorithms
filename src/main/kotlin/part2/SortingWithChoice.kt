package part2

class SortingWithChoice {
    fun findSmallest(arr: List<Int>): Int {
        var smallest = arr[0]
        var smallestIndex = 0
        for (i in (1 until arr.size)) {
            if (arr[i] < smallest) {
                smallest = arr[i]
                smallestIndex = i
            }
        }
        return smallestIndex
    }

    fun selectionSort(arr: List<Int>): List<Int> {
        var myList = mutableListOf<Int>()
//        for (i )
        return myList
    }

    companion object {
        val myList = listOf(5, 3, 2, 6, 10)
    }
}

