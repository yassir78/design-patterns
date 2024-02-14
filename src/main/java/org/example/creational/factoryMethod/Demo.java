package org.example.creational.factoryMethod;

import org.example.creational.factoryMethod.concreteCreators.VeggieBurgerRestaurant;
import org.example.creational.factoryMethod.creator.Restaurant;
import org.example.creational.factoryMethod.product.Burger;

public class Demo {


    public static void main(String[] args) {
        Restaurant restaurant = new VeggieBurgerRestaurant();
        Burger orderedBurger = restaurant.orderBurger();
        System.out.println(orderedBurger != null);
    }


}
