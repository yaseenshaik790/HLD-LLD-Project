package org.example.solid;
//If class B is sub type of class A and class B should use all the class A functionality.
//But should not narrow it down class A functionality

//No
/*

class Vehicle{
    public void hasEngine(){
        System.out.println("Has Engine");
    }
    public void hasWheels(){
        System.out.println("Has Wheel");
    }
}

class MotorBike extends Vehicle{
    public void hasEngine(){
        System.out.println("Has Engine");
    }
    public void hasWheels(){
        System.out.println("Has Wheel");
    }
}

class ByCycle extends Vehicle {
    //It is throwing parent class behaviour
    public void hasEngine(){
        throw new RuntimeException("ByCycle doesn't have engine");
    }
    public void hasWheels(){
        System.out.println("Has Wheel");
    }
}
*/

class Vehicle{
    public void hasWheels(){
        System.out.println("Has Wheel");
    }
}

class VehicleHasEngine extends Vehicle{
    public void hasEngine(){
        System.out.println("Has Engine");
    }
}

class MotorBike extends VehicleHasEngine{
}

class ByCycle extends Vehicle {
    public void hasWheels(){
        System.out.println("Has Wheel");
    }
}

public class LiskovSubstitutePrinceple {
}
