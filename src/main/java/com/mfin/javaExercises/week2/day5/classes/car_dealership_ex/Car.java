package com.mfin.javaExercises.week2.day5.classes.car_dealership_ex;

import java.util.Objects;

public class Car {
    //Properties
    //accessMod Class/datatype name

    private EngineType engineType;
    private Manufacturer manufacturer;
    private double price;

    public Car(){
    }

    public Car(EngineType engineType, Manufacturer manufacturer, double price) {
        this.engineType = engineType;
        this.manufacturer = manufacturer;
        this.price = price;
    }

    public EngineType getEngineType() {
        return engineType;
    }

    public void setEngineType(EngineType engineType) {
        this.engineType = engineType;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    @Override
    public String toString() {
        return "Car{" +
                "engineType=" + engineType +
                ", manufacturer=" + manufacturer +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Double.compare(car.price, price) == 0 && engineType == car.engineType && manufacturer == car.manufacturer;
    }

    @Override
    public int hashCode() {
        return Objects.hash(engineType, manufacturer, price);
    }
}
