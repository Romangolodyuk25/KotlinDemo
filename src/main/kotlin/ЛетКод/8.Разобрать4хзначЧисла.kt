fun main(args: Array<String>) {
    var num = 2932
    var tostring = num.toString()
    var array = Array(32, { _ -> IntArray(2) })
    var index = 0
    var index1 = 0
    var string1 = ""
    while (index1 < array.size) {
        while (index != array[index].size) {
            array[index1][index] = tostring.toInt(index)
            index++
        }
        index = 0
        index1++
    }
}
var result: Int = 0
var maxresult = 0

//val toInt1 = num1.toInt()
//val toInt2 = num2.toInt()
//result = toInt1 + toInt2

fun toInt(num: Int): Int {
    var tostring = num.toString()
    var toInt = num.toInt()
    return num
}
