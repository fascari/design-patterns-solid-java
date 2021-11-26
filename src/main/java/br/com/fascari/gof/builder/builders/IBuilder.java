package br.com.fascari.gof.builder.builders;

import br.com.fascari.gof.builder.components.CarType;
import br.com.fascari.gof.builder.components.Engine;
import br.com.fascari.gof.builder.components.Transmission;

public interface IBuilder {

    void setCarType(CarType type);

    void setSeats(int seats);

    void setTransmission(Transmission transmission);

    void setEngine(Engine engine);
}
