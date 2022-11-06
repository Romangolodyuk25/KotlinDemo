fun main(args:Array<String>) {
    var s = "RLRRLLRLRL"
    var result = 0
    val wordL = 'L'
    val wordR = 'R'
    var wordsizeL = 0
    var wordsizeR = 0
    for (index in 0..s.length-1){
        if (s[index]==wordR) {
            wordsizeR++
        }
        else if (s[index]==wordL) {
            wordsizeL++
        }
        if (wordsizeL==wordsizeR) {
            result ++
            wordsizeR = 0
            wordsizeL = 0
        }
        }
    println(result)
}
