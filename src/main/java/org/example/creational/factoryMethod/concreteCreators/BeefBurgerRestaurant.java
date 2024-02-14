package org.example.creational.factoryMethod.concreteCreators;

import org.example.creational.factoryMethod.creator.Restaurant;
import org.example.creational.factoryMethod.product.BeefBurger;
import org.example.creational.factoryMethod.product.Burger;

public class BeefBurgerRestaurant extends Restaurant {
    @Override
    protected Burger makeBurger() {
        return new BeefBurger();
    }
}
