package br.com.fascari.solid.ocp;

import br.com.fascari.solid.ocp.vehicles.Car;
import br.com.fascari.solid.ocp.vehicles.Motorcycle;

public class TesteOCP {
    public static void main(String[] args) {
        TypeVehicle typeVehicle = getTypeVehicle();
        if (TypeVehicle.CAR.equals(typeVehicle)) {
            new Car("Azul", "2022", 2.6, 4);
            return;
        }
        if (TypeVehicle.MOTORCYCLE.equals(typeVehicle)) {
	        /* Exemplo da chamada indevida violando o OCP
	        Vehicle vehicle = new Vehicle("","2022",250,1);
	        vehicle.motorcycle();
	        */
            new Motorcycle("branca", "2022", 250);
        }
    }

    private static TypeVehicle getTypeVehicle() {
        return TypeVehicle.MOTORCYCLE;
    }
}
