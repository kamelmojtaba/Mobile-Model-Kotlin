fun main(args: Array<String>) {
//    println("Hello World!")
//    val a=100
//    val b=200
////    println(b-a)
////    println(a+b)
////    println(a%b)
//
//    if(a > b){
//        println("a is grater than b")
//    }else{
//        println("b")
//    }
//    print("Enter Your Name: ")
//    var name = readln()
//    print("Enter Your Age: ")
////    var age:Int = Integer.valueOf(readln())
//    var age:Int = readln().toInt()
//    println("Your Name is " + name)
//    println("Your age is " + age)
//    when(age){
//        1 -> println("One")
//        10,20,30 -> println("20")
//        in 10 .. 20 -> println("TeenAger")
//        else -> println("Not found")
//    }

    // day 2
//    val marks = arrayOf(10,20,30,40,50)
//
//    for (mark in marks){
//        println(mark)
//    }
//    for(i in 1 .. 5)
//    {
//        println(i)
//    }
//    for(i in 5 downTo 1 step 2){
//        println(i)
//    }
//    var l = 1;
//    while (l<=5){
//        println(l)
//        l++
//    }
   var x = sumTow(5,6)
    println(x)

    try {
        val data = 20/0
    }catch (e : java.lang.ArithmeticException){
        println(e)
    }
    var name:String? = "KAmel"
    if (name != null) // samrt cast / safe cast
        println(name.length)
}

fun sumTow(num1:Int, num2:Int) :Int {
    println("Sum Fun")
    println(num1 + num2)
    return  num1 + num2
}