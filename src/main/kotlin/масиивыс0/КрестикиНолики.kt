fun main(args:Array<String>) {
    var data = Array(3, { _ -> CharArray(3) })
    data[0][0] = 'x'
    data[0][1] = 'o'
    data[0][2] = 'o'
    data[1][0] = 'o'
    data[1][1] = 'x'
    data[1][2] = 'o'
    data[2][0] = 'o'
    data[2][1] = 'o'
    data[2][2] = 'x'

    result(data)

    data[0][0] = 'o'
    data[0][1] = 'o'
    data[0][2] = 'x'
    data[1][0] = 'o'
    data[1][1] = 'x'
    data[1][2] = 'o'
    data[2][0] = 'x'
    data[2][1] = 'o'
    data[2][2] = 'o'

    result(data)

    data[0][0] = 'o'
    data[0][1] = 'x'
    data[0][2] = 'o'
    data[1][0] = 'x'
    data[1][1] = 'o'
    data[1][2] = 'o'
    data[2][0] = 'o'
    data[2][1] = 'x'
    data[2][2] = 'o'

    result(data)

    data[0][0] = ' '
    data[0][1] = 'o'
    data[0][2] = 'o'
    data[1][0] = 'o'
    data[1][1] = 'x'
    data[1][2] = 'o'
    data[2][0] = 'o'
    data[2][1] = 'o'
    data[2][2] = 'x'

    result(data)

    data[0][0] = 'o'
    data[0][1] = 'o'
    data[0][2] = 'x'
    data[1][0] = 'x'
    data[1][1] = 'x'
    data[1][2] = 'o'
    data[2][0] = 'o'
    data[2][1] = 'o'
    data[2][2] = 'x'

    result(data)

}
fun result(data: Array<CharArray>) {
    draw(data)
    var winx = checkwin(data, 'o')
    var wino = checkwin(data, 'x')
    var progress = isinprogress(data)

    if (winx==true){
        println("Победили x")
    } else if (wino==true) {
        println("Победили о")
    } else if (progress==true) {
        println("Игра в процессе")
    }else{
        println("Ничья")
    }
}
fun checkwin(data: Array<CharArray>, opponent: Char): Boolean {
    var xwon = false
    var x = 0
    var y = 0
    while ((y<3) && (x<3) && (data[y][x] !=' ') && (data[y][x]!=opponent)) {
        y +=1
        x +=1
    }
    if (x==3) {
        xwon = true
    }
    x = 0 //0 2, 1 1, 2 0
    y = 2
    while((y>=0) && (x<3) && (data[y][x]!=' ') && (data[y][x]!=opponent)) {
        x+=1
        y-=1
    }
    if (y==-1) {
        xwon = true
    }
    x = 0
    y = 0
    while (y<3) {
        while ((x<3)&&(data[y][x]!=' ')&&(data[y][x]!=opponent) ) {
            x+=1
            if(x==3) {
                xwon = true
                break
            }
        }
        x=0
        y+=1
    }
    y=0
    x=0
    while (x<3) {
        while ((y<3)&&(data[y][x]!=' ')&&(data[y][x]!=opponent)){
            y+=1
            if (y==3) {
                xwon = true
                break
            }
        }
        x+=1
    }
    return xwon
}
fun isinprogress(data: Array<CharArray>): Boolean {
    var x = 0
    var y = 0
    var result = false
    while (y<3){
        while (x<3) {
            if (data[y][x]==' ') {
                result = true
                break
            }
            x+=1
        }
        y+=1
    }
    return result
}
fun draw(data:Array<CharArray>) {
    for (array1 in data) {
        for (array2 in array1) {

            print("$array2")
        }
        println()
    }
}
