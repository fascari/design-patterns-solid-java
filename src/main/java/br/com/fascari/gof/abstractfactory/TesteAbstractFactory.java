package br.com.fascari.gof.abstractfactory;

import br.com.fascari.gof.abstractfactory.app.Application;
import br.com.fascari.gof.abstractfactory.factories.BoatTransport;
import br.com.fascari.gof.abstractfactory.factories.NineNineTransport;
import br.com.fascari.gof.abstractfactory.factories.UberTransport;

public class TesteAbstractFactory {

    private static Application configureApplication() {
        String company = getCompany();
        if ("uber".equals(company)) {
            return new Application(new UberTransport());
        }
        if ("99".equals(company)) {
            return new Application(new NineNineTransport());
        }
        return new Application(new BoatTransport());
    }

    private static String getCompany() {
        return "boat";
    }

    public static void main(String[] args) {
        Application app = configureApplication();
        app.startRoute();
    }
}
