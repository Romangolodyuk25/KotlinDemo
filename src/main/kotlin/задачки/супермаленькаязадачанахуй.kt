fun main(args:Array<String>) {
    var a = 1;
    var b = 2;
    val result = a // нужна переменная что бы не проебать значение а
    a = b
    b = result
    println("$a:a ")
    println("$b:b ")
}
