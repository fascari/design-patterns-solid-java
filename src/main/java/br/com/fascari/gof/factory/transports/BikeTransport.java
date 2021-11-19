package br.com.fascari.gof.factory.transports;

import br.com.fascari.gof.factory.vehicles.Bike;
import br.com.fascari.gof.factory.vehicles.IVehicle;

public class BikeTransport extends Transport {
    @Override
    protected IVehicle createTransport() {
        return new Bike();
    }
}
