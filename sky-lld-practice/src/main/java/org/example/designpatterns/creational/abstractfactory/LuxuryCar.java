package org.example.designpatterns.creational.abstractfactory;

public class LuxuryCar implements CarFactory{

    @Override
    public Car getCar(String name){
        switch (name){
            case "MERCEDES":
                return new Marcedes();
            case "ROLLS":
                return new RollsRoys();
            default:
                return null;
        }
    }
}
