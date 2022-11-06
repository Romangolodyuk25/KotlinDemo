package ЛетКод1

import result
import java.util.*
import java.util.LinkedList

class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}
class Solution3 {
    fun checktarget(original: TreeNode, clone: TreeNode, target: TreeNode): TreeNode? {
        var result: TreeNode? = null
        var toVisitclone: Queue<TreeNode> = LinkedList<TreeNode>()
        var visitedclone = hashSetOf<TreeNode>()
        toVisitclone.add(clone)
        var toVisitoriginal: Queue<TreeNode> = LinkedList<TreeNode>()
        var visitedoriginal = hashSetOf<TreeNode>()
        toVisitoriginal.add(original)
        while((!toVisitclone.isEmpty())&&(!toVisitoriginal.isEmpty())) {
            var element = toVisitclone.poll()
            var element2 = toVisitoriginal.poll()
            if((element.left!=null)&&(element2.left!=null)&&(visitedclone.contains(element.left)==false)&&(visitedoriginal.contains(element.left)==false)) {
                toVisitclone.add(element.left)
                visitedclone.add(element)
                toVisitoriginal.add(element2.left)
                visitedoriginal.add(element2)
            }
            if ((element.right!=null)&&(element2.right!=null)&&(visitedclone.contains(element.right)==false)&&(visitedoriginal.contains(element.right)==false)) {
                toVisitclone.add(element.right)
                visitedclone.add(element)
                toVisitclone.add(element2.right)
                visitedoriginal.add(element2)
            }
            if(element2==target) {
                result = element
            }
        }
        return result
    }
}
fun main(args:Array<String>) {
    var original = TreeNode(7)

    original.left = TreeNode(4)
    original.right = TreeNode(3)
    original.right!!.left = TreeNode( 6)
    original.right!!.right = TreeNode(19)
    var target = original.right

    var clone = TreeNode(7)

    clone.left = TreeNode(4)
    clone.right = TreeNode(3)
    clone.right!!.left = TreeNode( 6)
    clone.right!!.right = TreeNode(19)

    var solution = Solution3()
    var result = target?.let { solution.checktarget(original,clone, it) }
    println(result)
}