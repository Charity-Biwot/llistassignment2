fun main(){
createLists(listOf("dd","joy"))
    getHeight(listOf(4,7,9))
    var x= Person("Joy",22,32,52,)
    var y= Person("Jane",25,40,65)
    var z=Person("Japh",34,39,63)
    var ty= listOf(x,y,z)
    var h =ty.sortedByDescending {p->p.age

    }

    println(h)
//    ages.get(33)
//    println(ages)
    ages(ty)
}

//Given a listall the vehicles in the list. of 10 strings, write a function that returns a list of the strings
//at even indices i.e index 2,4,6 etc(2 points)

fun createLists(words:List<String>):List<String>{
    var newLists= mutableListOf<String>()
    words.forEachIndexed { index, s ->
        if (index%2==0){
            newLists.add(s)
        }
    }
    println(newLists)
    return newLists

}
//Given a list of people’s heights in metres. Write a function that returns
//the average height and the total height(2 points)
fun getHeight(height:List<Int>):String {
    var y = height.sum()
    var av = height.average()
    var total = ("sum is $y and avarage is $av")
    println(total)

    return total

}
//Given a list of Person objects, each with the attributes, name, age,
//height and weight. Sort the list in order of descending age   (2 points)
data class Person(var name:String,var age:Int,var height:Int,var weight:Int){

}

//Given a list similar to the one above, write a function in which you will
//create 2 more people objects and add them to the list at one go.
data class People(var name:String,var age: Int,var weight: Int)

fun ages(name:List<Person>){
   // var n= mutableListOf<String>()
    var k= Person("John",45,16,48)
    var r=Person("Henry",23,37,66)
    var n = mutableListOf(k,r)
    n.plus(name)
    println(n)


}


