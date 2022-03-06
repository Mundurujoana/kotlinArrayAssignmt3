fun main() {

//question1
    noOfStr()

//question2
    namesofcities(arrayOf("harare", "mumbai", "dodoma","akarta"))

    //question3
    findIndex()

//question4
    identities(arrayOf("James", "Mary", "Carol"))

}

//question1
fun noOfStr(){
    var str = arrayOf("mango", "car", "home", "boy")
    println(str.contentToString())
}

//question2
fun namesofcities(cities:Array<String>){
cities.forEach { capitalcity ->
    println(capitalcity.capitalize())
}
}

//question3
fun findIndex() {
    var numbers = arrayOf(32, 17,4,213,78,43,90,31,3,73,11,158,62)
    var numb = arrayOf(numbers[1], numbers[4])
    println(numb.sum())
    println(numbers.indexOf(158))
    println(numbers.sortedArray().contentToString())

}

//question4
fun identities(names:Array<String>){
println(names.contentToString())
}

