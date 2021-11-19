package br.com.fascari.gof.builder.director;

import br.com.fascari.gof.builder.components.CarType;
import br.com.fascari.gof.builder.components.Transmission;
import br.com.fascari.gof.builder.builders.IBuilder;
import br.com.fascari.gof.builder.components.Engine;

public class Director {

    public void constructSedanCar(IBuilder builder){
        builder.setCarType(CarType.SEDAN);
        builder.setSeats(5);
        builder.setTransmission(Transmission.AUTOMATIC);
        builder.setEngine(new Engine(1600));
    }

    public void constructTruck(IBuilder builder){
        builder.setCarType(CarType.TRUCK);
        builder.setSeats(5);
        builder.setTransmission(Transmission.AUTOMATIC_SEQUENTIAL);
        builder.setEngine(new Engine(13000));
    }
}
