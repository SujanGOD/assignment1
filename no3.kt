package assignment1

fun main(){
    print("Enter a number:")
    val num= readLine()!!.toInt()

    if(num==0){
        print("The input number is zero.")
    }
    if(num>0){
        print("The input number is positive.")
    }
    else{
        print("The input number is negative.")
    }
}