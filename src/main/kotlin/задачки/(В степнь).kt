import java.util.Scanner

fun main(args:Array<String>) {
 val scanner = Scanner(System.`in`)
  println("Введите число: ")
  val anyNumber = scanner.nextInt ()
  println("Введите степень числа: ")
  var degree = scanner.nextInt () -1
  var result = anyNumber
  while (degree !=0) {
    result = result * anyNumber
    degree = degree - 1
  }
  println("Результат: $result")
}
