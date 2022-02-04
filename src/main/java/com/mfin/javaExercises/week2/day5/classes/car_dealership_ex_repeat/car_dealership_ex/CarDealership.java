package com.mfin.javaExercises.week2.day5.classes.car_dealership_ex_repeat.car_dealership_ex;

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

    //Create a method that adds a car
    public void addCar(Car carToAdd){
        System.out.println(carToAdd);

        //Loop through all the cars in the dealership
        for (int i = 0; i < this.getCars().length; i++) {

            //if you find an empty spot - add the car - and break
            if(this.getCars()[i] == null){
//                System.out.println("Empty Spot");
                this.getCars()[i] = carToAdd;
                break;
            }

        }
        //if you don't find an empty spot - sout (Cant find empyt spot)
    }


    public int countCars(){

        //initilise counter at 0
        int numberOfCars = 0;
//        //Loop through dealership cars array
        for (Car car : this.getCars()) {
            // if occupied (not null) then increase the counter
            if(car != null){
                numberOfCars = numberOfCars + 1;
            }
        }
        // return the count
        return numberOfCars;
    }
}
