fun main()
{
    val arr = arrayOf(10, 15, 3, 7, 20, 25, 8, 11, 30)
    var count=0
    for(i in 0..arr.size-1)
    {
        if(arr[i]%5==0)
        {
            count++
        }
    }
    println(count)
}