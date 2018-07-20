package syntax

class FuncDefine {

    //定义函数
    //常规的定义方法： 函数名(变量：变量类型) : 返回值类型
    fun sum(a: Int, b: Int): Int {
        return a + b
    }

    //将表达式作为函数体、返回值类型⾃动推断的函数
    fun plus(a: Int, b: Int) = a + b

    //无返回值
    fun print(a: Int): Unit {
        System.out.print("value : $a")
    }

    fun println(a: Int) {
        System.out.println("value : $a")
    }

    //定义变量
    //var是一个可变变量，这是一个可以通过重新分配来更改为另一个值的变量。
    // 这种声明变量的方式和java中声明变量的方式一样。

    //val是一个只读变量，这种声明变量的方式相当于java中的final变量。
    // 一个val创建的时候必须初始化，因为以后不能被改变。
}