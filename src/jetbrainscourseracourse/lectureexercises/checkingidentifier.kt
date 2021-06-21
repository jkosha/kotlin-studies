/*
* Checking identifier
* Implement the function that checks whether a string is a valid identifier.
* A valid identifier is a non-empty string that starts with a letter or underscore and consists of only letters, digits and underscores.
* */

fun isValidIdentifier(s: String): Boolean = null != s && s.length > 0 && Regex("^[_|a-z|A-Z][_|a-z|A-Z|0-9]*$").matches(s)


fun main(args: Array<String>) {
    println(isValidIdentifier("name"))   // true
    println(isValidIdentifier("_name"))  // true
    println(isValidIdentifier("_12"))    // true
    println(isValidIdentifier(""))       // false
    println(isValidIdentifier("012"))    // false
    println(isValidIdentifier("no$"))    // false
}
