import java.awt.Choice

fun main(args:Array<String>) {
    val options = arrayOf("Rock", "Paper", "Scissors")
    val gameChoice = getGameChoice(options)
    val userChoice= getUserChoice(options)
    //printResult(userChoice, gameChoice)
    }
    fun getGameChoice(optionsParam:Array<String>) =
        optionsParam[(Math.random() * optionsParam.size).toInt()]

    fun getUserChoice(optionsParam: Array<String>):String {
        var isValidChoice = false//будет показывать ввел ли юзер допустимое значение
        var userChoice = ""
        while (!isValidChoice)//выполнятьцико до тех пор пока isValidChoice не будет ==TRUE
        {
            println("Пожалуйста выберите выриант")
            for (item in optionsParam) println("$item")
            println(".")
            val userInput = readLine()
            if (userInput != null && userInput in optionsParam) {
                isValidChoice = true//если ввод пользователя прошел проверку, цикл прерывается
                userChoice = userInput
            }
            fun printResult (userChoice:String,gameChoice: String) {
                val result: String
              //  if (userChoice == gameChoice) result = "Tie!" {
            //    } else if { ((userChoice == "Rock" && gameChoice == "Scissors")) || (userChoice == "Paper" && gameChoice == "Rock") || (userChoice == "Scissors" && gameChoice == "Paper")) result = "You Win"
              //  } else {
                result = "You lose!"

            }
        }
        return (userChoice)
    }
