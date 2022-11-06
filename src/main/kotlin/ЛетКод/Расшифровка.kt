import java.util.Arrays

fun main(args: Array<String>) {
    var key = "the quick brown fox jumps over the lazy dog"
    var newkey= " "
    var message = "vkbs bs t suepuv"
    var alphavit = listOf<Char>('a', 'b', 'c','d', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z')
    var numberindex = IntArray(message.length)
    var result = ""

    for(index in 0..key.length-1) {
        if (key[index]==' ') {

        }
        newkey= newkey + key[index]
    }
    println(newkey)
}

