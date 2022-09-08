import java.util.*

fun main(args:Array<String>) {
    var numbers1 = arrayOf(1, 4, 5 ,2, 6, 3, 15, 16)
    var n = 0
    var index = 0
    while (index<numbers1.size) {
        if (numbers1[index]%2==0) {
            n = n + 1
        }
        index = index + 1
    }
    var numbers2 = IntArray(n)
    index = 0
    var index1 = 0
    while (index<numbers1.size) {
        if (numbers1[index]%2==0) {
            numbers2[index1] = numbers1[index]
            index1 = index1 + 1
        }
        index = index + 1
    }

    println(Arrays.toString(numbers2))
}
