package org.example.creational.prototype;

import org.example.creational.prototype.ConcretePrototype.Vehicle;
import org.example.creational.prototype.SubclassPrototype.Bus;
import org.example.creational.prototype.SubclassPrototype.Car;

import java.util.HashMap;
import java.util.Map;

public class VehicleCache {
    private Map<String, Vehicle> cache = new HashMap<>();

    public VehicleCache(){
        Car car = new Car(
                "Buggati",
                "Chiron",
                "Blue",
                261
        );

        Bus bus = new Bus(
                "Mercedes",
                "Setra",
                "White",
                48
        );

        cache.put("Bugatti Chiron",car);
        cache.put("Mercedes Setra",bus);

    }

    public void addVehicle(Vehicle vehicle) {
        String key = String.format("%s %s", vehicle.getBrand(), vehicle.getModel());
        if (!cache.containsKey(vehicle.getBrand())) {
            cache.put(key, vehicle);
        }
    }

    public Vehicle get(String key){
        return cache.get(key).clone();
    }
}
