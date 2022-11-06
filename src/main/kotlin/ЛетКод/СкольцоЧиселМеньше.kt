import java.util.*

fun main(args:Array<String>){
    val nums = arrayOf(6,5,4,8)
    val newarray = IntArray(nums.size)
    var result = 0
    for (index in 0..nums.size-1) {
        for (index1 in 0..newarray.size-1) {
            if (nums[index]>nums[index1]) {
                result++
            }
        }
        newarray[index] = result
        result=0
    }
    println(Arrays.toString(newarray))
}

