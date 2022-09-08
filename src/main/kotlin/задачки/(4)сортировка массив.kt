import java.util.*

fun main(args:Array<String>) {
    val numbers = arrayOf(8, 12, 6, -2, 5, 11)
    var minNumb = numbers[0]
    var index = 0
    var index1 = 1
    var minIndex = 0
    while (index !=numbers.size - 1) {
        while (index1 < numbers.size) {
            if (numbers[index1]<minNumb) {
                minNumb = numbers[index1]
                minIndex = index1
            }
                index1 = index1 + 1
        }
        var twonumb = numbers[index]
        numbers[index] = numbers[minIndex]
        numbers[minIndex] = twonumb
        index = index + 1
        index1 = index + 1
        minIndex = index
        minNumb = numbers[minIndex]
    }
    println(Arrays.toString(numbers))
}

// .indices - чтобы пользоваться индексами
//(index, item). В первую переменную запишется позиция а во вторую элемент из массива: