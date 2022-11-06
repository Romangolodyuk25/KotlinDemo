fun main(args:Array<String>) {
    var nums = intArrayOf(1,2,3,4)
    var nums3 = nums.toMutableList();
    var nums2 = mutableListOf<Int>()
    var num = 0
    for (index in 0..nums3.size-1 ) {
        if(index!=nums3.size) {
            num = nums3[index]
            nums3.removeAt(index)
        }else {
            break
        }
        for(index1 in 0..num-1) {
            nums2.add(nums3[index])
        }
        num = 0
    }
    println(nums2.toIntArray())
}
