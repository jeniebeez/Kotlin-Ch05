fun main(args:Array<String>){
    val greetingFunction:(String,Int) -> String ={
        playerName, numBuildings ->
        val currentYear = 2021
        println("增加$numBuildings 個房子")
        "歡迎來到Sim村莊，$playerName！(copyright $currentYear)"
    }
    println(greetingFunction("Guyal",2))
}