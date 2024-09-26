package org.example.designpatterns.behavioural.strategy.not;

public class OffRoadVehicle extends Vehicle{

    public void getSeating(){
        System.out.println("Special Seating");
    }

    public void driveVehicle(){
        System.out.println("Special Cap");
    }
}
