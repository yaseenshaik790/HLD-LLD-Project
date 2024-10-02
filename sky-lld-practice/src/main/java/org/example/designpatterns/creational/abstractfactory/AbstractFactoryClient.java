package org.example.designpatterns.creational.abstractfactory;

public class AbstractFactoryClient {
    //It is combination of multiple Factory methods/patterns
    //It will group the products and each group has separate Factory pattern
    public static void main(String[] args) {
        Car luxuryCar =
                AbstractCarCollections.carFactory("LUXURY", "ROLLS");
        luxuryCar.driveCar();
    }
}
