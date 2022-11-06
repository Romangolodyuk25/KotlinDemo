package ЛетКод

fun main(args: Array<String>) {
    var items = listOf(
        listOf("phone", "blue", "pixel"), listOf("computer", "silver", "lenovo"), listOf("phone", "gold", "iphone")
    )
    //var items = mapOf<String,String>("type" to "phone", "color" to "blue","name" to "pixel");mapOf<String,String>("type" to "computer", "color" to "silver","name" to "lenovo");mapOf<String,String>("type" to "phone", "color" to "gold","name" to "iphone")
    var ruleKey = "type"
    var ruleValue = "phone"

    var result = countMatches(items, ruleKey, ruleValue)
    println(result)
}

fun countMatches(items: List<List<String>>, ruleKey: String, ruleValue: String): Int {
    var result = 0
    for (i in items) {
            if (ruleKey == "type") {
                if (i[0] == ruleValue) {
                    result++
                }
            }
            else if (ruleKey == "color") {
                if (i[1] == ruleValue) {
                    result++
                }
            }
            else if (ruleKey == "name") {
                if (i[2] == ruleValue) {
                    result++
                }
            } else {
                break
            }
    }
    return result
}