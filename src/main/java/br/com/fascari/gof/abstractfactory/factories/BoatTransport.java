package br.com.fascari.gof.abstractfactory.factories;

import br.com.fascari.gof.abstractfactory.aircrafts.Airplane;
import br.com.fascari.gof.abstractfactory.aircrafts.IAircraft;
import br.com.fascari.gof.abstractfactory.boats.Boat;
import br.com.fascari.gof.abstractfactory.boats.IBoat;
import br.com.fascari.gof.abstractfactory.landvehicles.Car;
import br.com.fascari.gof.abstractfactory.landvehicles.ILandVehicle;

public class BoatTransport implements ITransportFactory {
    @Override
    public ILandVehicle createTransportVehicle() {
        return new Car();
    }

    @Override
    public IAircraft createTransportAircraft() {
        return new Airplane();
    }

    @Override
    public IBoat createTransportBoat() {
        return new Boat();
    }


}
