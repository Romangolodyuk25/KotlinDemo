fun main(args:Array<String>) {
    val index = arrayOf(1, 2, 3, 4)
    val fruit = arrayOf("Apple", "Banana", "Cherry", "Blueberry", "Pomegranate")
    var x = 0
    var y : Int
    while (x < 4) {
        y = index[x]
        println("fruit = ${fruit[y]}")
        x = x + 1
    }
}
