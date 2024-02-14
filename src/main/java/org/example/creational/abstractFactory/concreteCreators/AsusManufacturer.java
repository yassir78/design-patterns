package org.example.creational.abstractFactory.concreteCreators;

import org.example.creational.abstractFactory.creator.Company;
import org.example.creational.abstractFactory.product.gpu.AsusGpu;
import org.example.creational.abstractFactory.product.gpu.Gpu;
import org.example.creational.abstractFactory.product.monitor.AsusMonitor;
import org.example.creational.abstractFactory.product.monitor.Monitor;

public class AsusManufacturer extends Company {
    @Override
    public Gpu createGpu() {
        return new AsusGpu();
    }

    @Override
    public Monitor createMonitor() {
        return new AsusMonitor();
    }
}
