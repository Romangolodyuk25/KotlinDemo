package Учебник

abstract class Animal {
    abstract val image:String
    abstract val food:String
    abstract val habitat:String
    var hunger = 10

    abstract fun makeNoise()

    abstract fun eat()

    open fun roam() {
        println("The animal is roaming")
    }

    fun sleep() {
        println("The Animal is sleeping")
    }

    class Hippo : Animal() {
        override val image = "Hippo.jpg"
        override val food = "grass"
        override val habitat = "Water"

        override fun makeNoise() {
            println("Grunt! Grunt!")
        }

        override fun eat() {
            println("The Hippo is eating $food")
        }
    }

    abstract class Canine : Animal() {
        override fun roam() {
            println("The Canine is roaming")
        }
    }

    class Wolf : Canine() {
        override val image = "wolf.jpg"
        override val food = "meet"
        override val habitat = "forests"

        override fun makeNoise() {
            println("Hoooooowl!")
        }

        override fun eat() {
            println("The wolf is eating $food")
        }
    }
    class Vet () {
        fun giveShot(animal: Animal) {
            //code to do something medical
            animal.makeNoise()
        }
    }
}
fun main (args:Array<String>) {
    val animals = arrayOf(Animal.Hippo(), Animal.Wolf())
    for (item in animals) {
        item.roam()
        item.eat()
    }
    val vet = Animal.Vet()
    val Wolf = Animal.Wolf()
    val hippo = Animal.Hippo()
    vet.giveShot(Wolf)
    vet.giveShot(hippo)
}