import kotlin.math.abs
fun main(){
    println("Задать три числа");
    val a: Double = readLine()!!.toDouble();
    val b: Double = readLine()!!.toDouble();
    val c: Double = readLine()!!.toDouble();
   if (a-b == b-c){
       println("Являются");
   }
   else{
       println("Не являются");
   }
}