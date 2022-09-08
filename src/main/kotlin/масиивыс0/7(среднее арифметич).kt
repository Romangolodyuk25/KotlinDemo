fun main(args:Array<String>) {
    val numbers = arrayOf(3, 5, 3, 4, 5, 4, 4, 4, 2, 2, 3)
    var index = 0
    var alnumb = numbers.size - 1
    var result = 0
    while (index < numbers.size) {
        result = result + numbers[index]
        index = index + 1
    }
    println("$result")
    result = result / alnumb
    println("$result")
}

