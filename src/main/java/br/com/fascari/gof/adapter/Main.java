package br.com.fascari.gof.adapter;

import br.com.fascari.gof.adapter.adapters.PayoneerAdapter;
import br.com.fascari.gof.adapter.payoneer.Payoneer;
import br.com.fascari.gof.adapter.paypal.IPayPalPayments;

public class Main {

    public static void main(String[] args) {

        //IPayonnerPayments payment = new Payoneer();



        IPayPalPayments payment = new PayoneerAdapter(new Payoneer());

        payment.paypalPayment();
        payment.paypalReceive();


    }
}
