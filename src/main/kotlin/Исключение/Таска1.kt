package Исключение

fun main(args:Array<String>) {
    try {
    getIndex(2)
    } catch (e:IndexOutOfBoundsException) {
        println("Вы ввели недопустимый индекс")
        e.printStackTrace()
    }
    finally {
        println("Введите допустимое значение, если сработало исключение")
    }
}
fun getIndex(index:Int) {
    var list = listOf(1,5,12,65)
    for (i in 0..list.size-1) {
    }
    println(list[index])
}