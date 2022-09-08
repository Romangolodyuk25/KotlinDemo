import java.util.*

fun main(args: Array<String>) {
    val numbers = arrayOf(8, 12, 6, -2, 5, 11)
    var minNumb = numbers[0]
   // var number1 = 0
    var minIndex = 0
    for (index in numbers.indices) {
        minIndex = index
        minNumb = numbers[index]
        for (index1 in numbers.indices) {
            if (index1 >= index) {
                if (numbers[index1] < minNumb) {
                    minNumb = numbers[index1]
                    minIndex = index1
                }
            }
        }
        var twonumb = numbers[index]
        numbers[index] = numbers[minIndex]
        numbers[minIndex] = twonumb
        //number1 = number1 + 1

    }
    println(Arrays.toString(numbers))
}
