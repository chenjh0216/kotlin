package syntax

fun main(args: Array<String>) {
    val s = StringDefine()
    System.out.println("a:${s.a} b:${s.b}")
}

class StringDefine {

    //字符串模板，这个跟perl的用法差不多
    val a : String = "string1"

    val b = "before replace : $a .\n" +
            "after replace : ${a.replace("1","2")}"

}