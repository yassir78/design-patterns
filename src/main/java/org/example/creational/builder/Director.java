package org.example.creational.builder;

/*
 * defines the order in which we should call the construction steps so that we can reuse specific
 * configurations of the products we are building ( it's optional )
 * it hides the details of the product construction from the client code
 */
public class Director {
    public void buildBugatti(CarBuilder builder) {
        builder
                .brand("Buggati")
                .color("Blue")
                .model("Chiron");
    }

    public void buildLambo(CarBuilder builder) {
        builder
                .brand("Lamborghini")
                .color("Yellow")
                .model("Aventador");
    }
}
