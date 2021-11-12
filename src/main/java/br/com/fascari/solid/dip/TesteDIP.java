package br.com.fascari.solid.dip;

import br.com.fascari.solid.dip.payment.Payment;

public class TesteDIP {
    public static void main(String[] args) {
        Payment payment = new Payment();
        payment.pay("250");
    }
}
