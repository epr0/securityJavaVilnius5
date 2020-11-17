package com.example.apsauga2.oop;

public class Truck extends AbstractCar implements Car {
    @Override
    public void interfaceTurnOnEngine() {
        System.out.println("Truck turns on engine");
    }

    @Override
    public void interfaceMakeHornSound() {
        System.out.println("Truck makes horn sound");
    }

    public void rideAsATruck() {
        System.out.println("riding slowly through dirt");
    }

    @Override
    void abstractRide() {
        System.out.println("[Truck] Riding as a truck implemented abstract" );
    }
}
