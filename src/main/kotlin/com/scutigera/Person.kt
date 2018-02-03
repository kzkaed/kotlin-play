package com.scutigera


data class Person(val id: Int,
                  val firstName: String,
                  val lastName: String)

{

    //is not in every instance if companion only one per class
    companion object PersonDirectory {

        val allPeople = listOf(
                Person(1, "Susan", "Smith"),
                Person(2, "Victor", "Lang")
        )//this could be a data source call

        fun forId(id: Int) = allPeople.find{ it.id == id} //takes lambda

    }





}