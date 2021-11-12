package br.com.fascari.solid.dip.payment;

import br.com.fascari.solid.dip.factory.DbProductFactory;
import br.com.fascari.solid.dip.model.Db;
import br.com.fascari.solid.dip.model.IDbProduct;

public class Payment {
    public void pay(String productID){

        IDbProduct dbProduct = DbProductFactory.create(Db.MONGODB);
        String product = dbProduct.getProductById(productID);
        System.out.println(product);
    }
}
