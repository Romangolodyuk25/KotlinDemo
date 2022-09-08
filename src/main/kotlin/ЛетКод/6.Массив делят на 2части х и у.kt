import java.util.Arrays

fun main(args:Array<String>) {
var array = arrayOf(1, 3, 5, 7, 2, 4, 6, 8)// 1 2 3 4 5 6 7 8
var index = 0
var index1 = 1
var x = 0
var y = array.size/2
var n = array.size
var array2 = IntArray(n)
    while (index<array2.size) {
    array2[index] = array[x]
    array2[index1] = array[y]
        index = index + 2
        index1 = index +1
        x +=1
        y+=1
    }
    println(Arrays.toString(array2))
}
