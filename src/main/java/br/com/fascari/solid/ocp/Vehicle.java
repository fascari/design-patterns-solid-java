package br.com.fascari.solid.ocp;

/**
 * Esta classe é um exemplo da violação do OCP e SRP
 */
public class Vehicle {
    private final String color;
    private final String year;
    private final double engine;
    private final int seats;

    public Vehicle(String color, String year, double engine, int seats) {
        this.color = color;
        this.year = year;
        this.engine = engine;
        this.seats = seats;
    }

    void car() {
        System.out.println("Criando um carro: " + color + " " + year + " " + engine + " com " + seats + " assentos");
        startVehicle();
    }

    void motorcycle(){
        System.out.println("Criando uma moto: "+ year + " "+ engine + " cilindradas");
    }

    void startVehicle(){
        System.out.println("Ligando os motores");
    }
}
