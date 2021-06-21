fun main(args:Array<String>){
    runSimulation("Guyal",
        ::printConstructionCost){
        playerName, numBuildings ->
        val currentYear = 2021
        println("增加$numBuildings 個房子")
        "歡迎來到Sim村莊，$playerName！(copyright $currentYear)"
    }
}

inline fun runSimulation(playerName:String,
                         costPrinter:(Int) -> Unit,
                  greetingFunction:(String,Int)-> String){
    //Randomly select 1,2 or 3
    val numBuildings = (1..3).shuffled().last()
    costPrinter(numBuildings)
    println(greetingFunction(playerName, numBuildings))
}

fun printConstructionCost(numBuildings:Int){
    val cost = 500
    println("建築成本: ${cost*numBuildings}")
}