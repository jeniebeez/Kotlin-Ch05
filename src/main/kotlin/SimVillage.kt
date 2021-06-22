fun main(args:Array<String>){
    runSimulation()
}

fun runSimulation(){
    val greetingFunction = configureGreetingFunction()
    println(greetingFunction("Guyal"))
    println(greetingFunction("Guyal"))
}

fun configureGreetingFunction():(String) -> String{
    val structureType = "醫院"
    var numBuildings = 5
    return {playerName:String ->
        val currentYear =2021
        numBuildings +=1
        println("增加 $numBuildings 個$structureType")
        "歡迎來到Sim村莊，$playerName!(copyright $currentYear)"
    }
}
//just for git to add .gitignore after i commited my kotlin file
//i use git restore --staged<file> to undo stage action
//use git rm --cached<file> to remove unstaged file
//git rm -f --cached<file> is force remove