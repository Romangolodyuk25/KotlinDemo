package ЛетКод

fun main(args: Array<String>) {
    val n = 8
    var match = 0
    var teams = n
    var res = 0
    var finalres= 0
    while (teams>1){
        if(teams%2==0) {
            teams = teams/2
            match+=teams
        }
        else if (teams%2!=0) {
           teams = (teams-1)/2
            match +=teams +1
        }
    }
    println(res)
}