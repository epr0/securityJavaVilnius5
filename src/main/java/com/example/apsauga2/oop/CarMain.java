package com.example.apsauga2.oop;

public class CarMain {

    public static void main(String[] args) {
        Bmw bmw = new Bmw();

        Car m3 = new Bmw();
        ((Bmw) m3).concreteRideOnPlentas();
        ((Bmw) m3).abstractRide();
        m3.interfaceMakeHornSound();
        m3.interfaceTurnOnEngine();
        ((Bmw) m3).concreteRideFromAbstract();

        Car truck = new Truck();
        truck.interfaceTurnOnEngine();
        truck.interfaceMakeHornSound();
    }
}
