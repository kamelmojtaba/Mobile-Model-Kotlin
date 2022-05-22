fun main(args: Array<String>) {
    var p : String
    val iPhone = Mobile("Apple", "iPhone 11 Pro", "Iso", 99.99f)
    println(iPhone)
    p = iPhone.printDetails()
    println(p)
    val samsung = Mobile("Samsung", "Galaxy S 20", "Android", 999.99f)
    println(samsung)
    p = samsung.printDetails()
    println(p)
    val onePlus = Mobile("One Plus", "One Plus 7", "Android", 680.99f)
    println(onePlus)
    p = onePlus.printDetails()
    println(p)
}