package com.scalalearning.c11;

/**
 * Created by gaolp on 2016/3/1.
 */
public class Penguin extends Bird {
    public void fly() throws NoFlyException {
        throw  new NoFlyException();
    }
}
