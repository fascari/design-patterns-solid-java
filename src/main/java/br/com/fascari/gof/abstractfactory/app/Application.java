package br.com.fascari.gof.abstractfactory.app;

import br.com.fascari.gof.abstractfactory.aircrafts.IAircraft;
import br.com.fascari.gof.abstractfactory.boats.IBoat;
import br.com.fascari.gof.abstractfactory.factories.ITransportFactory;
import br.com.fascari.gof.abstractfactory.landvehicles.ILandVehicle;

public class Application {
    private ILandVehicle vehicle;
    private IAircraft aircraft;
    private IBoat boat;

    public Application(ITransportFactory factory) {
        vehicle = factory.createTransportVehicle();
        aircraft = factory.createTransportAircraft();
        boat = factory.createTransportBoat();
    }

    public void startRoute() {
        vehicle.startRoute();
        aircraft.startRoute();
        boat.startRoute();
    }
}
