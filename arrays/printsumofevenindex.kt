fun main()
{
    val arr = arrayOf(10, 15, 3, 7, 20, 25, 8, 11, 30)
    var sum=0
    for( i in 0..arr.size-1 step 2)
    {
        sum=arr[i]+sum

    }
    println(sum)

}