package br.com.fascari.gof.adapter;

import br.com.fascari.gof.adapter.adapters.MercadoPagoAdapter;
import br.com.fascari.gof.adapter.adapters.PayoneerAdapter;
import br.com.fascari.gof.adapter.payoneer.IPayonnerPayments;
import br.com.fascari.gof.adapter.payoneer.Payoneer;
import br.com.fascari.gof.adapter.paypal.IMercadoPagoPayments;
import br.com.fascari.gof.adapter.paypal.IPayPalPayments;

public class TesteAdapter {

    public static void main(String[] args) {
        IPayonnerPayments payonnerPayments = new Payoneer();
        payonnerPayments.sendPayment();
        payonnerPayments.receivePayment();

        System.out.println("");

        IPayPalPayments payment = new PayoneerAdapter(new Payoneer());
        payment.paypalPayment();
        payment.paypalReceive();

        System.out.println("");

        IMercadoPagoPayments mercadoPagoPayments = new MercadoPagoAdapter(new Payoneer());
        mercadoPagoPayments.mercadoPagoPayment();
        mercadoPagoPayments.mercadoPagoReceive();
    }
}
