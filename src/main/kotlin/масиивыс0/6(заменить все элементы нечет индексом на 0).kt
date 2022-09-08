fun main(args:Array<String>) {
    var numbers = arrayOf(1, 3, 5, 2, 11, 45, 23, 56, 12, 17)
    var index = 0
    val number = 0
    while (index < numbers.size) {
        if (index % 2 != 0) {
            numbers[index] = number
        }
        println(numbers[index])
        index = index + 1
    }
}
