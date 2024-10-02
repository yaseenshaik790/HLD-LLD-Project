package org.example.designpatterns.behavioural.decorator;

public class NonVegPizza extends Pizza{
    @Override
    public int getCost() {
        return 150;
    }
}
