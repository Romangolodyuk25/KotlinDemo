fun main(args:Array<String>) {

    var isDownload = true // так как значется False значит цикл будет повторяться до тех пор пока усл не станет True

      //  while ((!)isDownload == false) { // Файл загружен? false - цикл продолжается пока не бует файл загружен
       //     println("File is Downloading")
      //  }
  //  do {          В ЦИКЛЕ DO Сначала проверяется тело, а потом выпл=олняется условие
  //      println("File is DownLoading") в
  //  } while (isDownload == fals(true))

  //Цикл for  выполняется , когда уже заранее известно сколько раз нужно выполнить цикл 10, 20 , 30 ,40...
//1. i = 1
//2. i++ = 2
//i. =3
    for (i in 1..10) { //в цикле for создается переменна СЧЕТЧИК т.е какой раз выполняется цикл
   //можно изменить шаг написав for (i in 1..100 step 2)
   // если нужно идти в обратную сторону тогда for (i in 100 downTo 1)
        println("$i - File is Downloading")
}
    println("Finished")
}


