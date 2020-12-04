package assignment1

fun main(){
    print("Enter size of the array:")
    val num= readLine()!!.toInt()
    val arr=IntArray(num)

    for (i in arr.indices){
        print("Enter ${i+1} element:")
        arr[i]= readLine()!!.toInt()
    }
    var total=0
    for (i in arr.indices){

        if (arr[i]%2==0){
            total=total+arr[i]
        }
    }
    println("The sum of even numbers in the arrays is $total.")

}