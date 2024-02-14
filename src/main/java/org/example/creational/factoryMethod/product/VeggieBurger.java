package org.example.creational.factoryMethod.product;

public class VeggieBurger implements Burger{
    @Override
    public void prepare() {
        System.out.println("preparing the Veggie burger");
    }
}
