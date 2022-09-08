fun main(args:Array<String>) {
    var sentences = arrayOf("alice and bob love leetcode", "i think so too", "this is great thanks very much")
    var probel = ' '
    var result = 0
    var Maxresult = 0
    for (i in sentences.indices) {
        for (j in sentences[i].indices)
            if (sentences[i] == "b") { // не могу поставить ' ' потому что с Char нельзя сравнить стринг
                result = result + 1
            }
            println("$result")
        }
    }