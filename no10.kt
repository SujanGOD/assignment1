package assignment1

fun main(){
    print("Enter first number:")
    val first= readLine()!!.toInt()
    print("Enter last number:")
    val last= readLine()!!.toInt()
    println("The odd numbers between $first and $last:")
    for (i in first..last){
        if (i%2!=0){
            println("$i")
        }
    }
}