package assignment1

fun main(){
    print("Enter your yearly salary:")
    val salary= readLine()!!.toInt()

    if(salary>20000){
        print("You have to pay tax.")
    }
    else{
        print("You don't have to pay tax.")
    }
}