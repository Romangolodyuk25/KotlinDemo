import java.util.*

fun main(args:Array<String>) {
    val accounts = Array(3,{Array(3,{2})})
    accounts[0][0] = 2
    accounts[0][1] = 8
    accounts[0][2] = 7 //17
    accounts[1][0] = 7
    accounts[1][1] = 1
    accounts[1][2] = 3 // 11
    accounts[2][0] = 1
    accounts[2][1] = 9
    accounts[2][2] = 5 //15
    var result = 0
    var Maxresult = 0
    for (index in accounts.indices) {
        for(index1 in accounts[index].indices) {
                result = result + accounts[index][index1]
        }
        if (result >= Maxresult) {
            Maxresult = result
            result = 0
        }
        result = 0
    }
    println("$Maxresult")
}

