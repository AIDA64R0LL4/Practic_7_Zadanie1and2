import kotlin.math.sqrt
fun main() {
    println("Задать a,b,c- стороны треугольника");
    val a: Int = readLine()!!.toInt();
    val b: Int = readLine()!!.toInt();
    val c: Int = readLine()!!.toInt();
    val p=3.14;
    val r= Math.sqrt((p-a)*(p-b)*(p-c)/p);
    println(String.format("Радиус вписанной окружности равен: %.2f",r/2));
}
//21
