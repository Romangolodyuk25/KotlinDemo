fun main(args:Array<String>){
var x = arrayOf(12, 5, 8, 7, -2, -9)
var minNumber = x[0]
for (number in x) {
    if (number < minNumber) {
       minNumber = number
    }
    println("Наименьшее число: $minNumber")
}
}
