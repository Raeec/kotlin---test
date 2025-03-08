fun main() {
    val answer = readLine()
    val answer2 = answer.toString().split(" ")
    var result = 0
    for (i in 0..answer2.size - 1 step 2){
        when(answer2[i]){
            "+" -> result += (answer2[i - 1].toInt() + answer2[i + 1].toInt())
            "-" -> result += (answer2[i - 1].toInt() - answer2[i + 1].toInt())
        }
    }
    println(result)
}
