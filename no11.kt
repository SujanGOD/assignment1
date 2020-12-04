package assignment1

fun main(){
    print("Enter first number:")
    val first= readLine()!!.toInt()
    print("Enter last number:")
    val last= readLine()!!.toInt()
    var sum=0

    for(i in first..last){
        if(i%2==0){
            sum=sum+i
        }

    }
    println("The sum of even numbers between $first and $last: $sum")
}