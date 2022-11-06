package ЛетКод

import java.util.LinkedList
import java.util.Queue

class TreeNode2(var `val`: Int) {
    var left: TreeNode2? = null
    var right: TreeNode2? = null
}
class Solution2 {
    fun checkTree(root: TreeNode2):Boolean {
        var queue: Queue<TreeNode2> = LinkedList<TreeNode2>()
        var visited = hashSetOf<TreeNode2>()
        var sum = 0
        var result = false
        queue.add(root!!)
        var child1 = 0
        var child2 = 0
        while(!queue.isEmpty()) {
            var element = queue.poll()
            if ((element.left!=null)&&(visited.contains(element.left)==false)) {
                queue.add(element.left)
                visited.add(element)
            }
            if ((element.right!=null)&&(visited.contains(element.right)==false)) {
                queue.add(element.right)
                visited.add(element)
            }
            if((root.right!=null)&&(root.left!=null)) {
                sum+= root.left!!.`val`
                sum += root.right!!.`val`
                break
            }

        }
        if (sum==root.`val`) {
            result=true
        }
        return result
    }
}
fun main(args:Array<String>) {
    var root = TreeNode2(5)
    root.left = TreeNode2(3)
    root.right = TreeNode2(1)

    var solution2 = Solution2()
    var result = solution2.checkTree(root)

    println(result)
}
