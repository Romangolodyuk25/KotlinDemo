fun main(args:Array<String>) {
    var numbers = intArrayOf(1, 2, 3, 4, 5)
    var result = runningSum(numbers)
    for(i in result) {
        print(i)
        print(",")
    }
}
fun runningSum(nums: IntArray): IntArray {
    var numbers = arrayOf(1, 2, 3, 4, 5)
    var index = 0
    var index1 = 1
    var result = nums[index]
    while (index1 < nums.size) {
        result = nums[index1] + result
        nums[index1] = result
        index = index + 1
        index1 = index1 + 1
    }
    return nums
}

