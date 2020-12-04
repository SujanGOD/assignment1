package assignment1

fun main(){
    println("DICTIONARY")
    val words=arrayOf("Apple","Cat","Bike")
    val meanings= arrayOf("a kind of fruit"," small carnivore animal with small fur","pedal-powered two-wheeled vehicle")
    val wordmeanings= mapOf("Apple" to "a kind of fruit",
                            "Cat" to "small carnivore animal with small fur",
                            "Bike" to "pedal-powered two-wheeled vehicle")
    println("Enter a word to search its meaning:[Hints:Apple,Cat,Bike]")
    print("ENTER=")
    var name= readLine()!!
    print("$name -> ${wordmeanings[name]}")
}