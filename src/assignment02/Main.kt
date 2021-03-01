package assignment02

import java.io.File
import java.io.FileOutputStream
import kotlin.time.ExperimentalTime
import kotlin.time.measureTime

@ExperimentalTime
fun main() {
    prepareFiles()

    /* Tests implementation against example from notes */
    // testImplementation()

    doTrialRuns()
}

@ExperimentalTime
fun doTrialRuns() {
    val keys10 = File("src/assignment02/10.keys.txt")
    val keys10probabilities = File("src/assignment02/10.keys.probabilities.txt")
    val keys100 = File("src/assignment02/100.keys.txt")
    val keys100probabilities = File("src/assignment02/100.keys.probabilities.txt")
    val keys1000 = File("src/assignment02/1000.keys.txt")
    val keys1000probabilities = File("src/assignment02/1000.keys.probabilities.txt")
    val keys10000 = File("src/assignment02/10000.keys.txt")
    val keys10000probabilities = File("src/assignment02/10000.keys.probabilities.txt")
    val keys100000 = File("src/assignment02/100000.keys.txt")
    val keys100000probabilities = File("src/assignment02/100000.keys.probabilities.txt")

    val outfile = File("src/assignment02/time.txt")
    if (!outfile.exists()) {
        outfile.createNewFile()
    }

    for (i in 1..5) {
        testOptimalBST(keysFile = keys10, probabilitiesFile = keys10probabilities, outfile = outfile)
        testOptimalBST(keysFile = keys100, probabilitiesFile = keys100probabilities, outfile = outfile)
        testOptimalBST(keysFile = keys1000, probabilitiesFile = keys1000probabilities, outfile = outfile)
        testOptimalBST(keysFile = keys10000, probabilitiesFile = keys10000probabilities, outfile = outfile)
        testOptimalBST(keysFile = keys100000, probabilitiesFile = keys100000probabilities, outfile = outfile)
        FileOutputStream(outfile, true).bufferedWriter().use {
            it.append("\n")
        }
    }
}

@ExperimentalTime
fun testOptimalBST(keysFile: File, probabilitiesFile: File, outfile: File) {
    val keysList = mutableListOf<Int>()
    val probabilitiesList = mutableListOf<Float>()

    keysFile.forEachLine { line ->
        keysList.addAll(line.split("\t").map { it.toInt() })
    }
    probabilitiesFile.forEachLine { line ->
        probabilitiesList.addAll(line.split("\t").map { it.toFloat() })
    }

    val time = measureTime {
        getRoots(p = probabilitiesList.subList(0, keysList.size).toFloatArray(),
            q = probabilitiesList.subList(keysList.size, probabilitiesList.size).toFloatArray())
    }.inMilliseconds

    FileOutputStream(outfile, true).bufferedWriter().use {
        it.append(time.toString() + "\t")
    }
}

fun testImplementation() {
    val keys = intArrayOf(1, 2, 3, 4, 5)
    val p = floatArrayOf(0.15f, 0.10f, 0.05f, 0.10f, 0.20f)
    val q = floatArrayOf(0.05f, 0.10f, 0.05f, 0.05f, 0.05f, 0.10f)

    val roots = getRoots(p = p, q = q)

    println(buildOptimalBST(keys = keys, roots = roots))
}
