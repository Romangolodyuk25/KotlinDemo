fun main(args:Array<String>) {
    var date = Array(3,{Array (3, {0})})
    date[0] = arrayOf(1, 2, 3)
    date[1] = arrayOf(4, 5, 6)
    date[2] = arrayOf(7, 8, 9)
    //date[1][1] = 9 что бы изменить 2 строку 2 индекса на 9
    for (array1 in date ) {
        for (array2 in array1) {
        print("$array2")
        }
        println()
    }
}
