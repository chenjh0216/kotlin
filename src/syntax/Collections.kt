package syntax

class Collections {

    internal fun loopCollection(x: Collection<Any>): Unit {
        //for遍历
        for (any in x) {
            //...
        }
        val i = x.iterator()
        while (i.hasNext()){
            val a = i.next()
            println(a)
        }
    }

}