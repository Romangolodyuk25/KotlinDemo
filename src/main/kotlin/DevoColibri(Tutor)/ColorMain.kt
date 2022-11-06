package `DevoColibri(Tutor)`
fun main(args:Array<String>) {

    var color: Color = Color.BLACK
    var result = getFavouriteColor(Color.BLACK)
    println(result)
}
    fun getFavouriteColor (color: Color) = when (setOf(Color.WHITE,Color.BLACK)) {
        setOf(Color.WHITE,Color.BLACK) -> "Черно - Белый"
        setOf( Color.RED,Color.RED) -> "Красно-Зеленый"
        else -> "Без цвета"
    }
//    var message: Color = Color.GREEN
//    var message2: String = Color.RED.name// Используется для того что бы вернуть RED как СТРОКУ
//
//    println(Color.YELLOW)
//    println(Color.YELLOW.colorHex)
//    println(Color.YELLOW.opacity)
//
//    Color.BLACK.funcktion()
