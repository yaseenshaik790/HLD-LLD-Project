package org.example.designpatterns.creational.abstractfactory;

public class AbstractCarCollections {

    public static Car carFactory(String name, String carName){
        switch (name){
            case "ORDINARY":
                return new OrdinaryCar().getCar(carName);
            case "LUXURY":
                return new LuxuryCar().getCar(carName);
            default:
                return null;
        }
    }
}
