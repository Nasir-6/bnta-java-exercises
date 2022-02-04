package com.mfin.javaExercises.week2.day5.classes.car_dealership_ex_repeat.car_dealership_ex;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Car car1 = new Car(EngineType.DIESEL, Manufacturer.PORSCHE, 100_000);
        Car car2 = new Car(EngineType.ELECTRIC, Manufacturer.BMW, 80_000);
        Car car3 = new Car(EngineType.PETROL, Manufacturer.HONDA, 110_000);

        System.out.println(car1);


//        System.out.println(car1);

        CarDealership nasCar = new CarDealership("NasCar", 5);
//        System.out.println(nasCar);

//        nasCar.addCar(car1);
//        nasCar.addCar(car2);
//        nasCar.addCar(car3);
//
        Car[] cars = {car1, car2, car3};
//
        System.out.println(Arrays.toString(cars));
        System.out.println(cars[1]);
//
//        System.out.println(nasCar.countNumberOfCars());
        for (Car car : cars) {
            nasCar.addCar(car);
            System.out.println("Car added");
            System.out.println(nasCar.countCars());
        }
        System.out.println(nasCar);


//
////        Car result = nasCar.findCarByManufacturer("bmw");
////        System.out.println(result);
//

    }





}
