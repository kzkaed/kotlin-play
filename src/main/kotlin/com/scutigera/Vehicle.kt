package com.scutigera

data class Vehicle(val make: String,
                   val model: String,
                   val year: String,
                   val highwayMpg: Int? = null,
                   val kilowattHours: Int? = null) {

    init {
        if(highwayMpg == null && kilowattHours == null)
            throw Exception ("Must be assigned")
        if(highwayMpg != null && kilowattHours != null)
            throw Exception ("Must be assigned")

    }

    val isElectric = kilowattHours != null
    val isGas = highwayMpg != null
}
