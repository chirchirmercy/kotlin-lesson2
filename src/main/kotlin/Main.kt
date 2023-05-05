fun main(){
    details("mercy",47,"kenya")
name()
    println(word("mercy"))
}

// Write a function that takes in 3 parameters, name, age, and country,
// and returns a String with this structure “Hi, my name is x,
// I am y years old and I am from z.” Where x, y, and z are the provided name,
// age, and country respectively. (3 points)
fun details(name:String,age:Int,country:String){

    println("Hi my name is $name i am $age and i was born in $country")

}
//// Write a function that takes in a String and returns its length (2 points)
fun word(name: String):Int{
    return name.length

}
//
// Write a function that takes in a name and prints out “That’s me!” when your
// name is passed to it, otherwise, it prints out “I don’t know who that is” (3 points)
fun name(){
    val name="mercy"
    if(name==="mercy"){
        println("that's me")
    }else{
        println("i don't know who that is")
    }
}
//Write a Kotlin function that takes in a string with all the
// vowels replaces by the character ‘*’. Use string interpolation to generate the output. (2 points)

//fun replace(vowels:String){
// val vowels="a,e,i,o,u"
//    var name="mercy"
//    if()
//
//}



