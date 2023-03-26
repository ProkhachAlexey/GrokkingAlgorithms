import part1.BinarySearch
import part2.SortingWithChoice
import part3.Factorial

fun main() {

    // part1
    println("index element is: ${BinarySearch().elementIndex(BinarySearch.myList, 5)}")

    // part2
    println("Sorting with choice: ${SortingWithChoice().selectionSort(SortingWithChoice.myList)}")

    // part3
    val number = 5
    println("Factorial $number = ${Factorial().fact(number)}")
}

