package com.scalalearning.c11

/**
  * Created by gaolp on 2016/3/1.
  */
abstract class Bird {
  @throws(classOf[NoFlyException]) def fly();
}
