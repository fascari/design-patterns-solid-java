package br.com.fascari.gof.factory;

public abstract class TransportTypeFactory {
    public static Transport getTransportType(String type) {
        switch (type) {
            case "uber":
                return new CarTransport();
            case "log":
                return new MotorcycleTransport();
            case "eats":
                return new BikeTransport();
            default:
                System.out.println("Selecione o tipo de entrega");
        }
        return null;
    }
}
