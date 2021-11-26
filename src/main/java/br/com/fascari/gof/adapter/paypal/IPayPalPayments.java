package br.com.fascari.gof.adapter.paypal;

import br.com.fascari.gof.adapter.utils.Token;

public interface IPayPalPayments {
    Token authToken();

    void paypalPayment();

    void paypalReceive();
}
