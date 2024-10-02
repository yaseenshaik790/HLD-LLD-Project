package org.example.designpatterns.creational.abstractfactory;

public class OrdinaryCar implements CarFactory{

    @Override
    public Car getCar(String name){
        switch (name){
            case "SWIFT":
                return new Swift();
            case "HYUNDAI":
                return new Hyundai();
            default:
                return null;
        }
    }
}
