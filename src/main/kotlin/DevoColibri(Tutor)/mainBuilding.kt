fun main(args: Array<String>) {
    var house = Buildind()

    house.floors
    println(house.floors)
    println()

    var house1 = Buildind()

    house1.length = 10
    house1.floors = 12
    println(house1.length)
    println(house1.floors)
    house1.destroy()
}
