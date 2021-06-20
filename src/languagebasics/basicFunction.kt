package languagebasics

fun max0(a: Int, b: Int): Int {
    return if (a > b) a else b
}

fun max1(a: Int, b: Int): Int = if (a > b) a else b

//redundant unit type on purpose
fun displayMax (a: Int, b: Int): Unit{
    println(max1(a, b))
}
