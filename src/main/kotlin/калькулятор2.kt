fun main(args:Array<String>) {
    var input= readLine()
    var string1 = ""
    var sign = ' '
    var string2 = ""
    var index = 0
    if (input!=null){
        while (index<input.length) {
            if((input[index]!='+')&&(input[index]!='-')&&(input[index]!='*')&&(input[index]!='/')&&(sign==' ')) {
                string1 = string1 + input[index]
            } else if (sign!=' ') {
               string2 = string2 + input[index]
            } else {
                sign = input[index]
            }
            index++
        }
    }
    var tostring1 = string1.toInt()
    var tostring2 = string2.toInt()
    var result = 0
    if (sign=='+'){
        result = tostring1 + tostring2
    }else if (sign=='-'){
        result = tostring1 - tostring2
    } else if (sign=='*'){
        result = tostring1 * tostring2
    } else {
        result = tostring1 / tostring2
    }
    println(result)
}