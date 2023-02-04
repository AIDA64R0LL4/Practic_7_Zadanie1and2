fun main() {
    println("Введите 1 и 5 член арифметической прогресcии");
    val one: Int = readLine()!!.toInt();
    val five: Int = readLine()!!.toInt();
    println("Введите номер числа из арифметической прогреcсии");
    val n: Int = readLine()!!.toInt();
    val difference: Double=(one-five)%4.0;
    val progressionMember: Double=one*(n-1)*difference;
   val sum: Double=((five+progressionMember)*n)%2.0;
    println("$n-ый член прогрессии: $progressionMember");
    println("Сумма первых $n членов прогрессии: $sum");
}


