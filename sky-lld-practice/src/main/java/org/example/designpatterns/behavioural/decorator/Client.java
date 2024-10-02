package org.example.designpatterns.behavioural.decorator;

public class Client {

    public static void main(String[] args) {
        Pizza nonVegPizza = new ExtraMushroom(new ExtraCheese(new NonVegPizza()));
        System.out.println(nonVegPizza.getCost());

        Pizza vegPizza = new ExtraMushroom(new VegPizza());
        System.out.println(vegPizza.getCost());
    }
}
