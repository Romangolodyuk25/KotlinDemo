import java.util.*
fun main(args:Array<String>) {
    val numbers = arrayOf(1, 2, 3, 4, 5)
    var index = 0
    var index1 = 1
    var result = numbers[index]
    while (index < numbers.size-1) {
        while (index1 < numbers.size) {
            result = numbers[index1] + result
            numbers[index1] = result
            index = index + 1
            index1 = index1 + 1
        }
}
    println(Arrays.toString(numbers))
    }