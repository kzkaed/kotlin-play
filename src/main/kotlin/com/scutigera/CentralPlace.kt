package com.scutigera


//store state at global level singleton
object CentralPlace {
    var minAccuracy = 0.0
    var targetAccuracy = 0.0

    //helper functions
    fun meetsTarget(accuracy: Double) = accuracy >= targetAccuracy
    fun meetsMin(accuracy: Double) = accuracy >= minAccuracy

}