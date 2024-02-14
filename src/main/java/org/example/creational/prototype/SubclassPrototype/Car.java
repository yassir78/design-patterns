package org.example.creational.prototype.SubclassPrototype;

import org.example.creational.prototype.ConcretePrototype.Vehicle;

public class Car extends Vehicle {
    private final int topSpeed;
    private GpsSystem gpsSystem;


    public Car(String brand, String model, String color, int topSpeed) {
        super(brand, model, color);
        this.topSpeed = topSpeed;
    }

    public Car(Car car) {
        super(car);
        this.topSpeed = car.topSpeed;
        // shallow copy
        //this.gpsSystem = car.gpsSystem;
        // deep copy
        this.gpsSystem = new GpsSystem();
    }

    @Override
    public Car clone() {
        return new Car(this);
    }
}
