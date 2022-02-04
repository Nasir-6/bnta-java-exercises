package com.mfin.javaExercises.week2.day5.classes.car_dealership_ex_service_redo;

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



}
