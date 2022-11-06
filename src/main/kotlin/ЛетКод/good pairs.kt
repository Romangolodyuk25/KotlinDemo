fun main(args:Array<String>) {
    var nums = arrayOf(1,2,3,1,1,3)
    var result = 0
    for(index in 0..nums.size-1) {
        for (index1 in 1+index..nums.size-1) {
            if (nums[index1]==nums[index]) {
                result++
            }
        }
    }
    println(result)
}