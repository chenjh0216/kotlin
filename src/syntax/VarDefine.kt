package syntax

class VarDefine {

    //全局变量
    val a: Int = 1 //立即赋值

    val b = 2 //自动推断类型

    //val c : Int //全局变量未初始化无法通过编译
    //c = 3

    fun init(){
        val a : Int = 1
        val b = 3
        val c : Int //定义局部变量可以不赋值
        c = 3 //后续的赋值操作

        var x = 4 //自动推断类型
        x += 1
    }

}