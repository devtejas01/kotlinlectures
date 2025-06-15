fun main()
{
    val arr = arrayOf(5, 10, 15, 20, 25)
    var avg=arr.average().toInt()
    var count=0
    for(i in 0..arr.size-1)
    {
        if(avg<arr[i])
        {
            count++
        }
    }
    println(avg)
    println(count)

}
