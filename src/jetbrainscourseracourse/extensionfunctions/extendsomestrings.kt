package jetbrainscourseracourse.extensionfunctions

fun String.lastChar() = this.get(this.length - 1)
fun String.lastChar2() = get(this.length - 1)

fun main() {
    println("abc".lastChar())
    println("def".lastChar2())
}
