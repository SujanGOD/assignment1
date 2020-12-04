package assignment1

fun main(){
    print("Enter a number:")
    val num= readLine()!!.toInt()

    if (num>100){
        print("The number $num is greater than 100.")
    }
    else {
        print("The number $num is not greater than 100.")
    }

    }