fun main()
{
    var b=IntArray(5)
    for(i in 0..4)
    {
        b[i]=readln()?.toIntOrNull()?:0
    }
    println(b.sum())
    println(b.average())
    b.sort()
    for(i in 0..4)
    {
        println(b[i])
    }
}