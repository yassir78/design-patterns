package org.example.creational.prototype.SubclassPrototype;

import org.example.creational.prototype.ConcretePrototype.Vehicle;

public class Bus extends Vehicle {
    private final int doors;

    public Bus(String brand, String model, String color, int doors) {
        super(brand, model, color);
        this.doors = doors;
    }

    public Bus(Bus bus) {
        super(bus);
        this.doors = bus.doors;
    }

    @Override
    public Vehicle clone() {
        return new Bus(this);
    }
}
