package com.proartz.Chapter2.Exercise9;

public class Car {
    private double fuelConsumption;
    private double fuel;
    private double trip;

    public Car(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public void drive(double distance) {
        double fuelConsumption = distance * (this.fuelConsumption / 100);

        if((fuel - fuelConsumption) >= 0) {
            fuel -= fuelConsumption;
            trip += distance;
        }
    }

    public void tank(int litres) {
        fuel += litres;
    }

    public double getFuel() {
        return fuel;
    }

    public double getTrip() {
        return trip;
    }

    @Override
    public String toString() {
        return "Car{" +
                "fuelConsumption=" + fuelConsumption +
                ", fuel=" + fuel +
                ", trip=" + trip +
                '}';
    }
}
