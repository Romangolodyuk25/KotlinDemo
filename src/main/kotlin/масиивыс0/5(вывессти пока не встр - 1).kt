fun main(args:Array<String>) {
    val numbers = arrayOf(1, 5, 6, 2, 4, -1, 8, 12)
    var index = 0
    var number = -1
    while (index < numbers.size) {
        if (numbers[index] != number ) {
            println(numbers[index])
            index = index + 1
        }
        else index = numbers.size
    }
}