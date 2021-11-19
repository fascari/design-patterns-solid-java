package br.com.fascari.gof.factory.transports;

import br.com.fascari.gof.factory.vehicles.Car;
import br.com.fascari.gof.factory.vehicles.IVehicle;

public class CarTransport extends Transport {
    @Override
    protected IVehicle createTransport() {
        return new Car();
    }
}
