package br.com.fascari.gof.abstractfactory.factories;

import br.com.fascari.gof.abstractfactory.aircrafts.Helicopter;
import br.com.fascari.gof.abstractfactory.aircrafts.IAircraft;
import br.com.fascari.gof.abstractfactory.boats.Boat;
import br.com.fascari.gof.abstractfactory.boats.IBoat;
import br.com.fascari.gof.abstractfactory.landvehicles.ILandVehicle;
import br.com.fascari.gof.abstractfactory.landvehicles.Motorcycle;

public class NineNineTransport implements ITransportFactory {
    @Override
    public ILandVehicle createTransportVehicle() {
        return new Motorcycle();
    }

    @Override
    public IAircraft createTransportAircraft() {
        return new Helicopter();
    }

    @Override
    public IBoat createTransportBoat() {
        return new Boat();
    }
}
