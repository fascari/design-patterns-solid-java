package br.com.fascari.solid.dip.payment;

import br.com.fascari.solid.dip.factory.DbProductFactory;
import br.com.fascari.solid.dip.model.Db;
import br.com.fascari.solid.dip.model.IDbProduct;

public class Payment {
    public void pay(String productID) {
        /*
        * Neste cenário utiliza-se o padrão factory method para abstrair o tipo do banco a ser utilizado
        * e permitir o desacoplamento de baixo nível dos bancos de dados, utilizado uma interface
        * como abstração.
        * */
        //IDbProduct dbProduct = DbProductFactory.create(Db.MYSQL);
        IDbProduct dbProduct = DbProductFactory.create(Db.MONGODB);
        String product = dbProduct.getProductById(productID);
        System.out.println(product);
    }
}
