package br.com.fascari.gof.factory;

import br.com.fascari.gof.factory.vehicles.IVehicle;

public abstract class Transport {

    void startTransport() {
        IVehicle vehicle = createTransport();
        vehicle.startRoute();
    }

    protected abstract IVehicle createTransport();
}
