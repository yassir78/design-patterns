package org.example.creational.builder;

public class Demo {
    public static void main(String[] args) {
        // produces different types and representations of an object
        // using the same construction process
        CarBuilder builder = new CarBuilder();
        builder
                .id(22)
                .brand("Bugatti")
                .model("Chiron")
                .color("Blue");
        Car car = builder.build();
        System.out.println(car.toString());
    }
}
