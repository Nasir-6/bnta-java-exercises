package com.mfin.javaExercises.week2.day5.classes.car_dealership_ex;

import java.util.Arrays;

public class CarDealership {
    // Properties name, max cars and all cars in stock
    private String dealershipName;
    private int capacity;
    private Car[] cars;

    public CarDealership(String dealershipName, int capacity) {
        this.dealershipName = dealershipName;
        this.capacity = capacity;
        this.cars = new Car[capacity];
    }

    public String getDealershipName() {
        return dealershipName;
    }

    public void setDealershipName(String dealershipName) {
        this.dealershipName = dealershipName;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public Car[] getCars() {
        return cars;
    }

    public void setCars(Car[] cars) {
        this.cars = cars;
    }

    @Override
    public String toString() {
        return "CarDealership{" +
                "dealershipName='" + dealershipName + '\'' +
                ", capacity=" + capacity +
                ", cars=" + Arrays.toString(cars) +
                '}';
    }


    public int countNumberOfCars() {
        // have counter
        int numOfCars = 0;
        // Loop through number whole dealership array, and count
        for (int i = 0; i < this.capacity; i++) {
            //If not empty increase number
            System.out.println(i + "th position in array");
            System.out.println("Num of cars found: " + numOfCars);


            if (this.cars[i] != null) {
                //New = old + 1
                numOfCars = numOfCars + 1;
                System.out.println("Found a car");
                System.out.println(numOfCars);
            }
        }
        return numOfCars;
    }




    public void addCar(Car newCar){
        // Loop through our cars array
        for (int i = 0; i < this.capacity; i++) {
            // Check if there is already a car in that space
            if (this.cars[i] == null){
                // If not, put our new car in that slot
                this.cars[i] = newCar;
                // Once we have placed our new car we can stop the loop
                break;
            }
        }
    }

//    Create a method called findCarByManufactuere
//    Input is string - ManufactuereName
//    Return First car with manufactureer name

    public Car findCarByManufacturer(String manufacturerName){

        //Loop through all cars

        for (Car car : this.cars) {
//            System.out.println(car);
            // Get the car manufacturer
            try {

                if(car.getManufacturer().name().toLowerCase().equals(manufacturerName.toLowerCase())){
                    return car;
                }
            }catch (Exception e){
                System.out.println("No Car");
            }

        }

        //Return null if nothing found
        return null;

    }


}
