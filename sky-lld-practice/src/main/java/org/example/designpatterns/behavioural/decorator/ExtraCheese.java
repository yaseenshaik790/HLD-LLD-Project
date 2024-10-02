package org.example.designpatterns.behavioural.decorator;

public class ExtraCheese extends ToppingDecorator{

    private Pizza pizza;

    public ExtraCheese(Pizza pizza){
        this.pizza = pizza;
    }

    @Override
    public int getCost() {
        return pizza.getCost()+10;
    }
}
