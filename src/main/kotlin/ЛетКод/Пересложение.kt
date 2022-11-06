package ЛетКод

import sum

fun main(args:Array<String>) {
    var arr = arrayOf(10,11,12)
    var sum = arr.sum()
    var res = 0
    var start = 0
    var end = arr.size/2
    while (end!=arr.size) {
        for (index in start..end) {
            res += arr[index]
        }
        start++
        end++
    }
    res +=sum
    res+=sum
    println(res)
}