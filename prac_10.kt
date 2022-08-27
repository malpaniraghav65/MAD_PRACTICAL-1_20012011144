package ru.kotlin.myapplication

fun main() {
    val car1 = Car("Ferari, 2018", "Raghav", 140, 1900000.0, 989050.0)
    car1.getCarFullDetails()
    val car2 = Car("AUDI, 2019", "Anish", 130, 400000.0, 399800.0)
    car2.getCarFullDetails()
    val Cars = ArrayList<Car> (2)
    val car3 = Car("Audi, 2017","Parth",50,1980000.0,1078000.0)
    val car4 = Car("aruti, 2020","Vikas",20,49000000.0,39989000.0)
    Cars.add(car3)
    Cars.add(car4)
    for (i in Cars){
        println("-------------------")
        i.getCarFullDetails()
    } }
class Car(private val model: String, private val owner: String, private val miles: Int, private val original: Double, private val current: Double) {
    init {
        println("Object of class is Created and Init is Called.")
    }
    private fun info(): String {         return model
    }
    private fun carowner(): String {
        return owner
    }
    private fun milesDrive(): Int {
        return miles
    }
    private fun orgprice(): Double {return original
    }
    private fun currprice(): Double {
        return current
    }
    fun getCarFullDetails() {         println("----------")
        println("Car Information : ${info()}")
        println("Car owner : ${carowner()}")
        println("Miles Drive : ${milesDrive()}")
        println("Original Car Price : ${orgprice()}")
        println("Current Car Price : ${currprice()}")
        println("----------\n")}}
