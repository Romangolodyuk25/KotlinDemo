import java.util.*

fun main(args: Array<String>) {
    var nums = arrayOf(1,2,3,4)
    var pairs = IntArray(nums.size / 2)
    var pairs1 = IntArray(nums.size / 2)
    var index1 = 0
    for (index in 0..nums.size - 1) {
        if (index >= nums.size / 2) {
            pairs1[index1] = nums[index]
            index1++
        } else {
            pairs[index] = nums[index]
        }
    }
    var n = 0
    var n1 =0
    for (index in 0..pairs.size) {
        if (index == 0) {
            n = pairs[index]
            n1 = pairs[index]
            break
        }
    }
    var n2 = 0
    for (index in 0..pairs1.size) {
        if (index==0) {
            n = n + pairs1[index]
            n2 = pairs1[index]
            break
        }
        }
    var result = IntArray(n)//(n1)//суть в том что размер массива будет не nums.size а такой сколько будет значение n
    var indexnew = n1
    for (index in 0..pairs.size) {
        while (n1!=0) {
            result[index] = pairs[indexnew]
            indexnew++
            n1--
        }
    }
    indexnew =1
    for(index in indexnew..pairs1.size) {
        while (n2!=0) {
            result[indexnew] = pairs1[index]
            n2--
            indexnew++
        }
    }
    var array1 = result.toList()
    println(Arrays.toString(result))
}
