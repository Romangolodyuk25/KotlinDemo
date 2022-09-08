fun main(args:Array<String>) {
    val numbers = arrayOf(1, 3, 4, 6, 11, 17, 8, 15, 12)
    var index = 0
    while (index < numbers.size) {
        if (numbers[index] % 2 == 0) {
            println(numbers[index])
        }
        index = index + 1
    }
}
