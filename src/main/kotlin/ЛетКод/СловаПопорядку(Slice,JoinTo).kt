package ЛетКод
fun main(args:Array<String>) {
    var s = "is2 sentence4 This1 a3"
    var newstr = ""
   var s2 = s.split(' ').toMutableList()

    for (index in s2.indices) {
        // index = 0
        var currentWordSize = s2[index].length // s2[0] = "is2", "is2".length = 3, currentWordSize = 3
        var originalWord = s2[index]  // originalWord = "is2"
        var wordNumber = originalWord[currentWordSize - 1].toString()  // originalWord[3 - 1] = "2", wordNumber = "2"
        var word = originalWord.slice(0..currentWordSize-2) // "is2".slice(0..3-2) = "is", word = "is"
        s2[index] = wordNumber + word // "2" + "is" = "2is"
    }
    s2.sort()
    for(index in s2.indices) {
        s2[index] = s2[index].removeRange(0..0)
    }
    var res = s2.joinToString(separator = " ")
    println(res)
}