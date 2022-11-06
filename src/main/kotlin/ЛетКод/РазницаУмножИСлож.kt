fun main(args:Array<String>) {
    var n = 4421
    var result = 0
    var result2 =  0
    var finalres = 0
    var tostring = n.toString()
    for (index in 0..tostring.length-1) {
        var toint1 = tostring[index].digitToInt()
        result = result + toint1
        if (result2==0) {
            result2 = result2 + toint1
        } else {
            result2 = result2 * toint1
        }
        }
    finalres = result2 - result
    println(finalres)
    }