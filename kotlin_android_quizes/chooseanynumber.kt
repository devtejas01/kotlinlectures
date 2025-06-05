import kotlin.random.Random
fun main()
{
    var output = Random.nextInt(from = 0, until = 4)
   
    while(output>=1)
    { var input=readLine()
    var input1=input?.toIntOrNull()
    if(input1!=null&& input1>output)
     {
        println("you won this game haha")
     }
     else
     {
        println("you loose this game hehe")
     }
    }


}