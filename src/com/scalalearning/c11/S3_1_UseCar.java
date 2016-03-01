package com.scalalearning.c11;

/**
 * Created by gaolp on 2016/3/1.
 */
public class S3_1_UseCar {
    public static void main(String[] args) {
        Car car = new Car(2009);

        System.out.println(car);
        car.drive(10);
        System.out.println(car);
    }

}
