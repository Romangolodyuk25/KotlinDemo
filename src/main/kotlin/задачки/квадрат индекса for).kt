import java.util.*

fun main (args:Array<String>) {
    val scanner = Scanner(System.`in`)
    println("Введите размер массива: ")
    var size = scanner.nextInt()
    var n = size
    var numbers = IntArray(n)
    for (index in 0..n-1 ) {
        numbers[index] = index * index
    }
        println(Arrays.toString(numbers))
}