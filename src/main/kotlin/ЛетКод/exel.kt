fun main(args: Array<String>) {
    var s = "K1:L2"
    var alphavit = listOf<Char>('A', 'B', 'C','D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z')
    var mutable = mutableListOf<Char>()
    var firstindex = 0
    var secondindex = 0
    for (index in 0..alphavit.size-1) {
        if (s[0] == alphavit[index]) {
            firstindex = index
        }
    }
    for(index in 0..alphavit.size-1) {
        if(s[3]==alphavit[index]) {
            secondindex = index
        }
    }

    for (index in firstindex..secondindex ) {
        mutable.add(alphavit[index])
    }
    var mutablenumber = mutableListOf<Int>()
    for (index in s[1].toString().toInt() ..s[4].toString().toInt()) {
        mutablenumber.add(index)
    }
    var result = mutableListOf<String>()
    for (index in 0..mutable.size-1) {
        for (index1 in 0..mutablenumber.size-1) {
        result.add(mutable[index].toString()+mutablenumber[index1])
        }
    }
    println(result)
}