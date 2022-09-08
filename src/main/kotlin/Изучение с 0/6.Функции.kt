fun main(args:Array<String>){
    val names= arrayOf("John", "Bob", "Peter")
    val lastnames = arrayOf("John", "Bob", "Peter")

    myFunc(names, 3) // Я обращаюсь к переменной массива names у которой локальное название arr он переносит меня к функции

    if (readLine() == "Выведи все имена") // если я на вводи попрошу все имена сработает функция
        myFunc(names, 7)

    if (readLine() == "Выведи все имена") // если я на вводи попрошу все имена сработает функция
        myFunc(lastnames, 5)

}
fun myFunc(arr:Array<String>, count: Int) { //arr ЭТО ЛОКАЛЬНОЕ(Местное) НАЗВАНИЕ ПЕРЕМЕННОЙ МАССИВА NAMES
// функция может принимать не один параметр а несколько itn string и тд
    for(name in arr)
        if (name == "Peter")println("Как дела Питер? $count")
        else if (name == "John")println("Ты блять нахуй кто такой?$count")
        else println("Добро пожаловать")

    //Что бы функция посчитала и ВЕРНУЛА нам результат нужно это указать
    val x = 10
    val y = 7

    val result = add(x,y) // для того что бы можно было использовать где-то эот резульат
 println(result) // можно так или можно было val result = add(x, y)
}

fun add(x:Int, y:Int):Int {
    return(x + y)
    // либо fun add(x:Int, y:Int):Int = x + y работает у функций где 1 строка только
}
