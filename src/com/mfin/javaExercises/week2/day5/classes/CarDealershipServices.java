package com.mfin.javaExercises.week2.day5.classes;

public class CarDealershipServices {
    // This class performs all business logic for the following:
    // 1. add cars
    // 2. how many cars in the garage

    public void addCar(CarDealership carDealership, Car car) {
        // check if open
        // if open check not full
        // then add car to garage
        // if full throw exception
        // if not open throw exception
//        if (garage.isOpen()) {
//            int currentCarsInGarageCount = getTotalNumberOfCarsInGarage(garage);
//            if (currentCarsInGarageCount < garage.getCapacity()) {
//                for (int i = 0; i < garage.getCars().length; i++) {
//                    if (garage.getCars()[i] == null) {
//                        garage.getCars()[i] = car;
//                        break;
//                    }
//                }
//            } else {
//                throw new IllegalStateException(garage.getGarageNumber() + " is full. Sorry :(");
//            }
//        } else {
//            throw new IllegalStateException(garage.getGarageNumber() + " is closed. Please open before adding your car");
//        }
    }


}
