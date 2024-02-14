package org.example.creational.abstractFactory;

import org.example.creational.abstractFactory.concreteCreators.AsusManufacturer;
import org.example.creational.abstractFactory.concreteCreators.MsiManufacturer;
import org.example.creational.abstractFactory.creator.Company;
import org.example.creational.abstractFactory.product.gpu.Gpu;
import org.example.creational.abstractFactory.product.monitor.Monitor;

public class Demo {
    public static void main(String[] args) {
        // declare interface for each distinct product we have
        Company msi = new MsiManufacturer();
        Gpu msiGpu = msi.createGpu();
        Monitor msiMonitor = msi.createMonitor();

        Company asus = new AsusManufacturer();
        Gpu asusGpu = asus.createGpu();
        Monitor asusMonitor = asus.createMonitor();



    }
}
