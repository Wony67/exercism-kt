fun twofer(name: String): String {
    val txt : String = "One for ".plus(name).plus(", one for me.")
    return txt
}
fun twofer(): String {
    return "One for you, one for me."
}