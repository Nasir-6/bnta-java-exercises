package com.mfin.javaExercises.week2.day5.classes;

public class Main {

    public static void main(String[] args) {
        Car car1 = new Car(EngineType.DIESEL, Manufacturer.PORSCHE, 100_000);
        Car car2 = new Car(EngineType.ELECTRIC, Manufacturer.BMW, 80_000);
        Car car3 = new Car(EngineType.PETROL, Manufacturer.HONDA, 110_000);

        Car[] cars = {car1, car2, car3};


        System.out.println(cars[1]);



        CarDealership nasCar = new CarDealership("NasCar", 5);

        System.out.println(nasCar.countNumberOfCars());
        for (Car car : cars) {
            nasCar.addCar(car);
        }
        System.out.println(nasCar);

        Car result = nasCar.findCarByManufacturer("bmw");
        System.out.println(result);


    }





}
