package com.mfin.javaExercises.week2.day5.classes.car_dealership_ex_service_redo;

public class Main {

    public static void main(String[] args) {
        Car car1 = new Car(EngineType.DIESEL, Manufacturer.PORSCHE, 100_000);
        Car car2 = new Car(EngineType.ELECTRIC, Manufacturer.BMW, 80_000);
        Car car3 = new Car(EngineType.PETROL, Manufacturer.HONDA, 110_000);

        System.out.println(car1);

        Car[] cars = {car1, car2, car3};

        //Making A new Cardealership
        CarDealership nasCar = new CarDealership("NasCar", 5);
        // creating the services
        CarDealershipServices nasCarServices = new CarDealershipServices();

        nasCarServices.addCar(nasCar, car1);
        System.out.println(nasCar);
//        nasCarServices.addCar(nasCar, car2);
//        System.out.println(nasCar);
//        System.out.println(nasCarServices.countCars(nasCar));
//        for (Car car : cars) {
//            nasCarServices.addCar(nasCar, car);
//        }
//        System.out.println(nasCar);
//
//
//
//        String manufacturerName = "bmwi";
//        Car result = nasCarServices.findCarByManufacturer(nasCar, manufacturerName);
//
//        if (result == null){
//            System.out.println("There is No Car from \"" + manufacturerName + "\" inside the NasCar Dealership");
//        } else {
//            System.out.println("Here's the first car from the manufacturer " + manufacturerName.toUpperCase() + ":");
//            System.out.println(result);
//        }
//

    }





}
