fun main(){
    println("Ввести X")
    val x: Int = readLine()!!.toInt()
    if(x<0){
        val F=4
        println("При x<0 = $F")
    }
    if(0<=x||x<1){
       val F=x*x+3*x+4
        println("При 0<=x<1 = $F")
    }
    if(x>1){
        val F=x+7
        println("При x>1 = $F")
    }
}




