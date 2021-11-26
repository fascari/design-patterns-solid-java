package br.com.fascari.gof.builder.builders;

import br.com.fascari.gof.builder.cars.Truck;
import br.com.fascari.gof.builder.components.CarType;
import br.com.fascari.gof.builder.components.Color;
import br.com.fascari.gof.builder.components.Engine;
import br.com.fascari.gof.builder.components.Transmission;

public class TruckBuilder implements IBuilder {
    private CarType carType;
    private int seats;
    private Transmission transmission;
    private Engine engine;
    private Color color;

    @Override
    public void setCarType(CarType carType) {
        this.carType = carType;
    }

    @Override
    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Truck build() {
        return new Truck(carType, seats, engine, transmission, color);
    }
}
