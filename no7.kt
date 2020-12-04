package assignment1

fun main(){
    print("Enter a single digit number:")
    val num= readLine()!!.toInt()
    displaynumword(num)
}
fun displaynumword(num:Int){
    when(num){
        0-> print("$num in word is zero.")
        1-> print("$num in word is one.")
        2-> print("$num in word is two.")
        3-> print("$num in word is three.")
        4-> print("$num in word is four.")
        5-> print("$num in word is five.")
        6-> print("$num in word is six.")
        7-> print("$num in word is seven.")
        8-> print("$num in word is eight.")
        9-> print("$num in word is nine.")

    }
}