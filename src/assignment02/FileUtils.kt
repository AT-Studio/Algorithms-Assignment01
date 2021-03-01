package assignment02

import java.io.File
import kotlin.random.Random

fun prepareFiles() {
    val keys10 = File("src/assignment02/10.keys.txt")
    val keys10probabilities = File("src/assignment02/10.keys.probabilities.txt")
    if (!keys10.exists() || !keys10probabilities.exists()) {
        val numbers = IntArray(21)
        for (i in numbers.indices) {
            numbers[i] = Random.nextInt(100000)
        }
        if (!keys10.exists()) {
            if (keys10.createNewFile()) {
                val keys = numbers.copyOfRange(0, 10).apply { sort() }
                keys10.printWriter().use {
                    for (i in keys.indices) {
                        it.print(keys[i])
                        if (i < keys.size - 1) it.print("\t")
                    }
                }
            }
        }
        if (!keys10probabilities.exists()) {
            if (keys10probabilities.createNewFile()) {
                val probabilities = FloatArray(21).apply {
                    val scaledNumbers = numbers.map { it.toFloat() / 100000 }
                    var sum = 0f
                    scaledNumbers.forEach { sum += it }
                    for (i in indices) {
                        set(i, scaledNumbers[i] / sum)
                    }
                }
                keys10probabilities.printWriter().use {
                    for (i in probabilities.indices) {
                        it.print(probabilities[i])
                        if (i < probabilities.size - 1) it.print("\t")
                    }
                }
            }
        }
    }

    val keys100 = File("src/assignment02/100.keys.txt")
    val keys100probabilities = File("src/assignment02/100.keys.probabilities.txt")
    if (!keys100.exists() || !keys100probabilities.exists()) {
        val numbers = IntArray(201)
        for (i in numbers.indices) {
            numbers[i] = Random.nextInt(100000)
        }
        if (!keys100.exists()) {
            if (keys100.createNewFile()) {
                val keys = numbers.copyOfRange(0, 100).apply { sort() }
                keys100.printWriter().use {
                    for (i in keys.indices) {
                        it.print(keys[i])
                        if (i < keys.size - 1) it.print("\t")
                    }
                }
            }
        }
        if (!keys100probabilities.exists()) {
            if (keys100probabilities.createNewFile()) {
                val probabilities = FloatArray(201).apply {
                    val scaledNumbers = numbers.map { it.toFloat() / 100000 }
                    var sum = 0f
                    scaledNumbers.forEach { sum += it }
                    for (i in indices) {
                        set(i, scaledNumbers[i] / sum)
                    }
                }
                keys100probabilities.printWriter().use {
                    for (i in probabilities.indices) {
                        it.print(probabilities[i])
                        if (i < probabilities.size - 1) it.print("\t")
                    }
                }
            }
        }
    }

    val keys1000 = File("src/assignment02/1000.keys.txt")
    val keys1000probabilities = File("src/assignment02/1000.keys.probabilities.txt")
    if (!keys1000.exists() || !keys1000probabilities.exists()) {
        val numbers = IntArray(2001)
        for (i in numbers.indices) {
            numbers[i] = Random.nextInt(100000)
        }
        if (!keys1000.exists()) {
            if (keys1000.createNewFile()) {
                val keys = numbers.copyOfRange(0, 1000).apply { sort() }
                keys1000.printWriter().use {
                    for (i in keys.indices) {
                        it.print(keys[i])
                        if (i < keys.size - 1) it.print("\t")
                    }
                }
            }
        }
        if (!keys1000probabilities.exists()) {
            if (keys1000probabilities.createNewFile()) {
                val probabilities = FloatArray(2001).apply {
                    val scaledNumbers = numbers.map { it.toFloat() / 100000 }
                    var sum = 0f
                    scaledNumbers.forEach { sum += it }
                    for (i in indices) {
                        set(i, scaledNumbers[i] / sum)
                    }
                }
                keys1000probabilities.printWriter().use {
                    for (i in probabilities.indices) {
                        it.print(probabilities[i])
                        if (i < probabilities.size - 1) it.print("\t")
                    }
                }
            }
        }
    }

    val keys10000 = File("src/assignment02/10000.keys.txt")
    val keys10000probabilities = File("src/assignment02/10000.keys.probabilities.txt")
    if (!keys10000.exists() || !keys10000probabilities.exists()) {
        val numbers = IntArray(20001)
        for (i in numbers.indices) {
            numbers[i] = Random.nextInt(100000)
        }
        if (!keys10000.exists()) {
            if (keys10000.createNewFile()) {
                val keys = numbers.copyOfRange(0, 10000).apply { sort() }
                keys10000.printWriter().use {
                    for (i in keys.indices) {
                        it.print(keys[i])
                        if (i < keys.size - 1) it.print("\t")
                    }
                }
            }
        }
        if (!keys10000probabilities.exists()) {
            if (keys10000probabilities.createNewFile()) {
                val probabilities = FloatArray(20001).apply {
                    val scaledNumbers = numbers.map { it.toFloat() / 100000 }
                    var sum = 0f
                    scaledNumbers.forEach { sum += it }
                    for (i in indices) {
                        set(i, scaledNumbers[i] / sum)
                    }
                }
                keys10000probabilities.printWriter().use {
                    for (i in probabilities.indices) {
                        it.print(probabilities[i])
                        if (i < probabilities.size - 1) it.print("\t")
                    }
                }
            }
        }
    }

    val keys100000 = File("src/assignment02/100000.keys.txt")
    val keys100000probabilities = File("src/assignment02/100000.keys.probabilities.txt")
    if (!keys100000.exists() || !keys100000probabilities.exists()) {
        val numbers = IntArray(200001)
        for (i in numbers.indices) {
            numbers[i] = Random.nextInt(100000)
        }
        if (!keys100000.exists()) {
            if (keys100000.createNewFile()) {
                val keys = numbers.copyOfRange(0, 100000).apply { sort() }
                keys100000.printWriter().use {
                    for (i in keys.indices) {
                        it.print(keys[i])
                        if (i < keys.size - 1) it.print("\t")
                    }
                }
            }
        }
        if (!keys100000probabilities.exists()) {
            if (keys100000probabilities.createNewFile()) {
                val probabilities = FloatArray(200001).apply {
                    val scaledNumbers = numbers.map { it.toFloat() / 100000 }
                    var sum = 0f
                    scaledNumbers.forEach { sum += it }
                    for (i in indices) {
                        set(i, scaledNumbers[i] / sum)
                    }
                }
                keys100000probabilities.printWriter().use {
                    for (i in probabilities.indices) {
                        it.print(probabilities[i])
                        if (i < probabilities.size - 1) it.print("\t")
                    }
                }
            }
        }
    }
}