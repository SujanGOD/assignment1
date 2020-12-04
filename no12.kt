package assignment1

fun main(){
    print("Enter a number:")
    val num= readLine()!!.toInt()
    println("The multiplication of number $num:")
    var result=0
    for(i in 1..10){
        result=i*num
        println("$num*$i=$result")
    }
}