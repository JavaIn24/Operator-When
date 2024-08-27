package Task2

fun main(){
    var num = 25.64
    val df = DecimalFormat("#")
    df.roundingMode = RoundingMode.CEILING
    println(df.format(num))
}
