package com.example.apsauga2.oop;

public abstract class AbstractCar {
    abstract void abstractRide();

    void concreteRideFromAbstract() {
        System.out.println("[AbstractCar] Riding from parent Abstract...");
    }


}
