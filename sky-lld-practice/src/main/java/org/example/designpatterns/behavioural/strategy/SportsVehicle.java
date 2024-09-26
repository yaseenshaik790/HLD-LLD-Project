package org.example.designpatterns.behavioural.strategy;

public class SportsVehicle extends Vehicle{
    public SportsVehicle(DriveStrategy driveStrategy) {
        super(driveStrategy);
    }
}
