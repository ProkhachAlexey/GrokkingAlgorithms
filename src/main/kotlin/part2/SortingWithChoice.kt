package part2

class SortingWithChoice {
    private fun findSmallest(arr: List<Int>): Int {
        var smallest = arr[0]
        for (i in (1 until arr.size)) {
            if (arr[i] < smallest) {
                smallest = arr[i]
            }
        }
        return smallest
    }

    fun selectionSort(arr: List<Int>): List<Int> {
        val myList = mutableListOf<Int>()
        for (item in arr) {
            myList.add(item)
        }
        val newList = mutableListOf<Int>()
        for (item in 0 until myList.size) {
            val smallest = findSmallest(myList)
            newList.add(smallest)
            myList.remove(smallest)
        }
        return newList
    }

    companion object {
        val myList = listOf(-5, 3, 20, 6, -10)
    }
}

