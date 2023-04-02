package part4

class QuickSort {

    fun quickSort(list: List<Int>): List<Int> {
        return if (list.size < 2)
            list
        else {
            val pivot = list[0]
            val less: List<Int> = list.slice(1..list.lastIndex).filter { it <= pivot }
            val greater: List<Int> = list.slice(1..list.lastIndex).filter { it > pivot }
            quickSort(less) + listOf(pivot) + quickSort(greater)
        }
    }

    companion object {

        val testList = listOf(24, 15, 43, 10, 115, 29, 15)
    }
}