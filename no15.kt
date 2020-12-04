package assignment1

fun main(){
    print("Enter size of the array:")
    val num= readLine()!!.toInt()
    val arr=IntArray(num)

    for(i in arr.indices){
        print("Enter ${i+1} element:")
        arr[i]= readLine()!!.toInt()
    }
    println("The odd numbers of the array:")
    for(i in arr.indices){
        if(arr[i]%2!=0){
            println(arr[i])
        }

    }}