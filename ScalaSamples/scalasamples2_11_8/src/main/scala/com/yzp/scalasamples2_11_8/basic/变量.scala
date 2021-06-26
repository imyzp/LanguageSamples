package com.yzp.scalasamples2_11_8.basic

object 变量 {
  def main(args: Array[String]): Unit = {
    // 不可变的变量
    val d = 0
    // 可变的变量
    var s = 1
    s = 2
    // 懒加载变量，当使用时才会加载
    lazy val ll = 9

    println(ll)
  }

}
