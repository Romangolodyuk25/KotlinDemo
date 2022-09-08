import java.util.*

fun main(args:Array<String>) {
    var numbers = arrayOf(2, 7, 5, 4, 6, 11, 8, 3, 1)
    var index = 0
    var index1 = numbers.size-1
while (index < numbers.size/2) {
    var firstnumb = numbers[index]
    numbers[index] = numbers[index1]
    numbers[index1] = firstnumb
    index = index + 1
    index1 = index1 -1
}
    println(Arrays.toString(numbers))
}
