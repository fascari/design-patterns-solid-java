package br.com.fascari.solid.isp.vehicles;

public class Motorcycle implements IVehicle, IVehicleMotorcycle{
    public Motorcycle(String color, String year, double engine){
        configureMotorcycle(color, year, engine);
    }

    @Override
    public void configureMotorcycle(String color, String year, double engine) {
        System.out.println("Criando uma moto: " + engine + " " + color + " " + year);
        startVehicle();
    }

    @Override
    public void startVehicle() {
    }
}
