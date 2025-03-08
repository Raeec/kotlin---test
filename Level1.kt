



fun main() {
    fun level1_1(a: Int): Boolean = (a < 0)

    fun level1_2(str: String): Int = str.length

    fun level1_3(str: String): Char = str.last()
    //fun level1_3(str: String) { println(str[str.length - 1]) }

    fun level1_4(a: Int): Boolean = (a % 2 == 0)

    fun level1_5(str1:String, str2:String): Boolean = (str1.first() == str2.first())

    fun level1_6(str1:String):Char {
        if (str1.last() == 'ь') { return (str1[str1.length - 2]) } else { return (str1.last()) } }

    fun level1_7(num: Int): Int = num.toString().first().digitToInt()

    fun level1_8(num: Int): Int = num.toString().last().digitToInt()

    fun level1_9(num: Int): Int = num.toString().first().digitToInt() + num.toString().last().digitToInt()

    fun level1_10(num: Int): Int = num.toString().length

    fun level1_11(num1: Int, num2: Int): Boolean = (num1.toString().first() == num2.toString().first())

    fun level1_12() { for (i in 1..100) { print( "$i; ") } }

    fun level1_13(str: String): Char {
        if (str.length > 1) {return(str[str.length - 2])} else {return (str.last())} }

    fun level1_14(num1: Int, num2: Int): Int = num1 % num2

    fun level1_15(mouth: Int): String {
        when(mouth) {
            1, 2, 12 -> return "zima"
            3, 4, 5 -> return "vesna"
            6, 7, 8 -> return "leto"
            9, 10, 11 -> return "osen"
            else ->
                return "eror"
        }
    }

    fun level1_16() { for (i in 2..100 step 2) { print( "$i; ") } }

    fun level1_17(str: String) { for(i in str){ print( "$i; ") } }

    fun level1_18(minute: Int): String {
        when{
            0 <= minute && minute <= 15 -> return "first"
            16 <= minute && minute <= 30 -> return "second"
            31 <= minute && minute <= 45 -> return "three"
            46 <= minute && minute <= 60 -> return "four"
            else -> return "error"
        }
    }

    fun level1_19() { for (i in 3..100 step 3) { print( "$i; ") } }

    fun level1_20(num1: Int,num2: Int): Boolean = (num1 % num2 == 0)

    fun level1_21(ch1: Char, ch2: Char, ch3: Char): String = "" + ch1 + ch2 + ch3

    fun level1_22(kb: Int): Int = kb * 8

    fun level1_23(){ println((1..100).sum()) }

    fun level1_24(ch1: Char, ch2: Char, ch3: Char): Int = ch1.digitToInt() + ch2.digitToInt() + ch3.digitToInt()

    fun level1_25(mb: Int): Int = mb * 1024 * 8

    fun level1_26() { print((1..100 step 2).sum())}

    fun level1_27(N: Int) {for(i in 1..N){ print(" " + Math.pow(2.0, i.toDouble()))}}

    fun level1_28(str1: String, str2: String, str3: String): Int = str1.toInt() + str2.toInt() + str3.toInt()

    fun level1_29(num: Int): Int = num.toString().reversed().toInt()

    fun level1_30(num: Int): Int {
        var sum = 0
        for (i in 1..num.toString().length - 1) {
            sum += num.toString()[i].digitToInt()
        }
        return sum
    }

    fun level1_31(gb: Double): String {
        print("mb: " + gb * 1024)
        print("; kb: " + gb * 1024 * 1024)
        return ("; b: " + gb * 1024 * 1024 * 8)
    }

    fun level1_32() { for (i in 100 downTo 1) {
        print("$i; ") }}

    fun level1_33(str: String) {for (i in str.length - 1 downTo 0){print(str[i] + "; ")}}

    fun level1_34(b: Long): String = (b / 8).toString()+ "kb " + (b / 8 / 1024).toString() + "mb " + (b / 8 / 1024 / 1024).toString() + "gb"

    fun level1_35(str1: String, str2: String): Boolean = (str1.last() == str2.lowercase().first())

    fun level1_36(): Int = (24 * 60 * 60)

    fun level1_37() { for (i in -100..0) { print("$i; ") }}

    fun level1_38(ch1: Char, ch2: Char, ch3: Char): Int = ("" + ch1 + ch2 + ch3).toInt()

    fun level1_39(): Int = (2..100 step 2).sum()

    fun level1_40(): Int = 60 * 60 * 24 * 365

    fun level1_41(num: Int) {
        for (i in 0..num){
            if (i % 2 == 0) {
                print("$i; ") }
        }
    }

    fun level1_42(num: Int): Int {
        var i = 0
        var a = num
        while (a > 10) {
            a /= 2
            i++
        }
        return i
    }


    print("level1_1: ")
    println(level1_1(-5))

    print("level1_2: ")
    println(level1_2("fsdfsfsdfs"))

    print("level1_3: ")
    println(level1_3("jk,ij,h,u"))

    print("level1_4: ")
    println(level1_4(536356))

    print("level1_5: ")
    println(level1_5("amhj,u,hk", "amigmjmi"))

    print("level1_6: ")
    println(level1_6("Тракторист"))

    print("level1_7: ")
    println(level1_7(36434))

    print("level1_8: ")
    println(level1_8(36434))

    print("level1_9: ")
    println(level1_9(36434))

    print("level1_10: ")
    println(level1_10(36434))

    print("level1_11: ")
    println(level1_11(10790, 1543))

    print("level1_12: ")
    level1_12()

    print("\nlevel1_13: ")
    println(level1_13("ghfsd"))

    print("level1_14: ")
    println(level1_14(10, 3))

    print("level1_15: ")
    println(level1_15(8))

    print("level1_16: ")
    level1_16()

    print("\nlevel1_17: ")
    level1_17("abcde")

    print("\nlevel1_18: ")
    println(level1_18(34))

    print("level1_19: ")
    level1_19()

    print("\nlevel1_20: ")
    print(level1_20(10,2))

    print("\nlevel1_21: ")
    println(level1_21('a','b','c'))

    print("level1_22: ")
    println(level1_22(35))

    print("level1_23: ")
    level1_23()

    print("level1_24: ")
    println(level1_24('1','2','3'))

    print("level1_25: ")
    println(level1_25(35))

    print("level1_26: ")
    level1_26()

    print("\nlevel1_27:")
    level1_27(5)

    print("\nlevel1_28: ")
    println(level1_28("633","52","69"))

    print("level1_29: ")
    println(level1_29(12345))

    print("level1_30: ")
    println(level1_30(12345))

    print("level1_31: ")
    println(level1_31(34.24))

    print("level1_32: ")
    level1_32()

    print("level1_33: ")
    println(level1_33("abcde"))

    print("level1_34: ")
    println(level1_34(3535645778))

    print("level1_35: ")
    println(level1_35("Насос", "Стакан"))

    print("level1_36: ")
    println(level1_36())

    print("level1_37: ")
    level1_37()

    print("\nlevel1_38: ")
    println(level1_38('1','2','3'))

    print("level1_39: ")
    println(level1_39())

    print("level1_40: ")
    println(level1_40())

    print("level1_41: ")
    println(level1_41(12))

    print("level1_42: ")
    println(level1_42(12345))
}