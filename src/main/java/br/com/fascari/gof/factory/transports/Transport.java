package br.com.fascari.gof.factory.transports;

import br.com.fascari.gof.factory.vehicles.IVehicle;

public abstract class Transport {
    public void startTransport() {
        IVehicle vehicle = createTransport();
        vehicle.startRoute();
    }

    protected abstract IVehicle createTransport();
}
