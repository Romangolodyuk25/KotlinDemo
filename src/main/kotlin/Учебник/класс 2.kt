class Song (val title: String, val artist: String) {
    fun play() {
        println("Играть песню $title by $artist")
    }
    fun stop () {
        println("Перестать играть $title")
    }
}

fun main(args:Array<String>) {
    val song = Song("The Mesopotamians", "They Might Be Giants")
    val songTwo = Song("Going Underground", "The Jam")
    val songThree = Song("Make Me Smile", "Steve Harley")
    songTwo.play()
    songTwo.stop()
    songThree.play()
}