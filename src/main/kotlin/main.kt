fun main(){
    var text= "CodeHive"
    var newText= text[4].toString() +text[5] +text[6] +text[7]
    println(newText)
    reminder( 12, 7)
    hello( "carol", 8)
    me("carol")

}
fun reminder(x:Int, y:Int) {
    var a= x%y
    println(a)

}

fun hello(name:String, age:Int) {
    var statement= "hi, my name is $name, and i am $age old"
    println(statement)
}
fun me(name:String) {
    println(name.length)
}