package org.example.creational.factoryMethod.product;

public class BeefBurger implements Burger{
    @Override
    public void prepare() {
        System.out.println("preparing the beef burger");
    }
}
