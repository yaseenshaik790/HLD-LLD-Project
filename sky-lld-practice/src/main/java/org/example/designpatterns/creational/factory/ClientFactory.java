package org.example.designpatterns.creational.factory;

public class ClientFactory {

    //This pattern creates Object based on conditions.
    public static void main(String[] args) {
        Shape shape = ShapeFactory.getShape("CIRCLE");
        shape.draw();
    }
}
