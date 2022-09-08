import java.util.Scanner

fun main(args: Array<String>) {
    val reader = Scanner(System.`in`)
    print("Enter a number: ")
    var input: Int = reader.nextInt()
    println("You entered: $input")
    if (input > 0)
        print("Positive")
    else if (input < 0)
        print("Negative")
    else
        println("zero")
}