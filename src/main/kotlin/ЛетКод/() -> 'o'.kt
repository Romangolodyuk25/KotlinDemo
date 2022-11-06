fun main(args:Array<String>) {
    var command = "G()()()()(al)"
    var result = command.replace(
        "()",
        "o",
    )
    var finalresult = result.replace(
        "(al)",
        "al"
    )
    println(finalresult)
}
