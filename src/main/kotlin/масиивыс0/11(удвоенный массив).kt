import java.util.*

// отдельная функция main
fun main(args: Array<String>) {
    var mass = intArrayOf(1, 2, 3) // объявление массива mass в функции main
    val result = getConcatenation(mass) // вызов функции getConcatenation и передача ей массива mass, присваивание результата работы функции в переменную result
   for(i in result) { // вывод массива, который находится в переменной result, в коммандную строку
       print(i)
       print(",")
   }
    println()
    var arr = intArrayOf(6, 7, 8)
    val result1 = getConcatenation(arr)
    for (numbers in result1) {
        print(numbers)
        print(",")
    }
    println()
    var numbers = intArrayOf(4, 11, 18)
    val result2 = getConcatenation(numbers)
    for(dick in result2) {
        print(dick)
        print(",")
    }
}
// отдельная функция getConcatenation
fun getConcatenation(nums: IntArray): IntArray {
    var index = 0
    var n = 0
    while (index < nums.size) {
        n = n + 1
        index = index + 1
    }
    index = 0
    n = n * 2
    var ans = IntArray(n)
    var index1 = 0
    while (index < ans.size) {
        if (index < nums.size) {
            ans[index] = nums[index]
            index = index + 1
        } else {
            ans[index] = nums[index1]
            index1 = index1 + 1
            index = index + 1
        }
    }
    return ans
}

