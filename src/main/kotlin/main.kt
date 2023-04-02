import part1.BinarySearch
import part2.SortingWithChoice
import part3.Recursion
import part4.QuickSort
import part4.Sum

fun main() {

    // part1
    println("index element is: ${BinarySearch().elementIndex(BinarySearch.myList, 5)}")

    // part2
    println("Sorting with choice: ${SortingWithChoice().selectionSort(SortingWithChoice.myList)}")

    // part3
    val number = 5
    println("Factorial $number = ${Recursion().fact(number)}")
    println("Fibonacci ${number + number} = ${Recursion().fibonacci(number + number)}")

    // part4
    // sum
    println(Sum().sumLooper(Sum.list))
    println(Sum().sumRecursion(Sum.list))

    // quick sort
    println(QuickSort().quickSort(QuickSort.testList))
}

