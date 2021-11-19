package br.com.fascari.gof.builder;

import br.com.fascari.gof.builder.director.Director;
import br.com.fascari.gof.builder.builders.CarBuilder;
import br.com.fascari.gof.builder.builders.TruckBuilder;
import br.com.fascari.gof.builder.cars.Car;
import br.com.fascari.gof.builder.cars.Truck;

public class Main {

    public static void main(String[] args) {

        Director director = new Director();

        //criando o carro
        CarBuilder builder = new CarBuilder();
        director.constructSedanCar(builder);

        Car car = builder.getresult();
        System.out.println(car.getCarType() + " produzido com sucesso!");

        TruckBuilder truckBuilder = new TruckBuilder();
        director.constructTruck(truckBuilder);

        Truck truck = truckBuilder.getresult();
        System.out.println("Caminhão: " +truck.result());

    }
}
