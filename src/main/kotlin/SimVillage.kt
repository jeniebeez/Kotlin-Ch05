fun main(args:Array<String>){
    val greetingFunction:(String) -> String ={
        val currentYear = 2021
        "歡迎來到Sim村莊，$it！(copyright $currentYear)"
    }
    println(greetingFunction("Guyal"))
}