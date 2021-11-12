package br.com.fascari.solid.lsp;

public interface IPaymentInstrument {

    void validate() throws Exception;
    void collectPayment();

}
