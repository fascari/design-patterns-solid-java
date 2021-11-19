package br.com.fascari.gof.abstractfactory.factories;

import br.com.fascari.gof.abstractfactory.aircrafts.IAircraft;
import br.com.fascari.gof.abstractfactory.boats.IBoat;
import br.com.fascari.gof.abstractfactory.landvehicles.ILandVehicle;

public interface ITransportFactory {
    ILandVehicle createTransportVehicle();

    IAircraft createTransportAircraft();

    IBoat createTransportBoat();
}
