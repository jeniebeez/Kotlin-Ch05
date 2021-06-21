fun main(args:Array<String>){
    val greetingFunction ={
        playerName:String, numBuildings:Int ->
        val currentYear = 2021
        println("增加$numBuildings 個房子")
        "歡迎來到Sim村莊，$playerName！(copyright $currentYear)"
    }
    runSimulation("Guyal", greetingFunction)
}

fun runSimulation(playerName:String,
                  greetingFunction:(String,Int)-> String){
    //Randomly select 1,2 or 3
    val numBuildings = (1..3).shuffled().last()
    println(greetingFunction(playerName, numBuildings))
}