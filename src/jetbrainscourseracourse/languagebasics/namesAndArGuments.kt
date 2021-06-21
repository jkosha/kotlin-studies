fun displaySeparator(character: Char = '*', size: Int = 10) {
    repeat(size) {
        print(character)
    }
}

fun sum(a: Int = 0, b: Int = 0, c: Int = 0) = a + b + c

fun main() {
    displaySeparator(size = 5)
//    displaySeparator(3, '5') won't compile
    println('\n')
    displaySeparator(size = 3, character = '5')
    println(sum(a=1, b=2))

}


