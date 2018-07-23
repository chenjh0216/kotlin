package syntax

import java.io.File

//扩展函数
fun String.newValue() {
    println("newValue")
}

class CommondUsage {

    //val变量只有getter
    //var还有setter
    //会自动添加equals hashCode toString copy方法
    data class Entity(val name: String?, val age: String?)


    //函数默认参数，调用的时候可以不传参数
    fun foo(x: Int = 0, y: String = ""): Unit {

    }

    //过滤list
    fun filterList(x: List<Int>): List<Int> {
        return x.filter { y -> y > 1 }
    }

    //String内插
    val str1 = "string1"
    val str2 = "string1 value : $str1"

    //只读list
    val l = listOf(1, 3, 5, 7)

    //只读map
    val m = mapOf("1" to 2, "2" to 3)

    //延迟属性?
    val p: String by lazy {
        "sjdifs"
    }

    //单例
    object Resource {
        val n = "Name"
    }

    //if not null缩写
    fun ifnotnull(): Unit {
        val files = File("test").listFiles()
        println(files?.size)
    }

    //if not null or else缩写
    fun ifnotnullOrElse(): Unit {
        val files = File("test").listFiles()
        println(files?.size ?: "empty")
    }

    //if null
    fun ifnull(): Unit {
        val f = File("test").listFiles()
        val files = f ?: throw NullPointerException()
    }

    //if not null执行
    fun ifnotnullanddo(): Unit {
        val f = File("test").listFiles()
        f?.let {
            println("f is not null")
        }
    }

    //返回when表达式
    fun transform(x: String): Int {
        return when (x) {
            "1" -> 1
            "2" -> 2
            else -> {
                throw NullPointerException()
            }
        }
    }

    //try catch
    fun tryCatchTest(): Unit {
        val r = try {
            println("runner")
        } catch (e: NullPointerException) {
            throw NullPointerException()
        }
        //使用结果
        println(r)
    }

    //if表达式
    fun ifExp(x: Int): Unit {
        val r = if (x == 1){
            "one"
        } else {
            "two"
        }
    }

    //返回值为Unit的链式调用
    fun arrayOf(x: Int): IntArray {
        return IntArray(x).apply { fill(-1) }
    }

    //单表达式函数
    fun count() = 44

    interface Car {

    }

    interface Byd : Car {

    }

}

fun main(args: Array<String>) {
    val c = CommondUsage.Entity(null, null)
    val cu = CommondUsage()

}