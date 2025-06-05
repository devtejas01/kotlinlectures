fun adult(age:Int)
{
    if (age > 18)
    {
        println("adult")

    }
    else{
        println("minor")
    }
}
fun main()
{
    val age= readln()?.toInt()?:0 // converted to int if .?toInt convert to nullint but to convert to int with no null value we have to set a default value which we have set to zero by ?:0
    adult(age)
}