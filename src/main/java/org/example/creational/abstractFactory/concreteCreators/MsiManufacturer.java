package org.example.creational.abstractFactory.concreteCreators;

import org.example.creational.abstractFactory.creator.Company;
import org.example.creational.abstractFactory.product.gpu.Gpu;
import org.example.creational.abstractFactory.product.gpu.MsiGpu;
import org.example.creational.abstractFactory.product.monitor.Monitor;
import org.example.creational.abstractFactory.product.monitor.MsiMonitor;

public class MsiManufacturer extends Company {
    @Override
    public Gpu createGpu() {
        return new MsiGpu();
    }

    @Override
    public Monitor createMonitor() {
        return new MsiMonitor();
    }
}
