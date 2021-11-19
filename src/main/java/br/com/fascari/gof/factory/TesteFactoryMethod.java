package br.com.fascari.gof.factory;

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

    private static Transport getTransportType(String type) {
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
