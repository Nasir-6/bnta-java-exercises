package com.mfin.javaExercises.week2.day5.classes.car_dealership_ex_service_redo;



public class CarDealershipServices {
    // This class performs all business logic for the following:
    // 1. add car
    // 2. how many cars in the garage
    // 3. Find First car with named manufacturer


    //Add car
    // Input - Car dealership, CartoAdd
    // Outputs
    public void addCar(CarDealership carDealership, Car carToAdd){
        //Add the car
        //loop through the array and find an empty spot
        for (int i = 0; i < carDealership.getCars().length; i++) {
            //If its empty add the car
            System.out.println(i + "th iteration");
            if (carDealership.getCars()[i] == null){
                carDealership.getCars()[i] = carToAdd;
                System.out.println("before continue");
                break;
            }

        }

    }



//    Write a method to count the number of cars in the dealership. It doesn't need to take any parameters and should return an int.
    // Count cars
    // Input - carDealership
    // Output - int Num of cars





}
