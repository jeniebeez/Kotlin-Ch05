val numLetters = "Mississippi".count({
        letter -> letter == 's'} )

fun main(args: Array<String>) {
    println(numLetters)
}