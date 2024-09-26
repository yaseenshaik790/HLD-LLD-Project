package org.example.designpatterns.behavioural.strategy;

public class PassengersVehicle extends Vehicle{
    public PassengersVehicle(DriveStrategy driveStrategy) {
        super(driveStrategy);
    }
}
