import java.util.Arrays

fun main(args: Array<String>) {
    val numbers = arrayOf(8, 12, 6, -2, 5, 11)
    var buffer = 0
    for (index in numbers.indices) {
        for (index1 in numbers.indices) {
            if (numbers[index1] > numbers[index]) {
                buffer = numbers[index]
                numbers[index] = numbers[index1]
                numbers[index1] = buffer
            }
        }
    }
    println(Arrays.toString(numbers))
}


