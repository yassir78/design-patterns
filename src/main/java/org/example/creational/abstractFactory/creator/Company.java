package org.example.creational.abstractFactory.creator;

import org.example.creational.abstractFactory.product.gpu.Gpu;
import org.example.creational.abstractFactory.product.monitor.Monitor;

public abstract class Company {

    public abstract Gpu createGpu();

    public abstract Monitor createMonitor();
}
