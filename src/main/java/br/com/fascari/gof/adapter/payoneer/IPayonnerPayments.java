package br.com.fascari.gof.adapter.payoneer;

import br.com.fascari.gof.adapter.utils.Token;

public interface IPayonnerPayments {

    Token authToken();
    void sendPayment();
    void receivePayment();

}
