package br.com.fascari.gof.adapter.adapters;

import br.com.fascari.gof.adapter.payoneer.Payoneer;
import br.com.fascari.gof.adapter.paypal.IMercadoPagoPayments;
import br.com.fascari.gof.adapter.utils.Token;

public class MercadoPagoAdapter implements IMercadoPagoPayments {
    private Token token;
    private Payoneer payoneer;

    public MercadoPagoAdapter(Payoneer payoneer) {
        this.payoneer = payoneer;
        System.out.println("Adaptando o Payoneer utilizando os métodos padrões do Mercado Pago");
    }

    @Override
    public Token authToken() {
        return new Token();
    }

    @Override
    public void mercadoPagoPayment() {
        this.payoneer.sendPayment();
    }

    @Override
    public void mercadoPagoReceive() {
        this.payoneer.receivePayment();
    }
}
