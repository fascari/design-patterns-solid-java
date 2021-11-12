package br.com.fascari.solid.dip.model;

public class MongoDBProduct implements IDbProduct {
    public String getProductById(String productID) {
        return "MongoDB:Exibindo dados do Produto " + productID;
    }
}
