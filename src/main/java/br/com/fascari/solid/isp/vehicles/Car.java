package br.com.fascari.solid.isp.vehicles;

public class Car implements IVehicle, IVehicleCar{
    public Car(String color, String year, double engine, int seats){
        configureCar(color, year, engine, seats);
    }
    @Override
    public void configureCar(String color, String year, double engine, int seats) {
        System.out.println("Criando um carro: " + engine + " " + color + " " + year + " " + seats + " assentos");
        startVehicle();
    }

    @Override
    public void startVehicle() {
        System.out.println("Ligando o Motores");
    }
}
