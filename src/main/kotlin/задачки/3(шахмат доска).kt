import java.util.Scanner
fun main(args:Array<String>) {
    val scanner = Scanner(System.`in`)
    println("Введите строку шахматной доски: ")
    val x1 = scanner.nextInt()
    println("Введите столбец шахмотной доски:")
    val y1 = scanner.nextInt()
    println("Введите строку шахматной доски2:")
    val x2 = scanner.nextInt()
    println("Введите столбец шахматной строки2:")
    val y2 = scanner.nextInt()
    var collor1 = -1// 1 белый
    var collor2 = -1 // 0 черный
    if ((x1 %2!=0) && (y1 % 2==0) || (x1 % 2==0) && (y1 % 2!= 0)) {
        collor1 = 1
    }
     else if ((x1 % 2==0) && (y1 % 2== 0) || (x1 % 2!=0) && (y1% 2!=0)) {
        collor1 = 0
    }
    if ((x2 %2!=0) && (y2 % 2==0) || (x2 % 2==0) && (y2 % 2!= 0)) {
        collor2 = 1
    }
     else if ((x2 %2!=0) && (y2 % 2==0) || (x2 % 2==0) && (y2 % 2!= 0)) {
        collor2 = 0
    }
    if ((collor1==collor2 )) {
        println("Yes")
    }
    else {
        println("No")
    }
}


