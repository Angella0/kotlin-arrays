import java.util.*

fun main (args: Array<String>){
name("liam","grek","angela","peter")
    cities()
    number()
    val countArray=arrayOf("Uganda","Kenya","Rwanda")
    println(Arrays.toString(countArray))
}

fun name(str1:String,str2:String,str3:String,str4:String){
    val nameArray=arrayOf(str1,str2,str3,str4)
    println(Arrays.toString(nameArray))
}

fun cities(){
    val cities=arrayOf("harare","mumbai","dodoma","jarkata")
    println(cities[0].capitalize()+" "+cities[1].capitalize()+" "+cities[2].capitalize()+" "+cities[3])

}

fun number(){
    val numbers=arrayOf(32,17,4,213,78,43,90,31,3,73,11,158,62)
    val sum=(numbers[1]+numbers[4])
    println(sum)
    val index=numbers.indexOf(158)
    println(index)
    val sortednumbers=numbers.sortedArray()
    println(Arrays.toString(sortednumbers))


}
fun countries(num1:String,num2:String,num3:String):Array<String>{
    val countArray=arrayOf(num1,num2,num3)
    return countArray

}