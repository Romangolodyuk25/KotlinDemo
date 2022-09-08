fun main(args:Array<String>) {
    var numbers = arrayOf(1, 2, 3, 4, 5, 6, 7, 8)
    var index = 0
    var index1 = 1
    var sorted:Boolean = true
    while (index1 < numbers.size) {
        if (numbers[index1]>numbers[index]) {
            index = index + 1
        }
        else {
            sorted = false
        }
        index1 = index1 + 1
    }
    println("$sorted")
}
