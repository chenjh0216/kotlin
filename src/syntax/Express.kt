package syntax

class Express {

    //条件表达式
    fun biggerThan(x: Int, y: Int) = x > y

    //如果一个变量可以为null,必须在声明处类型后添加？来标记
    fun checkStatus(): Boolean? {
        return null
    }

    //类型检测 is运算符检测一个表达式是否是某个类型的实例
    fun isInt(x: Any): Boolean {
        return x is Int
    }

    //while循环
    fun loopWhile(): Unit {
        val items = listOf(1,3,4,5,6,7,8)
        var index = 0
        while (index < items.size){
            println("item at $index is ${items[index]}")
            index++
        }
    }

    fun loopWhen(o : Any): String =
        when (o){
            1 -> "one"
            2 -> "two"
            3 -> "three"
            4 -> "four"
            else -> "Unknown"
        }


    //区间
    fun rangePrinter(x : Int): Unit {
        //数列迭代 等价于for(int x = 1; i<30; i+=5)
        for (a in 1..30 step 5){
            println("current value : $a")
        }
        //等价于for(int x = 9; i>0; i-=2)
        for (k in 9 downTo 0 step 2){
            println("k : $k")
        }

        //判断x是否在某个区间内
        if (x !in 0..30){
            println("x out of range")
        }

    }

}

fun main(args: Array<String>) {
    val e = Express()
    e.loopWhile()
    println(e.loopWhen(3))
    e.rangePrinter(5)
}