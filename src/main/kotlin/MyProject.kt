/*fun main() {
    val scoreLevel1 = 79
    val scoreLevel2 = 92
    val scoreLevel3 = 86
    val  x = 5
    val y = 3
    val z = 8
    val cl = 'A'
    val totalScore= scoreLevel1 + scoreLevel2 + scoreLevel3
    val averageScores= totalScore / 3
    val boostMultiplier= 4
    val scoreBoost= totalScore * boostMultiplier
    val finalBoostedScore = totalScore+scoreBoost
    val name = "teslim"
    val age  = 24
    val a = 20
    val b = 10
    val s = "Hello World"
    val finishedHomework = false // or true
    val cleanedRoom = true // or false
    val canPlayGames = finishedHomework && cleanedRoom
    val percent = 47
    val correct = percent >= 0 && percent <= 100
    val carCleaned = false // or true
    val grassCut = true // or false
    val canGoToCinema = carCleaned || grassCut
    val behavedWell = false // or true
    val cleanedRooms = false // or true
    val canEatChocolate = behavedWell || cleanedRooms
    val incorrect = percent < 0 || percent > 100
    val q = "house"
    val v = "wear"
    println( 10 <= 10)
    println("A" == "AB")
    println(incorrect)
    println(canEatChocolate)
    println(canGoToCinema)
    println(correct) // true
    println(canPlayGames)
    println(s[0])
    println( "a + b = ${a + b}")
    println( "user $name, age $age")
    println(cl.code)
    println("The total Score is " + totalScore)
    println(averageScores)
    println (123 + 456 * 789)
    println (1 + 2 * 3 + 4 * 5 + 6 * 7 + 8 * 9)
    println ((1 + 2) * 3 + 4 * 5 + 6 * (7 + 8) * 9)
    println(13530.0 / 1.23)
    println(x+y*z)
}

*/

/*fun main(){
    var accountType = "free"
        //accountType = "paid"
    if (accountType != "free") {
        println("show ads")
    } else {
        println("paid account")

    }
}
*/

/*fun main(){
    val accountType = "free"
    val text: String
    //accountType = "paid"
    if (accountType == "free") {
        text = "show ads"
    } else {
        text = "paid account"
    }
    println(text)
}
*/
/*fun main() {

    val accountType = "free"
    val text = if (accountType == "free") "show ads" else "paid account"
    println(text)
}
*/

/*fun main() {
    val haveSomeExtraMoney = true
    val tip: Double =
        if (haveSomeExtraMoney) {
            println("Here you go") // Here you go
            1.0 // this value is ignored, because it is not the last one
            5.0 // this value is ignored, because it is not the last one
            10.0
        } else {
            println("Sorry, I am broke")
            0.0
        }
    println(tip) // 10.0
}
*/

/*fun main() {
    val a = 15
    val b = 30
    if (a <= b) {
        println("a < b")
    } else {
        println ("a > b")
    }
}*/

/*fun main() {
    println("Is it going to rain?")
    val probability = 70
    if (probability <= 40) {
        println("Unlikely")
    } else if (probability <= 80) {
        println("Likely")
    } else if (probability < 100) {
        println("Yes")
    } else {
        println("What?")
    }
}*/

/*fun main() {
    println("Is it going to rain?")
    val probability = 70
     when {
        probability < 40 -> {
        println("Unlikely")
         }
        probability <= 80 -> {
        println("Likely")
        }
         probability < 100 -> {
        println("Yes")
         }
        else -> {
        println("What?")
        }
        }
}*/

/*
    fun main() {
        println("Is it going to rain?")
        val probability = 70
         when {
             probability < 40 -> println("Unlikely")
             probability <= 80 -> println("Likely")
             probability < 100 -> println("Yes")
             else -> println("What?")
             }
    }*/

/*fun main() {
    println("Is it going to rain?")
    val probability = 70
    val text = when {
             probability < 40 -> "Unlikely"
             probability <= 80 -> "Likely"
             probability < 100 -> "Yes"
             else -> "What?"
            }
    println(text)
}*/

// Using When with a value
/*fun main() {
    val number = 1 // or 2, 3, 4, 5, 6
     when (number) {
         1 -> {
        println("Missed hit")
         }
         2, 3, 4, 5 -> {
        println("Hit with value $number")
         }
         6 -> {
        println("Critical hit")
         }
         }
}*/
//
/*fun main() {
    val number = 1 // or 2, 3, 4, 5, 6
    val text = when (number) {
             1 -> "Missed hit"
             2, 3, 4, 5 -> "Hit with value $number"
             6 -> "Critical hit"
             else -> "Unsupported value"
             }
    println(text)
}*/

//Using ranges in when statements

/*fun main() {
    val number = 1 // or 2, 3, 4, 5, 6
    val text = when (number) {
             1 -> "Missed hit"
             in 2..5 -> "Hit with value $number"
             6 -> "Critical hit"
             else -> "Unsupported value"
             }
    println(text)
}*/

//DataType check using "is"

/*fun main() {
    var value = "ABC"

    println(value is String)
    println(value is Int) // false
    println(value is Boolean) // false
    println(value is Any) // true

     value = 123

    println(value is String) // false
    println(value is Int) // true
    println(value is Boolean) // false
    println(value is Any) // true
}*/

//DataType check using "is" in "When" statement

/*fun main() {
    val something: Any = "ABC" // or 123, 0.1, true
     when (something) {
         is String -> println("This is String")
         is Int -> println("This is Int")
         is Double -> println("This is Double")
         is Boolean -> println("This is Boolean")
         }
    println(something)
}*/

/*fun main(){
    val weekday = "Tuesday"
    if (weekday == "Monday") {
        println("8 AM to 12 PM")
    } else if (weekday == "Tuesday") {
        println("8 AM to 6 PM")
    } else if (weekday == "Tuesday") {
        println("8 AM to 6 PM" )
    } else if (weekday == "wednesday") {
        println("8 AM to 12 PM")
    }   else if (weekday == "Thursday") {
        println("8 AM to 6 PM")
    }
    else println("On $weekday, the opening hours are:")
}*/

/*fun main() {
    val weekday = "Friday"
    val hour = 20
    when {
        weekday == "Friday" -> println("8AM to 6 PM")
        weekday == "Monday" -> println("8AM to 6 PM")
        weekday == "Tuesday" -> println("8AM to 6 PM")
        weekday == "wednesday" -> println("8AM to 6 PM")
        weekday == "Thursday" -> println("8AM to 6 PM")
    }
    val isOpen = when (weekday) {
        "Monday" -> hour >= 8 && hour <= 12
        "Tuesday", "Wednesday", "Thursday" -> hour >= 8 && hour <= 18
        "Friday" -> hour >= 8 && hour <= 21
        "Saturday" -> hour >= 9 && hour <= 16
        "Sunday" -> hour >= 8 && hour <= 16
        else -> false
    }
    if (isOpen) {
        println("Little Lemon is open now")
    } else {
        println("Little Lemon is closed now")
    }
}*/

/*fun main(){
    val a = 21
    if (a < 20)
        if(a > 10)
            print("Hi $a")
        else if(a < 10)
            print ("Bonjour $a")
        else
            print ("Welcome $a")
}*/

/*fun main() {
    var tobeprinted = true
     while (tobeprinted) {
        println("Prints forever!")
         tobeprinted = false

         }
}*/

//Here is a code that calls its body for numbers from 0 to 2.
/*fun main() {
     var printedTimes = 0
     while (printedTimes <= 2) {
        println("Line $printedTimes");
        printedTimes += 1
         // or
         // printedTimes = printedTimes + 1
         }
}*/

/*fun main() {
     var num = 0
     while (num < 100) {
        println(num)
         num += 7 // or num = num + 7
         }
}*/

/*fun main() {
     var i = 1
     while (i * i <= 100) {
        println(i * i)
        i++
         // or i += 1
         // or i = i + 1
         }
}*/

/*fun main() {
    var i = 12
    while (i < 100) {
        print("$i ")
        i = i + 13
    }
}*/

//To call code for each number from a to b, including b, use the range a..b inside a for-loop
/*fun main() {
    val a = 0
    val b = 5
    for (i in a..b) {
        println(i)
    }
}*/

//To call code for each number from a to b, excluding b, use a range a until b inside a for-loop.
/*fun main() {
    val a = 0
    val b = 5
    for (i in a until b) {
        println(i)
    }
}*/

//To call code for each number from a to b, including b, use the range a..b inside a for-loop, from high number to low number
/*fun main() {
    val a = 5
    val b = 0
    for (i in a downTo b) {
        println(i)
    }
}*/

//To call code for each number from a to b, skipping every "C" , use "step"
/*fun main() {
    val a = 0
    val b = 10
    val c = 2
    for (i in a..b step c) {
        println(i)
    }
}*/

//To call code for each number from a to b, excluding b, with a step c, use a until b step c inside a for-loop
/*fun main() {
    val a = 0
    val b = 9
    val c = 3
    for (i in a until b step c) {
        println(i)
    }
}*/
// using for loop  to generate the text for a silly song
/*fun main() {
    for (num in 5 downTo 1) {
        println("$num lemonades are left")
        println("Glupglupglup")
    }
    println("That is it")
    println("Now I have to go")
    println("Bye for now")
}*/

//using Nested-for loop to print triangle of stars
/*fun main() {
    for (i in 1..5) {
        for (j in 1..i) {
            print("*")
        }
        println()
    }
}*/

//triangle that starts with five stars and ends with one using a nested loop.
/*fun main() {
    for (i in 1..5) {
        val numberOfStars = 6 - i
        for (j in 1..numberOfStars) {
            print("*")
        }
        println()
    }
}

OR

fun main() {
    for (numberOfStars in 5 downTo 1) {
        for (i in 1..numberOfStars) {
            print("*")
        }
        println()
    }
}*/

//inverted triangle with spaces using nested for loop
/*fun main() {
    for (i in 1..5) {
        val numberOfSpaces = 5 - i
        for (j in 1..numberOfSpaces) {
            print(" ")
        }
        val numberOfStars = i
        for (j in 1..numberOfStars) {
            print("*")
        }
        println()
    }
}*/

/*fun main() {
    for (i in 1..5) {
        val numberOfSpaces = 5 - i
        for (j in 1..numberOfSpaces) {
            print(" ")
        }
        val numberOfStars = i * 2 - 1
        for (j in 1..numberOfStars) {
            print("*")
        }
        println()
    }
}*/

//calling a function within a function
/*fun getLocation() { println("Printing from getLocation() function.") }

fun main() {
    getLocation()
}*/

// Lesson on local variables: these variables can only be used at the function in which they are defined.
/*fun f1() {
    val a = "Text 1"
    println(a)
    // can use a here
    // here, I cannot use b
}

fun f2() {
    val b = "Text 2"
    println(b)
    // can use b here
    // here, I cannot use a
}

fun main() {
    f2()
    // here, I cannot neither use a or b
}*/

//Local Variable in a function
/*var name = "Jessica"

    fun setName() {
        name = "Mike"
        println("mike")
    }

    fun printName() {
        println(name)
    }

fun main() {
    setName()
    printName()
}*/

//Local functions
/*
fun b() {
     // here I cannot use function a
}

fun main() {
     // here I cannot use function a
     fun a() {
        println("A")
         }
    a() // Here I can use function a
    b()
    c()
    a() // Here I can use function a
}

fun c() {
     // here I cannot use function a
}*/

/*fun printStars(num: Int) {
    for (j in 1..num) {
        print("*")
    }
    println()
}

fun main() {
    printStars(5)
}*/

fun printStars(num: Int) {
    for (j in 1..num) {
        print("*")
    }
    println()
}

/*fun ascendingTriangle(height: Int) {
    for (i in 1..height) {
        printStars(i)
    }
}

fun main() {
    ascendingTriangle(5)
}*/
// functions with parameters
/*fun descendingTriangle(height: Int) {
    for (stars in height downTo 1) {
        printStars(stars)
    }
}
fun ascendingTriangle(height: Int) {
    for (i in 1..height) {
        printStars(i)
    }
}
fun isoscelesTriangle(width: Int) {
   descendingTriangle(width)
}


fun main() {
    println("Ascending triangle:")
    ascendingTriangle(5)
    println("Descending triangle:")
    descendingTriangle(5)
    println("Isosceles triangle:")
    isoscelesTriangle(5)
}*/
//functions with return value
/*fun triangleArea(width: Double, height: Double): Double {
    return width * height / 2
}

fun main() {
    val area: Double = triangleArea(1.0, 2.0)
    println(area) // 1.0
    println(triangleArea(2.0, 2.0)) // 2.0
    println(triangleArea(5.0, 5.0)) // 12.5
    println(triangleArea(10.0, 20.0)) // 100.0
}*/

//Function to find the bigger of two parameters using if-else statement
/*fun biggerOf(a: Int, b: Int): Int {
    if (a > b) {
        return a
    } else {
        return b
    }
}

fun main() {
    println(biggerOf(3, 1)) // 3
    println(biggerOf(10, 20)) // 20
}*/

// Anything after "return" will not be executed
/*fun triangleArea(width: Double, height: Double): Double {
    return width * height / 2
    println("Will never be called")
}

fun main() {
    println(triangleArea(10.0, 20.0)) // 100.0
}*/

//no need for else block
/*fun biggerOf(a: Int, b: Int): Int {
    if (a > b) {
        return a
    }
    return b
}

fun main() {
    println(biggerOf(3, 1)) // 3
    println(biggerOf(10, 20)) // 20
}*/

//Instead of curly braces you can use "="
/*fun triangleArea(width: Double, height: Double): Double {
    return width * height / 2
}

//OR

fun biggerOf(a: Int, b: Int): Int {
    return if (a > b) a else b
}

//OR

fun triangleArea(width: Double, height: Double): Double = width * height / 2

fun biggerOf(a: Int, b: Int): Int = if (a > b) a else b*/

//Recursion: function to determine factorial
/*fun factorial(number: Int): Int {

    var accumulator = 1

    for (i in 1..number) {

        accumulator = accumulator * i
    }

    return accumulator
}

fun main() {

    println(factorial(1)) // 1
    println(factorial(2)) // 2
    println(factorial(3)) // 6
    println(factorial(4)) // 24
    println(factorial(5)) // 120
    println(factorial(6)) // 720
}

OR

fun factorial(number: Int): Int {

    if (number <= 1) {
        return 1
    }
    return factorial(number - 1) * number
}

fun main() {
    println(factorial(1)) // 1
    println(factorial(2)) // 2
    println(factorial(3)) // 6
    println(factorial(4)) // 24
    println(factorial(5)) // 120
    println(factorial(6)) // 720
}*/

//passing default argument in a function
/*fun openBrowser(url: String, incognitoMode: Boolean = false) {

    println("Opening $url" + if (incognitoMode) " in incognito mode" else "")

    // ...

}

fun main() {

    openBrowser("website1.com") // Opening website1.com

    openBrowser("website2.com") // Opening website2.com

    openBrowser("website3.com", true) // Opening website3.com in incognito mode
}*/


//Named arguments: You do that by introducing parameter names and the equal sign in front of a parameter.
/*fun cheer(how: String = "Hello, ", who: String = "World") {

    print("$how $who")
}

fun main() {

    cheer(how = "Hi ") // Hi World

    cheer(who = "Learner") // Hello, Learner

    cheer(how = "Hi ", who = "Learner") // Hi Learner

    cheer(who = "Learner", how = "Hi ") // Hi Learner
}*/

/*fun printSurrounded(value: String = "", prefix: String = "<", postfix: String = ">") {

    println("$prefix$value$postfix")
}

fun main() {

    printSurrounded("ABC")
}*/

//Practice
/*fun printSurrounded(value: String = "", prefix: String = "<", postfix: String = ">") {
    println("$prefix$value$postfix")
}


fun main() {
    printSurrounded("ABC", ".")
    printSurrounded(postfix = ".")
}*/


//using Classes
/*class Subject(
    val name: String,
    val teacher: Teacher,
    val isObligatory: Boolean,
)

class Teacher(
    val name: String,
    val surname: String,
    val birthday: String,
    val status: String,
)

fun main() {
    // I use named arguments convention here
    val remigiuszFrost =
        Teacher(name = "Remigiusz", surname = "Frost", birthday = "23.07.1987", status = "ACTIVE")
    val biology1 = Subject(name = "Biology 1", teacher = remigiuszFrost, isObligatory = true)
    println(biology1.isObligatory) // true
    println(biology1.teacher.birthday) // 23.07.1987
    println(biology1.teacher.status) // ACTIVE
}*/


//Using Methods to call Methods of the same class
/*class Barista(
    val name: String,
    val address: Int
) {
    fun makeCofee(type: String, size: Int): Cofee {
        println("$name makes Cofee of size $size and type $type")
        return Cofee(type, size)
    }

    fun cheerAndMakeCofee(type: String, size: Int) {
        println("Hello")
        makeCofee(type, size)
    }
}

class Cofee(
   val type: String,
    val size: Int
    )

fun main() {
    val barista = Barista("Jake", 4)
   // val Cofee = barista.makeCofee("small", 2)
    barista.cheerAndMakeCofee("small", 2)
}*/


//using Abstract Classes
/*abstract class ShapeDrawer {
    fun drawSquare(){
        drawLine()
    }
    fun drawRectangle(){
        drawLine()
    }
    internal abstract fun drawLine()
}
class AndroidShapeDrawer():ShapeDrawer(){

    override fun drawLine() {
        //code that draw lines for android platform
        println("Test code -Draw line for  android platform")
    }
}
class DesktopShapeDrawer():ShapeDrawer(){
    override fun drawLine() {
        //code that draw lines for android platform
        println("Test code -Draw line for  desktop platform")
    }
}
fun main(){
    val androidDrawer:ShapeDrawer = AndroidShapeDrawer()
    androidDrawer.drawSquare()
    val desktopDrawer:ShapeDrawer = DesktopShapeDrawer()
    desktopDrawer.drawSquare()
}*/
/*
abstract class A {
    abstract fun a()
}
class B: A() {
    override fun a() {println("Hello")}
}
fun main() {
    val b = B()
    b.a()
} */


/*
fun a() {
    print("A")
}

fun b() {
    print("B")
    a()
}

fun c() {
    b()
    print("C")
    b()
}

fun main() {
    c()
}*/
/*
fun a() {
    print("A")
}

fun b() {
    print("B")
    a()
}

fun c() {
    b()
    print("C")
    b()
}

fun main() {
    c()
}*/
//All objects created with custom classes are considered unique, they are not equal to any other object.
/*class Dog(
    val name: String
)

fun main() {
    val pluto1 = Dog("Pluto")
    val pluto2 = Dog("Pluto")

    println(pluto1 == pluto2) // false
    println(pluto1 == pluto1) // true
    println(pluto1)// Dog@312b1dae
}*/

//OR

//Data modifier before a class can be used to  get more meaningful data from printing a string
/*data class Dog(
    val name: String
)

fun main() {
    val pluto1 = Dog("Pluto")
    val pluto2 = Dog("Pluto")
    val rex = Dog("rex")

    println(pluto1 == pluto2) // true
    println(pluto1 == pluto1) // true
    println(pluto1)// Dog(name=Pluto)
    println(rex) // Dog(name=rex)
    println("Dog: $pluto1") // Dog: Dog(name=Pluto)
}*/

// using data classes
/*data class Dog(
     val name: String,
    val age: Int
)

fun main() {
    val dog = Dog("Pluto", 7)
    val (age, name) = dog
    println(age) // Pluto
    println(name) // 7
}*/

// using copy method to specify modifications to be made to an object in a class
/*data class Dog(
    val name: String,
    val age: Int
)

fun main() {
    val dog = Dog("Pluto", 7)
    val (age, name) = dog
    println(age) // Pluto
    println(name) // 7
    println(dog.copy()) // Dog(name=Pluto, age=7)
    println(dog.copy(age = 8)) // Dog(name=Pluto, age=8)
    println(dog.copy(name = "Neptune")) // Dog(name=Neptune, age=7)
}*/

//using pair class
/*fun main() {
    val pair = Pair(1.0, 'A')
    println(pair.first) // 1.0
    println(pair.second) // A
    val (number, letter) = pair
     // the type of number is Double
     // the type of letter is Char
    println(number) // 1.0
    println(letter) // A
}*/

//Or

/*fun main() {
    val pair = 1.0 to 'A'
    println(pair.first) // 1.0
    println(pair.second) // A
    val (number, letter) = pair
     // the type of number is Double
     // the type of letter is Char
    println(number) // 1.0
    println(letter) // A
}*/


//using "triple" class
/*fun main() {
    val pair = Triple(1F, "ABC", true)
    println(pair.first) // 1.0
    println(pair.second) // ABC
    println(pair.third) // true
    val (number, letters, boolean) = pair
     // the type of number is Double
     // the type of letters is Char
     // the type of boolean is Boolean
    println(number) // 1.0
    println(letters) // ABC
    println(boolean) // true
}
*/

/*data class Value(val value: Int)

fun main() {
    val (value) = Value(42)
    println(value)
}*/

// using copy method to specify modifications to be made to an object in a class
/*data class FullName(
    val name: String,
    val surname: String
)

fun main() {
    val name = FullName("Marie", "Sklodowska")
    val newName = name.copy(surname = "Sklodowska-Curie")
    println(newName)
}*/

// using enum classes
/*
enum class Letter {
    A,
    B,
    C,
}

fun main() {
    println(Letter.C)
}*/

//using enum classes
/*enum class Letter {
    A,
    B,
    C,
}

fun main() {
    for (l in Letter.values()) {
        print(l)
    }
}*/

//using enum classes
/*enum class Letter(val smallLetter: Char) {
    A('a'),
    B('b'),
    C('c'),
}

fun main() {
    println(Letter.A.smallLetter)
}*/


//Exception classes: using try-catch block to catch errors
/*class MyError: Throwable("Some message")

fun someFunction() {
     throw MyError()
    println("Will not be printed")
}

fun main() {
     try {
        someFunction()
        println("Will not be printed")
         } catch (e: Throwable) {
        println("Caught $e") // Caught MyError: Some message
         }
}*/

//Using "Finally" block: It is used to specify a block of code that should always be invoked, even if an exception occurs.
fun someFunction() {
     throw Throwable("Some error")
    println("Will not be printed")
}

fun main() {
     try {
        someFunction()
        println("Will not be printed")
         } finally {
        println("Finally block was called") // Finally block was called
         }
    println("Will not be printed")
}