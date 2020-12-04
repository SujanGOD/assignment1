package assignment1

import kotlinebasic.displayeven

fun main(){
    print("Enter first number:")
    val first= readLine()!!.toInt()
    print("Enter second number:")
    val last= readLine()!!.toInt()
    println("The even numbers between $first and $last:")
for(i in first until last){
    if(i%2==0){
        println("$i")
    }

}
}
