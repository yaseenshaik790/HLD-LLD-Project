package org.example.designpatterns.behavioural.decorator;

public class ExtraMushroom extends ToppingDecorator{

    private Pizza pizza;

    public ExtraMushroom(Pizza pizza){
        this.pizza = pizza;
    }

    @Override
    public int getCost() {
        return pizza.getCost()+20;
    }
}
