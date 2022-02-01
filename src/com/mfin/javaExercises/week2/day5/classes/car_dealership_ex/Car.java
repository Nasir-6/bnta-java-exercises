package com.mfin.javaExercises.week2.day5.classes.car_dealership_ex;

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
}
