package com.yzp.scalasamples2_11_8.exception

import java.io.IOException

object ExceptionTest {
  def main(args: Array[String]): Unit = {
    try {
      throw new IOException("throw a user define exception!!!")
    } catch {
      case e1: IOException => printf("found io exception...")
      case e2: IllegalArgumentException => {
        printf("do something when illegal happened.")
      }
    } finally {
      printf("finally ......")
    }
  }
}
