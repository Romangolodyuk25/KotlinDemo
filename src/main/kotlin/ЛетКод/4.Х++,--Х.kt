fun main(args:Array<String>) {
    var operations = arrayOf("--X","++X","++X")
    val result = finalValueAfterOperations(operations)
        println(result)

}
    fun finalValueAfterOperations(operations: Array<String>): Int {
       // var operations = arrayOf("--X","++X","++X")
        var result = 0
        var index = 0
        var X = 1
        while (index < operations.size) {
            if (operations[index] == "--X" || operations[index] == "X--") {
                result = result - X
                index = index + 1
            } else if (operations[index] == "X++" || operations[index] == "++X") {
                result = result + X
                index = index + 1

            }

        }
        return result
    }
