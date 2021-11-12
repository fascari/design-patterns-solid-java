package br.com.fascari.solid.isp;

import br.com.fascari.solid.isp.vehicles.Car;
import br.com.fascari.solid.isp.vehicles.Motorcycle;
import br.com.fascari.solid.isp.vehicles.TypeVehicle;

public class TesteISP {
    public static void main(String[] args) {
        if (TypeVehicle.CAR.equals(getType())) {
            new Car("Azul", "2022", 2.6, 4);
            return;
        }
        new Motorcycle("branca", "2022", 250);
    }

    private static TypeVehicle getType() {
        //return TypeVehicle.MOTORCYCLE;
        return TypeVehicle.CAR;
    }
}
