package assignment1

fun main(){
    print("Enter size of the array:")
    val num= readLine()!!.toInt()
    val arr=IntArray(num)

    for (i in arr.indices){
        print("Enter ${i+1} element:")
        arr[i]= readLine()!!.toInt()
    }
    var great=arr[0]
    var small=arr[0]
    for (i in arr.indices){
        if(arr[i]>great){
            great=arr[i]
        }
        if (arr[i]<small){
            small=arr[i]

        }    }
    println("The greatest number in the array: $great")
    println("The smallest number in the array: $small")

}