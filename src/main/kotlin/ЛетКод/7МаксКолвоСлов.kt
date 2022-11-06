import kotlin.math.max

fun main(args: Array<String>) {
    var sentences = arrayOf("alice and bob love leetcode", "i think so too", "this is great thanks very much")
    var resultword = 0
    var Maxresult = 0
    var newstr = ""
    for (index in sentences.indices) {
        for (index1 in sentences[index]) {
            newstr=sentences[index]
            for (index2 in 0..newstr.length-1) {
                if (newstr[index2]==' ') {
                    resultword ++
                    }
            }
            if (resultword>Maxresult){
                Maxresult = resultword
            }
            resultword = 0
        }
    }
    Maxresult++
    println(Maxresult)
}