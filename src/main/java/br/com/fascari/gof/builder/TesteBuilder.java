package br.com.fascari.gof.builder;

import br.com.fascari.gof.builder.builders.CarBuilder;
import br.com.fascari.gof.builder.builders.TruckBuilder;
import br.com.fascari.gof.builder.cars.Car;
import br.com.fascari.gof.builder.cars.Truck;
import br.com.fascari.gof.builder.director.Director;

public class TesteBuilder {

    public static void main(String[] args) {
        Director director = new Director();

        CarBuilder builder = new CarBuilder();
        director.constructSedanCar(builder);

        Car car = builder.build();
        System.out.println(car.getCarType() + " produzido com sucesso!");

        TruckBuilder truckBuilder = new TruckBuilder();
        director.constructTruck(truckBuilder);

        Truck truck = truckBuilder.build();
        System.out.println("Caminhão: " + truck.result());

    }
}
