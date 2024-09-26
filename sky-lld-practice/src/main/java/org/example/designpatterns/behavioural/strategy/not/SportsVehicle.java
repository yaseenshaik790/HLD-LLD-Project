package org.example.designpatterns.behavioural.strategy.not;

import org.example.designpatterns.behavioural.strategy.DriveStrategy;

public class SportsVehicle extends Vehicle {
    public void getSeating(){
        System.out.println("Special Seating");
    }

    public void driveVehicle(){
        System.out.println("Special Cap");
    }
}
