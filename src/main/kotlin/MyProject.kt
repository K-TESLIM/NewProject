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

