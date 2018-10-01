package leetcode

fun main(args: Array<String>) {
    val data = intArrayOf(4,9,787,15,2,36,5)
    TwoSum().find(data,7).forEachIndexed { index, i -> print("$i ") }
    TwoSum().find(data,3).forEachIndexed { index, i -> print("$i ") }
}

/**
 * https://leetcode-cn.com/problems/two-sum/description/
 * 给定一个整数数组和一个目标值，找出数组中和为目标值的两个数。
 * 你可以假设每个输入只对应一种答案，且同样的元素不能被重复利用。
 */
class TwoSum {

    fun find(data: IntArray, target: Int): IntArray {
        val m = HashMap<Int,Int>()
        data.forEachIndexed { index, i ->
            m.put(i,index)
            val k = target - i
            if (m.containsKey(k)){
                return intArrayOf(m.getValue(k),index)
            }
        }
        throw Exception("no such target value")
    }

}