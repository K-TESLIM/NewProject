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

