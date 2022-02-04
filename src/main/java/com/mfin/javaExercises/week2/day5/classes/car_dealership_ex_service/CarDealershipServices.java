package com.mfin.javaExercises.week2.day5.classes.car_dealership_ex_service;

public class CarDealershipServices {
    // This class performs all business logic for the following:
    // 1. add cars
    // 2. how many cars in the garage
    // 3. Find First car with named manufacturer

    public int countCars(CarDealership carDealership){
        // have counter
        int numOfCars = 0;
        // Loop through number whole dealership array, and count
        for (int i = 0; i < carDealership.getCapacity(); i++) {
            //If not empty increase number
            if (carDealership.getCars()[i] != null) {
                numOfCars += 1;
            }
        }
        return numOfCars;
    }


    public void addCar(CarDealership carDealership, Car newCar){
        // Loop through our cars array

        // copy carDealership array (so can setCars and not use getCars to set!) - ignore if using getCars
        Car[] dealershipCarsCopy = carDealership.getCars();

        for (int i = 0; i < carDealership.getCapacity(); i++) {
            // Check if there is already a car in that space
            if (carDealership.getCars()[i] == null){
                // If not, put our new car in that slot
                // Could set using getCars - This is for Marcy
                carDealership.getCars()[i] = newCar;

                // Ignore this copy
                dealershipCarsCopy[i] = newCar;
                // Once we have placed our new car we can stop the loop
                break;
            }
        }
        // Ignore if using getcars
        carDealership.setCars(dealershipCarsCopy);
    }


    //    Create a method called findCarByManufactuere
//    Input is string - ManufactuereName
//    Return First car with manufactureer name

    public Car findCarByManufacturer(CarDealership carDealership, String manufacturerName){

        //Loop through all cars

        for (Car car : carDealership.getCars()) {
            //System.out.println(car);
            // Get the car manufacturer
            if (car != null){
                if (manufacturerName.toLowerCase().equals(car.getManufacturer().name().toLowerCase())) {
                    return car;
                }
            }

        }
        //Return null if nothing found
        return null;

    }






}
