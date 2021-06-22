val numLetters = "Mississippi".count({
        letter -> letter == 's'} )

fun main(args: Array<String>) {
    println(numLetters)
}
//just for git to add .gitignore after i commited my kotlin file
//i use git restore --staged<file> to undo stage action
//use git rm --cached<file> to remove unstaged file
//git rm -f --cached<file> is force remove