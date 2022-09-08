fun main(args:Array<String>) {
    var age = 30
    var name = "John"

    // Оператор && означает И для того что бы объеденить, а || - ИЛИ.

    if (name == "Bob" || name == "John" || age > 17 || age < 75) { // меньше 29 потому что после 29 идет 30, то есть если тебе 30 то тебе больше 29 лол
        println("Добро пожаловать вам больше 30")
        if (age >= 75)
            println("Вы уже старенький") // Внутри if может быть еще несколько if

    } else if (age > 19) { // Может быть бесконечное число еще else if, но If и Else будут только по 1
    println("Вам больше 20")
    } else {
        println("!Покиньте страницу")
    }

    var dayOfWeek = "Четверг"
    when (dayOfWeek) { // When Используется для сравнения когда больше 5 сравнений
        "Понедельник" -> println("Сегодня понедельник")
        "Втроник" -> println("Сегодня Вторник")
        "Среда" -> println("Сегодня Среда")
        "Четверг" -> println("Сегодня Четврег")
        "Пятница" -> println("Сегодня Пятница")
        "Суббота" -> println("Сегодня Суббота")
        "Воскресеьне" -> println("Сегодня Воскресенье")
        else -> println("Сегодня выходной")
    }
}

