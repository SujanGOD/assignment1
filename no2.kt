package assignment1

fun main(){
    print("Enter the day of the week:")
    val day= readLine()!!.toString()

    if (day=="Saturday"||day=="saturday"){
        print("It is a happy holiday.")
    }
    else{
        print("It is a Weekday.")
    }
}