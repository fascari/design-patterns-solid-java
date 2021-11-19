package br.com.fascari.gof.factory;

import static br.com.fascari.gof.factory.TransportTypeFactory.getTransportType;

public class TesteFactoryMethod {

    public static void main(String[] args) {
        if (args == null || args.length == 0) {
            System.out.println("Informe o tipo de transporte para continuar...");
            return;
        }
        runTransport(getTransportType(args[0]));
    }

    private static void runTransport(Transport transportType) {
        if (transportType == null) {
            return;
        }
        transportType.startTransport();
    }
}
