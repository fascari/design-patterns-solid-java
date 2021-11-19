package br.com.fascari.gof.adapter.paypal;

import br.com.fascari.gof.adapter.utils.Token;

public class PayPal implements IPayPalPayments {
    private Token token;

    @Override
    public Token authToken() {
        return new Token();
    }

    @Override
    public void paypalPayment() {
        this.token = authToken();
        System.out.println("Enviando pagamentos via PayPal");
    }

    @Override
    public void paypalReceive() {
        System.out.println("Recebendo pagamentos via PayPal");

    }
}
