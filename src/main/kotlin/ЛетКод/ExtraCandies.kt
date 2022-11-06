import java.util.*

fun main(args: Array<String>) {
    var candies = arrayOf(4, 2, 1, 1, 2)
    var extracandies = 1
    var mincandies = false
    var n = candies.size
    var candies2 = IntArray(n)
    var result = BooleanArray(n)

    for (index in 0..candies.size - 1) {
        candies2[index] = candies[index] + extracandies
    }
    for (index in 0..candies2.size - 1) {
        for (index1 in 0..candies.size - 1) {
            if (candies2[index] >= candies[index1]) {
                mincandies = true
            } else {
                mincandies = false
                break
            }
        }
        result[index] = mincandies
    }
    println(Arrays.toString(result))
}

