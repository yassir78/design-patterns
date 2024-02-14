package org.example.creational.factoryMethod.concreteCreators;

import org.example.creational.factoryMethod.creator.Restaurant;
import org.example.creational.factoryMethod.product.Burger;
import org.example.creational.factoryMethod.product.VeggieBurger;

public class VeggieBurgerRestaurant extends Restaurant {
    @Override
    protected Burger makeBurger() {
        return new VeggieBurger();
    }
}
