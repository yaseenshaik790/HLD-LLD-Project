package org.example.designpatterns.behavioural.strategy;

public class StrategyClient {
    public static void main(String[] args) {
        Vehicle passengersVehicle = new PassengersVehicle(new NormalDriveCapability());
        passengersVehicle.driveVehicle();
        Vehicle sportsVehicle = new SportsVehicle(new SpecialDriveCapability());
        sportsVehicle.driveVehicle();
    }
}
