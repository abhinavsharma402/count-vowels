package com.knoldus

class SumVowel {def count(s: String): Int = {
  val length = s.length()
  val substrings: Array[Int] = new Array[Int](length)

  for (position <- 0 until length) {

    if (position == 0)

      substrings(position) = length

    else

      substrings(position) = (length - position) + substrings(position - 1) - position
  }

  val sum: Array[Int] = new Array[Int](1)
  sum(0) = 0
  for (i <- 0 until length) {
    val c: Char = s.charAt(i)

    if (c == 'a' || c == 'e' || c == 'i'
      || c == 'o' || c == 'u'|| c=='A' || c=='A'  || c == 'E' || c == 'I'|| c=='O' || c=='U')

      sum(0) =sum(0)+substrings(i)
  }
  sum(0)

}
}
object SumVowel {
  def main(args: Array[String]): Unit = {


    val c=new SumVowel
    print(c.count("becab"))

  }

}
