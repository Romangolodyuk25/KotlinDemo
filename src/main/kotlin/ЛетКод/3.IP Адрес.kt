import java.util.*

fun main(args:Array<String>) {
    var string = "1.2.3.4.5"
    val result = string.replace (
    ".",
    "[.]"
            )
    println(result)
}

