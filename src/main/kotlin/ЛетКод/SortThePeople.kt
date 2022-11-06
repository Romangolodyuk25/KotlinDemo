package ЛетКод

import javax.xml.stream.events.Namespace

fun main(args:Array<String>) {
    var names = arrayOf("Mary", "John", "Emma")
    var age = arrayOf(180,165,170)
    var res = arrayOf<String>()
    var map = HashMap<String, Int>()

   for (index in 0..names.size-1) {
       map.put(names[index],age[index])
   }
    for ((key,value) in map) {// нужно пройтись по мап в обратном направлении и вернуть key
        println(key.toString())
    }
}