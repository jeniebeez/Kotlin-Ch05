fun main(args:Array<String>){
    val greetingFunction:() -> String ={
        val currentYear = 2021
        "歡迎來到Sim村莊，鎮長！(copyright $currentYear)"
    }
    println(greetingFunction())
}