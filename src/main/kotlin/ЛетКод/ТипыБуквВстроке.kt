fun main(args:Array<String>){
    val stones = "aAAbbbb"
    val jewels = "aA"
    var result = 0

    for (index in 0..jewels.length-1) {
     for (index1 in 0..stones.length-1) {
         if (stones[index1]==jewels[index]) {
             result ++
         }
     }
    }
    println(result)
}

