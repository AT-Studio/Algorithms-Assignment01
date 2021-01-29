package assignment01

fun mergeSort(arr: IntArray) {
    mergeSort(arr, 0, arr.size - 1)
}

private fun mergeSort(arr: IntArray, l: Int, r: Int) {
    if (l >= r) return
    val m = (l + r - 1) / 2
    mergeSort(arr, l, m)
    mergeSort(arr, m + 1, r)
    merge(arr, l, m, r)
}

private fun merge(arr: IntArray, l: Int, m: Int, r: Int) {
    val lArr = IntArray(m - l + 1)
    val rArr = IntArray(r - m)

    for (i in lArr.indices) {
        lArr[i] = arr[i + l]
    }
    for (i in rArr.indices) {
        rArr[i] = arr[i + m + 1]
    }

    var i = l
    var j = 0
    var k = 0
    while (j < lArr.size && k < rArr.size) {
        if (lArr[j] <= rArr[k]) {
            arr[i] = lArr[j]
            j++
        } else {
            arr[i] = rArr[k]
            k++
        }
        i++
    }
    while (j < lArr.size) {
        arr[i] = lArr[j]
        j++
        i++
    }
    while (k < rArr.size) {
        arr[i] = rArr[k]
        k++
        i++
    }
}