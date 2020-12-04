package assignment1

fun main(){
    print("Enter asterisk:")
    val chr= readLine()!![0]
  displaychar(chr)
}

fun displaychar(chr:Char){
    for(i in 1..5) {
    for (j in 1..i) {
        print("$chr")
    }
        println()
    }
}