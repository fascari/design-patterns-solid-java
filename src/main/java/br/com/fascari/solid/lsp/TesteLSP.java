package br.com.fascari.solid.lsp;

public class TesteLSP {

    public static void main(String[] args) throws Exception {
        //CreditCard card = new CreditCard();
        //DebitCard card = new DebitCard();
        NubankRewards card = new NubankRewards();

        /*
        * Neste ponto identifica-se que os métodos são executados sem problemas, independentemente do tipo da classe acionada,
        * atendendo portanto, o princípio da substituição de Liskov.
        * */
        card.validate();
        card.collectPayment();
    }
}
