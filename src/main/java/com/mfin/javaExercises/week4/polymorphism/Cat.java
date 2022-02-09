package com.mfin.javaExercises.week4.polymorphism;

public class Cat extends Animal {

    public Cat(String name, int age) {
        super(name, age);
    }

    public void meow() {
        System.out.println(this.getName() + " is meowing...");
    }

}