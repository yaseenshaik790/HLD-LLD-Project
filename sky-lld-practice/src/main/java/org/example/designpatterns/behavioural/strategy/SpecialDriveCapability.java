package org.example.designpatterns.behavioural.strategy;

public class SpecialDriveCapability  implements  DriveStrategy{

    @Override
    public void drive() {
        System.out.println("Special Drive Cap....");
    }
}
