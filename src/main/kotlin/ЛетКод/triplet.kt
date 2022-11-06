package ЛетКод

fun main(args: Array<String>) {
    val nums = arrayOf(2,4,5,7,8)
    val diff = 1
    var res = 0
    var finalres = 0
    for (i in 0..nums.size - 1) {
        for (j in i..nums.size - 1) {
            if (nums[j]-nums[i]==diff) {
               for (k in j..nums.size-1) {
                   if (nums[k]-nums[j]==diff) {
                       res++
                   }
               }
            }
        }
    }
    println(res)
}
