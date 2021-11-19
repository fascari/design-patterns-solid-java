package br.com.fascari.gof.factory.transports;

import br.com.fascari.gof.factory.vehicles.IVehicle;
import br.com.fascari.gof.factory.vehicles.Motorcycle;

public class MotorcycleTransport extends Transport {

    @Override
    protected IVehicle createTransport() {
        return new Motorcycle();
    }
}
