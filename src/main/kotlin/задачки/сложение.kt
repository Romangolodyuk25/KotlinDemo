import java.util.Scanner

fun main(args: Array<String>) {
 val scanner = Scanner(System.`in`)
 println("Введите число: ")
 var a = scanner.nextInt ()
 println("Введите число которое хотете прибавть: ")
 var b = scanner. nextInt ()
 var result = (a + b)
 while ((a < -100) || (a > 100) || (b <-100) || (b >100)) {
  println("Некорректный ввод")
  println("Введите число заново: ")
  if ((a >= -100 && a <= 100) && (b >= -100 && b <= 100)) {
   println("Результат: $result")
  } else {
   println("Неправильный ввод")
  }
  }
}
