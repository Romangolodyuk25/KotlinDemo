import java.util.*

fun main(args:Array<String>) {
    val numbers = arrayOf(1, 5, 9, 3, 2, 8)
    var index = numbers.size - 1
    while (index >= 0) {
        println(numbers[index])
        index = index - 1
}
}