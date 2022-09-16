package play

fun main(args: Array<String>) {
    //переименовать в имя отражающее содержание
    val data = Array(3, { _ -> CharArray(3) })
    data[0][0] = 'o'
    data[0][1] = 'o'
    data[0][2] = 'o'
    data[1][0] = 'o'
    data[1][1] = 'x'
    data[1][2] = 'x'
    data[2][0] = 'o'
    data[2][1] = 'x'
    data[2][2] = 'x'

    draw(data)
    val result = final(data)

    when(result) {
        Status.X_WON -> println("Победили крестики")
        Status.O_WON -> println("Победили нолики")
    }

    data[0][0] = 'x'
    data[0][1] = 'o'
    data[0][2] = 'o'
    data[1][0] = 'o'
    data[1][1] = 'x'
    data[1][2] = 'o'
    data[2][0] = 'o'
    data[2][1] = 'o'
    data[2][2] = 'x'

    final(data)

    data[0][0] = 'x'
    data[0][1] = 'x'
    data[0][2] = 'x'
    data[1][0] = 'o'
    data[1][1] = 'x'
    data[1][2] = 'o'
    data[2][0] = 'o'
    data[2][1] = 'o'
    data[2][2] = 'x'

   final(data)

    data[0][0] = 'x'
    data[0][1] = ' '
    data[0][2] = 'o'
    data[1][0] = 'o'
    data[1][1] = 'o'
    data[1][2] = 'x'
    data[2][0] = ' '
    data[2][1] = ' '
    data[2][2] = 'o'

   final(data)

   data[0][0] = 'x'
    data[0][1] = 'o'
    data[0][2] = 'o'
    data[1][0] = 'o'
    data[1][1] = 'o'
    data[1][2] = 'x'
    data[2][0] = 'o'
    data[2][1] = 'x'
    data[2][2] = 'x'

    final(data)

    data[0][0] = 'o'
   data[0][1] = 'x'
    data[0][2] = 'o'
    data[1][0] = 'o'
    data[1][1] = 'x'
    data[1][2] = 'o'
    data[2][0] = 'x'
    data[2][1] = 'o'
    data[2][2] = 'x'

    final(data)

}

//функция должна возвращать значение
//переименовать в имя отражающее содержание
fun final(data: Array<CharArray>) : Status {
    var winx = checkwon(data, 'o','x')
    var wino = checkwon(data, 'x','o')
    var progress = inprogres(data)

    if (winx == true) {
        return Status.X_WON
    } else if (wino == true) {
        return Status.O_WON
    } else if (progress == true) {
        return Status.IN_PROGRESS
    } else {
        return Status.DRAW
    }
}

fun checkwon(data: Array<CharArray>, opponent: Char, player: Char): Boolean {

    var xwin = false
    var ifwindiagonal = false

    for (index in 0..2) {
        if (data[index][index] == player) {
            xwin = true
        } else if ((data[index][index] == ' ') || (data[index][index] == opponent)) {
            xwin = false
            break
        }
    }
    if (xwin == true) {
        ifwindiagonal=xwin
    }
    for (index in 2 downTo 0) {
        if (ifwindiagonal==true) {
            break
        }
         if (data[index][data.size-1 - index] == player) {
            xwin = true
        } else if ((data[index][data.size - 1 - index] == ' ') || (data[index][data.size - 1 - index] == opponent)) {
            xwin = false
            break
        }
    }
    for (index in 0..2) {
        if (xwin==true) {
            break
        }
        for (index1 in 0..2) {// проверяет строки но нужно сделать так что если 3х и тру то закончить цикл
            if (data[index][index1] == player) {
                xwin = true
            } else if ((data[index][index1] == ' ') || (data[index][index1] == opponent)) {
                xwin = false
                break
            }
        }
//        if (xwin == true) {
//            break
//        }
    }
    for (index in 0..2) {
        if (xwin==true) {
            break
        }
        for (index1 in 0..2) {
            if (data[index1][index] == player) {
                xwin = true
            } else if ((data[index1][index] == ' ') || (data[index1][index] == opponent)) {
                xwin = false
                break
            }
        }
//        if (xwin == true) {
//            break
//        }
    }
    return xwin
}

fun inprogres(data:Array<CharArray>): Boolean {
    var progress = false

    for (index in 0..2) {
        if (progress==true) {
            break
        }
        for (index1 in 0..2) {
            if (data[index1][index] == ' ') {
                progress = true
            }
        }
//        if (progress == true) {
//            break
//        }
    }
    return progress
}

fun draw(data: Array<CharArray>) {
    for (array in data) {
        for (array1 in array) {
            print(array1)
        }
        println()
    }
}

enum class Status {
    X_WON,
    O_WON,
    IN_PROGRESS,
    DRAW
}

enum class Player {

}