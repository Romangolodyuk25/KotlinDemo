fun main(args:Array<String>) {
    val fireman = arrayOf("Pugh", "Pugh", "Barney McGrew", "Cuthbert", "Dibble", "Grub")
    var firemanNo = 0

    while (firemanNo < 6) {
        println("Fireman number {$firemanNo is $fireman[firemanNo]}")
        firemanNo = firemanNo + 1
    }
}

