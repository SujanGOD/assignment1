package assignment1

fun main(){
    print("Enter a number from 1 to 7 to display the day of the week accordingly:")
    val day= readLine()!!.toInt()
displayday(day)
}

fun displayday(day:Int){
    when(day){
        1-> print("Sunday")
        2->print("Monday")
        3-> print("Tuesday")
        4->print("Wednesday")
        5->print("Thursday")
        6->print("Friday")
        7-> print("Saturday")
    }
}