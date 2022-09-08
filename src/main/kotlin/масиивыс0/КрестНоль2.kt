fun main(args:Array<String>) {
    var data = Array(3, { _ -> CharArray(3) })
    data[0][0] = 'o'
    data[0][1] = 'x'
    data[0][2] = 'o'
    data[1][0] = 'o'
    data[1][1] = 'x'
    data[1][2] = 'o'
    data[2][0] = 'o'
    data[2][1] = 'x'
    data[2][2] = 'o'

    finalresult(data)
}
fun finalresult(data: Array<CharArray>) {
pictures(data)
var xwin = checkwinner(data,'o')
var ywin = checkwinner(data,'x')
var progres = progress(data)
    if (xwin==true) {
        println("Победили х")
}
    else if (ywin==true) {
        println("Победили o")
    }
    else if (progres==true) {
        println("Игра в процессе")
    } else  {
        println("Ничья")
    }
}

fun checkwinner(data: Array<CharArray>, opponent: Char): Boolean{
    var x = 0
    var y = 0
    var xwin = false

    while ((y<3)&&(x<3)&&(data[y][x]!=' ')&&(data[y][x]!=opponent)) {
        x+=1
        y+=1
        if (x==3) {
            xwin = true
        }
    }
    x=0
    y=2
    while ((x<3)&&(y>=0)&&(data[y][x]!=' ')&&(data[y][x]!=opponent)&&(x<3)&&(y>=0)) {
        x+=1
        y-=1
        if (y==-1) {
            xwin = true
        }
    }
    x=0
    y=0
    while(x<3) {
        while ((y<3) && (data[y][x] != ' ') && (data[y][x] !=opponent)) {
            y += 1
            if(y==3) {
                xwin=true
                break
            }
        }
        y=0
        x+=1
    }
    x=0
    y=0
    while (y<3) {
        while ((x<3)&&(data[y][x]!=' ')&&(data[y][x]!=opponent)) {
            x+=1
            if(x==3) {
                xwin=true
                break
            }
        }
        x=0
        y+=1
    }
        return xwin
}
fun pictures(data: Array<CharArray>) {
    for(i in data) {
        for(j in i) {
            print("$j")
        }
        println()
    }
}

fun progress(data: Array<CharArray>): Boolean {
    var x = 0
    var y = 0
    var progres = false
    while (y<3) {
        while ((x<3)&&(data[y][x]!=' ')) {
            if (data[y][x]==' ') {
                progres = true
                break
            }
            x+=1
        }
        y+=1
    }
    return progres
}

