

fun grading(grade:Int)
{
    when (grade)
    {
        in 90..100 -> println("A+")
        in 75..89 -> println("B+")
        in 65..74 -> println("B")
        in 35..64 -> println("C")
        else -> println("Fail")

    }
}
fun main()
{
    
    println("Enter Your Marks")
    var number=readln()?.toInt()?:0
    grading(number)

}