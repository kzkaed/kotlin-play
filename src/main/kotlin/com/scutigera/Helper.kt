package com.scutigera

import java.math.BigDecimal
import java.util.concurrent.ThreadLocalRandom





    fun sum (x: Int, y: Int): Int{
        return x + y
    }

    fun square(z: BigDecimal): BigDecimal {
        return z * z
    }
    //is the same as

    fun square2(z: BigDecimal): BigDecimal = z * z
    fun printRandom(): Int = ThreadLocalRandom.current().nextInt()

    //Explicit parameter by name with default values
    fun generateRandomInt(max: Int, min: Int = 0) = ThreadLocalRandom.current().nextInt(min,max +1)

    //nullable type a string can not be null unless ?
    // a nullable type
    //safe call operator
    fun nullableValue() {
        val myValue: String? = null
        val length = myValue?.length
    //Elvis operator
        val length2 = myValue?:0 //defines a default value
        //force not null

        val length3 = myValue?: throw Exception("This should not be null") //defines a default value withException

    }





