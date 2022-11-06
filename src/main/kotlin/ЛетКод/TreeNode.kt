package ЛетКод

import java.util.*
import kotlin.collections.HashSet

class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}

class Solution {
    fun rangeSumBST(root: TreeNode?, low: Int, high: Int): Int {
        var toVisit: Queue<TreeNode> = LinkedList<TreeNode>()
        var visited = hashSetOf<TreeNode>()
        var result = 0
        toVisit.add(root!!)
        while (!toVisit.isEmpty()) {
            var element = toVisit.poll()
            if((element.`val`>=low)&&(element.`val`<=high)){
                result= result + element.`val`
            }
            if ((element.left != null) && (visited.contains(element.left) == false)) {
                toVisit.add(element.left)
                visited.add(element)
            }
            if ((element.right != null) && (visited.contains(element.right) == false)) {
                    toVisit.add(element.right)
                    visited.add(element)
                }
            }
        return result
    }
}

fun main(args: Array<String>) {
    var root = TreeNode(10)
    root.left = TreeNode(5)
    root.left!!.left = TreeNode(3)
    root.left!!.right = TreeNode(7)
    root.right = TreeNode(15)
    root.right!!.right = TreeNode(18)

    var solution = Solution()

    var result = solution.rangeSumBST(root, 7, 15)
    println(result)
}

