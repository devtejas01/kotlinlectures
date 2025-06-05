fun add():Int
{
    var a =readln()?.toInt()?:0
    var b =readln()?.toInt()?:0
    return a+b
}
fun main()
{
    val result =add()
     println("Sum is: $result")
}