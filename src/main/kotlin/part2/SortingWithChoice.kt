package part2

class SortingWithChoice {

    fun selectionSort(arr: MutableList<Int>): List<Int> {
        val resultList = mutableListOf<Int>()
        for (item in 0 until arr.size) {
            val smallest = arr.minOrNull()
            smallest?.let { resultList.add(it) }
            arr.remove(smallest)
        }
        return resultList
    }

    fun swap(list: MutableList<Int>, firstIndex: Int, secondIndex: Int) {

    }

    companion object {
        val myList = mutableListOf(-5, 3, 20, 6, -10)
    }
}
