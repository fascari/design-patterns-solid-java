package br.com.fascari.gof.builder.cars;

import br.com.fascari.gof.builder.components.CarType;
import br.com.fascari.gof.builder.components.Color;
import br.com.fascari.gof.builder.components.Engine;
import br.com.fascari.gof.builder.components.Transmission;

public class Truck {
    private final CarType carType;
    private final int seats;
    private final Engine engine;
    private final Transmission transmission;
    private final Color color;

    public Truck(CarType carType, int seats, Engine engine, Transmission transmission, Color color) {
        this.carType = carType;
        this.seats = seats;
        this.engine = engine;
        this.transmission = transmission;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "carType=" + carType +
                ", seats=" + seats +
                ", engine=" + engine.getPower() +
                ", transmission=" + transmission +
                (color != null ? ", color=" + color : "") +
                '}';
    }
}
