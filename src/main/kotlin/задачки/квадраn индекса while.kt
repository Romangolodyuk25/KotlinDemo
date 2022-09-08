import java.util.*

fun main(args:Array<String>) {
    val scanner = Scanner(System.`in`)
    println("Введите размер массива: ")
    val size = scanner.nextInt()
    var n = size
    var numbers= IntArray(n)//?
    var index = 0
    while (index < numbers.size){
           numbers[index] = index * index //?
           index = index + 1
    }
    println(Arrays.toString(numbers))
}
