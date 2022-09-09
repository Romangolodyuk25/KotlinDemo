fun main(args:Array<String>) {
    var data = Array(3, { _ -> CharArray(3) })
    data[0][0] = 'o'
    data[0][1] = 'x'
    data[0][2] = 'o'
    data[1][0] = 'o'
    data[1][1] = 'o'
    data[1][2] = ' '
    data[2][0] = 'x'
    data[2][1] = 'x'
    data[2][2] = ' '
    result1(data)
}
fun result1(data: Array<CharArray>) {
    draw(data)
    var winx = checkingwinx(data,'o')
    var winy = checkingwinx(data,'x')
    var progress = inprogress(data)
    if (winx==true) {
        println("Победа х")
    } else if(winy==true){
    println("Победа o")
    } else if (progress==true) {
        println("В процессе")
    } else {
        println("Ничья")
    }
}

fun checkingwinx(data: Array<CharArray>, opponent: Char): Boolean {
    var x = 0
    var y = 0
    var winx = false

    while ((x<3)&&(y<3)&&(data[y][x]!=' ')&&(data[y][x]!=opponent)) {
        y+=1
        x+=1
        if (x==3) {
            winx = true
        }
    }
    x=0
    y=2
    while((x<3)&&(y<3)&&(data[y][x]!=' ')&&(data[y][x]!=opponent)) {
        x+=1
        y-=1
        if (y==-1) {
            winx = true
        }
    }
    x=0
    y=0
    while (x<3) {
        while ((y<3)&&(data[y][x]!=' ')&&(data[y][x]!=opponent)) {
            y+=1
            if(y==3) {
                winx = true
                break
            }
        }
        y=0
        x+=1
    }
    y=0
    x=0
    while (y<3) {
        while ((x<3)&&(data[y][x]!=' ')&&(data[y][x]!=opponent)) {
            x+=1
            if (x==3) {
                winx=true
                break
            }
        }
        x=0
        y+=1
    }
    return winx
}
fun inprogress(data:Array<CharArray>): Boolean {
    var x = 0
    var y = 0
    var progress = false
    while (x < 3) {
        while ((y < 3) && (data[y][x] != ' ')) {
            if (data[y][x] == ' ') {
                progress = true
                break
            }
            y += 1
        }
        y=0
        x += 1
    }
    return progress
}

fun draw1(data: Array<CharArray>){
    for (i in data) {
        for (j in i) {
            print("$j")
        }
        println()
    }
}
