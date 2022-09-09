fun main(args: Array<String>) {
    println("Введите данные")
    var input = readLine()
    var index = 0
    var string1 = ""
    var string2 = ""
    var sign = ' '
    if (input != null) {
        while (index < input.length) {// то же самое что и .size только для строки
            if ((input[index] != '+') && (input[index] != '-') && (input[index] != '*') && (input[index] != '/') && (sign == ' ')) {
                string1 = string1 + input[index]
            } else if (sign != ' ') {
                string2 = string2 + input[index]
            } else {
                sign = input[index]
            }
            index++
        }

//        println(string1)
//        println(string2)
//        println(sign)>>>>
    }
    var tostring1 = string1.toInt()
    var tostring2 = string2.toInt()
    var result = 0

    if (sign=='+'){
        result = tostring1 + tostring2
    } else if (sign=='-') {
        result = tostring1 - tostring2
    } else if (sign=='*') {
        result = tostring1 * tostring2
    } else {
        result = tostring1 / tostring2
    }
    println(result)
}