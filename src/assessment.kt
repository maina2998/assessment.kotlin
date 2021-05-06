fun main() {

    robot(5)
    robot(10)
    robot(15)
var d =student(arrayOf("Grace","Stella","Mary","Iman","Eva"))
    println(d)

    println(operation(78))
        println(divide(56))
    println(modulus(45))

    var person =Human("Grace",23,45.9)


}


fun robot(age:Int) {
    if (age < 6) {
        println("milk")

    } else if (age < 15 && age > 6) {
        println("fanta")

    } else {
        println("cocacola")
    }
}
fun student(names:Array<String>):Int {
    var b = 0
    for (students in names)
        if (students.length<=4) {
            b+=1
        }
    return b
}
fun operation(num:Int):Boolean{
    if(num*2==0){
     return true
   } else {
       return false
   } }
fun divide(num1:Int):Boolean{
    if (num1/2==0){
        return true
    }
    else{
        return false
    }
}
fun modulus(num2:Int):Boolean{
    if(num2%2==0){
        return true
    }
    else{
        return false
    }
}
data class Human(var name: String,var age: Int,var weight:Double){
    fun age(){
   age+=1
        println(age)
    }
    fun speak(speech:String):String{
        var word = speak(speech)
        return  word
    }

}



