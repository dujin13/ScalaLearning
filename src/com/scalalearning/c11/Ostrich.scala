package com.scalalearning.c11

/**
  * Created by gaolp on 2016/3/1.
  */
class Ostrich extends Bird {
  def fly(): Unit = {
    throw new NoFlyException
  }
}
