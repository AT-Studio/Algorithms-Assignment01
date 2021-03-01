package assignment02

fun getRoots(p: FloatArray, q: FloatArray): Array<IntArray> {
    val n = q.size
    val e = Array(n + 1) { FloatArray(n) }
    val w = Array(n + 1) { FloatArray(n) }
    val roots = Array(n) { IntArray(n) }

    for (i in 1..n) {
        e[i][i - 1] = q[i - 1]
        w[i][i - 1] = q[i - 1]
    }

    for (l in 1 until n) {
        for (i in 1..n - l) {
            val j = i + l - 1
            e[i][j] = Float.MAX_VALUE
            w[i][j] = w[i][j - 1] + p[j - 1] + q[j]
            for (r in i..j) {
                val t = e[i][r - 1] + e[r + 1][j] + w[i][j]
                if (t < e[i][j]) {
                    e[i][j] = t
                    roots[i][j] = r
                }
            }
        }
    }

    return roots
}

fun buildOptimalBST(keys: IntArray, roots: Array<IntArray>): String {
    val stringBuilder = StringBuilder()
    processRootsHelper(keys = keys, roots = roots, i = 1, j = roots.size - 1, stringBuilder = stringBuilder)
    return stringBuilder.toString()
}

private fun processRootsHelper(keys: IntArray, roots: Array<IntArray>, i: Int, j: Int, stringBuilder: StringBuilder) {
    if (i > j || roots[i][j] == 0) {
        stringBuilder.append("d$j")
        return
    }
    val keyIdx = roots[i][j]
    stringBuilder.append(keys[keyIdx - 1])
    stringBuilder.append("(L:")
    processRootsHelper(keys = keys, roots = roots, i = i, j = keyIdx - 1, stringBuilder)
    stringBuilder.append(",R:")
    processRootsHelper(keys = keys, roots = roots, i = keyIdx + 1, j = j, stringBuilder)
    stringBuilder.append(")")
}