fun main(args:Array<String>) {
    val numbers = arrayOf(8, 11, 14, 6, 7, 2, 16)
    var summa = 0 //переменная где будет храниться сумма
    var index = 0
    while (index < numbers.size) {// написать через while
        if (numbers[index] % 2 == 0) { // numbers[index] < numbers.size
           summa = summa + numbers[index]
           index = index + 1
        }
        else {
           index = index + 1
        }
    }
    println("Сумма четных чисел равна:$summa")
}