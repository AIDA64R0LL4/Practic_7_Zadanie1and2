import kotlin.math.sqrt
import kotlin.math.sin
import kotlin.math.cos
fun main(){
    println("Задать X для вычисления");
    val x: Double = readLine()!!.toDouble();
    val r= cos(x)/sin(x)-sin(x)*(Math.sqrt(x*x+1));
    println("Результат : $r");
}
