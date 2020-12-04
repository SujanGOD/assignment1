package assignment1

fun main(){
    print("enter your monthly salary:")
    val salary= readLine()!!.toInt()

    val yearsalary=salary*12
    println("Your yearly salary is $yearsalary.")
    var i=yearsalary
    var tax=0
    var remains=0
    for (i in 1 until 200000) {
        tax=(1*i)/100

    }
    for (i in 200000 until 350000){
        remains=i-200000
        tax=(1*200000)/100+(15*remains)/100

    }
    if (i>350000){
    remains=i-200000-150000
    tax=(1*20000)/100+(15*150000)/100+(25*remains)/100

}
    println("The tax per your yearly salary is $tax.")
}