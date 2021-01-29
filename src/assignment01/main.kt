package assignment01

import java.io.File
import java.io.FileOutputStream
import kotlin.time.ExperimentalTime
import kotlin.time.measureTime

@ExperimentalTime
fun main() {
    prepareFiles()

    val file10Keys = File("src/assignment01/10.keys.txt")
    val file100Keys = File("src/assignment01/100.keys.txt")
    val file1000Keys = File("src/assignment01/1000.keys.txt")
    val file10000Keys = File("src/assignment01/10000.keys.txt")
    val file100000Keys = File("src/assignment01/100000.keys.txt")
    val file1000000Keys = File("src/assignment01/1000000.keys.txt")

    for (i in 1..5) {
        testInsertionSort(file10Keys)
        testInsertionSort(file100Keys)
        testInsertionSort(file1000Keys)
        testInsertionSort(file10000Keys)
        testInsertionSort(file100000Keys)
        testInsertionSort(file1000000Keys)

        outInsertionSort("\n", "\n", "\n")
    }

    for (i in 1..5) {
        testMergeSort(file10Keys)
        testMergeSort(file100Keys)
        testMergeSort(file1000Keys)
        testMergeSort(file10000Keys)
        testMergeSort(file100000Keys)
        testMergeSort(file1000000Keys)

        outMergeSort("\n", "\n", "\n")
    }
}

@ExperimentalTime
private fun testInsertionSort(input: File) {
    println("Using insertion sort to sort file: ${input.name}")

    val list = mutableListOf<Int>()

    input.forEachLine { line ->
        list.addAll(line.split("\t").map { Integer.parseInt(it) })
    }

    val arr = list.toIntArray()

    // keys are in random order
    val randomOrderTime = measureTime {
        insertionSort(arr)
    }.inMilliseconds
    println("Time to sort random order keys: $randomOrderTime ms")

    // keys are sorted in ascending order
    val ascendingOrderTime = measureTime {
        insertionSort(arr)
    }.inMilliseconds
    println("Time to sort ascending order keys: $ascendingOrderTime ms")

    // keys are sorted in descending order
    reverseArray(arr)
    val descendingOrderTime = measureTime {
        insertionSort(arr)
    }.inMilliseconds
    println("Time to sort descending order keys: $descendingOrderTime ms")

    outInsertionSort(randomOrderTime.toString() + "\t",
        ascendingOrderTime.toString() + "\t",
        descendingOrderTime.toString() + "\t")
}

@ExperimentalTime
private fun testMergeSort(file: File) {
    println("Using merge sort to sort file: ${file.name}")

    val list = mutableListOf<Int>()

    file.forEachLine { line ->
        list.addAll(line.split("\t").map { Integer.parseInt(it) })
    }

    val arr = list.toIntArray()

    // keys are in random order
    val randomOrderTime = measureTime {
        mergeSort(arr)
    }.inMilliseconds
    println("Time to sort random order keys: $randomOrderTime ms")

    // keys are sorted in ascending order
    val ascendingOrderTime = measureTime {
        mergeSort(arr)
    }.inMilliseconds
    println("Time to sort ascending order keys: $ascendingOrderTime ms")

    // keys are sorted in descending order
    reverseArray(arr)
    val descendingOrderTime = measureTime {
        mergeSort(arr)
    }.inMilliseconds
    println("Time to sort descending order keys: $descendingOrderTime ms")

    outMergeSort(randomOrderTime.toString() + "\t",
        ascendingOrderTime.toString() + "\t",
        descendingOrderTime.toString() + "\t")
}

private fun outInsertionSort(randomValue: String, ascendingValue: String, descendingValue: String) {
    val outputRandom = File("src/assignment01/insertionSortRandom.txt")
    val outputAscending = File("src/assignment01/insertionSortAscending.txt")
    val outputDescending = File("src/assignment01/insertionSortDescending.txt")

    FileOutputStream(outputRandom, true).bufferedWriter().use {
        it.append(randomValue)
    }
    FileOutputStream(outputAscending, true).bufferedWriter().use {
        it.append(ascendingValue)
    }
    FileOutputStream(outputDescending, true).bufferedWriter().use {
        it.append(descendingValue)
    }
}

private fun outMergeSort(randomValue: String, ascendingValue: String, descendingValue: String) {
    val outputRandom = File("src/assignment01/mergeSortRandom.txt")
    val outputAscending = File("src/assignment01/mergeSortAscending.txt")
    val outputDescending = File("src/assignment01/mergeSortDescending.txt")

    FileOutputStream(outputRandom, true).bufferedWriter().use {
        it.append(randomValue)
    }
    FileOutputStream(outputAscending, true).bufferedWriter().use {
        it.append(ascendingValue)
    }
    FileOutputStream(outputDescending, true).bufferedWriter().use {
        it.append(descendingValue)
    }
}

private fun reverseArray(arr: IntArray) {
    for (i in arr.indices) {
        if (i < arr.size - i) {
            val hold = arr[i]
            arr[i] = arr[arr.size - 1 - i]
            arr[arr.size - 1 - i] = hold
        } else {
            return
        }
    }
}