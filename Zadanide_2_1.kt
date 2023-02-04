fun main(){
    println("Ввести целое число N")
    val n: Int = readLine()!!.toInt()
    if(n%3==0){
        println("N кратно 3")
    }
    else{
        println("N не кратно 3")
    }
}
