package br.com.fascari.gof.builder.cars;

import br.com.fascari.gof.builder.components.CarType;
import br.com.fascari.gof.builder.components.Color;
import br.com.fascari.gof.builder.components.Engine;
import br.com.fascari.gof.builder.components.Transmission;

public class Car {

    private final CarType carType;
    private final int seats;
    private final Engine engine;
    private final Transmission transmission;
    private final Color color;

    public Car(CarType carType, int seats, Engine engine, Transmission transmission, Color color) {
        this.carType = carType;
        this.seats = seats;
        this.engine = engine;
        this.transmission = transmission;
        this.color = color;
    }

    public CarType getCarType() {
        return carType;
    }

    public int getSeats() {
        return seats;
    }

    public Engine getEngine() {
        return engine;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public Color getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carType=" + carType +
                ", seats=" + seats +
                ", engine=" + engine.getPower() +
                ", transmission=" + transmission +
                (color != null ? ", color=" + color : "") +
                '}';
    }
}
