package br.com.hcode.solid.isp;

import br.com.hcode.solid.isp.vehicles.Car;
import br.com.hcode.solid.isp.vehicles.Motorcycle;

public class Main {
    public static void main(String[] args) {
        String type = "Car";
        if ("Car".equals(type)) {
            Car car = new Car("Azul", "2022", 2.6, 4);
        } else {
            Motorcycle motorcycle = new Motorcycle("branca", "2022", 250);
        }
    }
}
