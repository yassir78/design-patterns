package org.example.creational.factoryMethod.creator;

import org.example.creational.factoryMethod.product.Burger;

public abstract class Restaurant {

    public Burger orderBurger() {
        Burger burger = makeBurger();
        burger.prepare();
        return burger;
    }

    protected abstract Burger makeBurger();
}
