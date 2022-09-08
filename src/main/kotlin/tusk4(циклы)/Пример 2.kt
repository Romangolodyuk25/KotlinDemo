fun main(args:Array<String>) {

    var sum = 0
    var i = 100

    while (i != 0) { //Будет Прибавлять sum + i, отнимая от i по 1 еденице пока i  не станет 0, поэтому на выходе 5050
        sum += i  // sum = sum + i
        --i
    }
println("sum = $sum")
}
