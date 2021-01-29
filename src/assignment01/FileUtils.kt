package assignment01

import java.io.File
import kotlin.random.Random

fun prepareFiles() {
    val keys10 = File("src/assignment01/10.keys.txt")
    if (!keys10.exists()) {
        if (keys10.createNewFile()) {
            keys10.printWriter().use {
                for (i in 1..10) {
                    it.print(Random.nextInt(1000000))
                    if (i < 10) it.print("\t")
                }
            }
        }
    }

    val keys100 = File("src/assignment01/100.keys.txt")
    if (!keys100.exists()) {
        if (keys100.createNewFile()) {
            keys100.printWriter().use {
                for (i in 1..100) {
                    it.print(Random.nextInt(1000000))
                    if (i < 100) it.print("\t")
                }
            }
        }
    }

    val keys1000 = File("src/assignment01/1000.keys.txt")
    if (!keys1000.exists()) {
        if (keys1000.createNewFile()) {
            keys1000.printWriter().use {
                for (i in 1..1000) {
                    it.print(Random.nextInt(1000000))
                    if (i < 1000) it.print("\t")
                }
            }
        }
    }

    val keys10000 = File("src/assignment01/10000.keys.txt")
    if (!keys10000.exists()) {
        if (keys10000.createNewFile()) {
            keys10000.printWriter().use {
                for (i in 1..10000) {
                    it.print(Random.nextInt(1000000))
                    if (i < 10000) it.print("\t")
                }
            }
        }
    }

    val keys100000 = File("src/assignment01/100000.keys.txt")
    if (!keys100000.exists()) {
        if (keys100000.createNewFile()) {
            keys100000.printWriter().use {
                for (i in 1..100000) {
                    it.print(Random.nextInt(1000000))
                    if (i < 100000) it.print("\t")
                }
            }
        }
    }

    val keys1000000 = File("src/assignment01/1000000.keys.txt")
    if (!keys1000000.exists()) {
        if (keys1000000.createNewFile()) {
            keys1000000.printWriter().use {
                for (i in 1..1000000) {
                    it.print(Random.nextInt(1000000))
                    if (i < 1000000) it.print("\t")
                }
            }
        }
    }

    val fileInsertionSortRandom = File("src/assignment01/insertionSortRandom.txt")
    if (!fileInsertionSortRandom.exists()) fileInsertionSortRandom.createNewFile()

    val fileInsertionSortAscending = File("src/assignment01/insertionSortAscending.txt")
    if (!fileInsertionSortRandom.exists()) fileInsertionSortAscending.createNewFile()

    val fileInsertionSortDescending = File("src/assignment01/insertionSortDescending.txt")
    if (!fileInsertionSortRandom.exists()) fileInsertionSortDescending.createNewFile()
}