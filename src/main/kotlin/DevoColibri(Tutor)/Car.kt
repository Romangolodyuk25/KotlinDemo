class Car(private var weight:Float,private var size:Int) {

    var isnew:Boolean = false
        get() {
        return weight > size
         }
        set(value) {
            if(value) {
                println("Yess")
            }
            field = value
        }
}