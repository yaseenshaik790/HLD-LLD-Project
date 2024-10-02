package org.example.designpatterns.creational.factory;

public class ShapeFactory {

    public static Shape getShape(String name){
        switch (name){
            case "CIRCLE":
                return new Circle();
            case "RECTANGLE":
                return new Rectangle();
            default:
                return null;
        }
    }
}
