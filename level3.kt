fun main() {
  fun level1_1(a: Int): Boolean = (a < 0)

  fun level1_2(str: String): Int = str.length

  fun level1_3(str: String): Char = str.last()
    
  
  print("level1_1: ")
    println(level1_1(-5))

  print("level1_2: ")
    println(level1_2("fsdfsfsdfs"))

  print("level1_3: ")
    println(level1_3("jk,ij,h,u"))
}
