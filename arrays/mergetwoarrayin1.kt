fun main()
{
    val arr1 = arrayOf(1, 2, 3)
    val arr2 = arrayOf(4, 5, 6)
    var final=Array(arr1.size+arr2.size) {0}
    for( i in 0..(arr1.size+arr2.size)-1)
    {
        if(i<arr1.size)
        {
            final[i]=arr1[i]
        }
        else
        {
            final[i]=arr2[i-arr1.size]
        }
    }
    for( i in 0..arr1.size+arr2.size-1)
    {
        println(final[i])
    }
    
}