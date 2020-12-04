package assignment1

fun main(){
    print("enter size of an array:")
    val num= readLine()!!.toInt()
    val arr=IntArray(num)
    for (i in arr.indices){
        print("enter ${i+1} element:")
        arr[i]= readLine()!!.toInt()
    }
    println("The even numbers of the array:")
    for(i in arr.indices){
        if(arr[i]%2==0){
            println(arr[i])
        }
    }
}