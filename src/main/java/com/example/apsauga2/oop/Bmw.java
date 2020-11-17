package com.example.apsauga2.oop;

public class Bmw extends AbstractCar implements Car{
    @Override
    public void interfaceTurnOnEngine() {
        System.out.println("[Car] Bmw turns on the engine...");
    }

    @Override
    public void interfaceMakeHornSound() {
        System.out.println("[Car] BMW makes horn sound");
    }

    public void concreteRideOnPlentas() {
        System.out.println("[Bmw] Riding on plentas smoothly...");
    }

    @Override
    void abstractRide() {
        System.out.println("[AbstractCar] Riding from abstract implementation...");
    }
}
