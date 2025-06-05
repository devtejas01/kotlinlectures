

fun multiply(a:Int,b:Int):Int
{
    val multiply=a*b;
    return multiply;
}
fun main()
{
    println("Enter Two Numbers You Want To Multiply")
    val a=readln()?.toInt()?:0
    val b=readln()?.toInt()?:0
    val c =multiply(a,b)
    println(c)

}