package assignment1

fun main(){
    print("Enter your age:")
    val age= readLine()!!.toInt()

    findrealage(age)
}

fun findrealage(age:Int) {
    when (age) {
        in 0..17 ->
            print("child")

        in 18..35 ->
            print("young")

        in 36..120 ->
            print("old")

        else->
            print("invalid input")
    }
}