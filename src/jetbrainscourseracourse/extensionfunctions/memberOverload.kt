package jetbrainscourseracourse.extensionfunctions

class A {
    fun foo() = "member"
}

fun A.foo(i: Int) = "extension($i)"

fun main() {
    println(A().foo(2))
}
