fun main()
{


val b=arrayOf(1,2,4,3,2,7)
var largest=b[0]
for(i in 0..b.size-1)
{
    largest= maxOf(b[i],largest)
}
println(largest)
var slargest=Int.MIN_VALUE

for(i in 0..b.size-1)
{
    if(b[i]<largest)
    {
        slargest=maxOf(b[i],slargest)
    }
}
println(slargest)













}