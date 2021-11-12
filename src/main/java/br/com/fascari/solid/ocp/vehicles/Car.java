package br.com.fascari.solid.ocp.vehicles;

public class Car implements IVehicleCar{
    public Car(String color, String year, double engine, int seats){
        configureVehicle(color, year, engine, seats);
    }

    @Override
    public void configureVehicle(String color, String year, double engine, int seats) {
        System.out.println("Criando um carro com Interface: " + color + " " + engine);
        startVehicle();
    }

    @Override
    public void startVehicle() {
        System.out.println("Ligando os Motores com Interface");
    }
}
