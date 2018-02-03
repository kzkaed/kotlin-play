package com.scutigera

import java.math.BigDecimal



fun main (args: Array<String>) {
   val x = 10 //static typed even if it look dynamic val is immutable
    val y = 20

    val thisNum = 10
    val thatNum = 20
    val conciseConditional = if (thisNum < thatNum) "This is less" else "That is less"

    println (conciseConditional)
    //use BigDecimal for precision
   val z: BigDecimal = BigDecimal(10)
    val balance = BigDecimal.valueOf(1808.2)
    println ("Balance: $balance") //string interpolation

    println (square(z))
    println (printRandom())
    println (generateRandomInt(100))

    val crafter1 = Crafter("Sarah","Smith",Role.LEAD)
    println ("Crafter: ${crafter1.firstName} ${crafter1.lastName} is a ${crafter1.role}")
    println (crafter1)

 CentralPlace.minAccuracy = .20
 CentralPlace.targetAccuracy = .80

 val correctPredictions = 205
 val totalPredictions = 500

 val accuracy = correctPredictions.toDouble() / totalPredictions.toDouble()

 println(CentralPlace.meetsTarget(accuracy))

 val getPerson = Person.PersonDirectory.forId(1)

 println(getPerson)

 val getOtherPerson = Person.forId(2)

 println(getOtherPerson)



}

data class Crafter(val firstName: String, val lastName: String, val role: Role)

enum class Role {
    LEAD,CONSULTING,ARCHITECT,REG,DIRECTOR
}





