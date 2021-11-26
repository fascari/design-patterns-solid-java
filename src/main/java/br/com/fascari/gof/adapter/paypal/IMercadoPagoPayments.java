package br.com.fascari.gof.adapter.paypal;

import br.com.fascari.gof.adapter.utils.Token;

public interface IMercadoPagoPayments {
    Token authToken();

    void mercadoPagoPayment();

    void mercadoPagoReceive();
}
