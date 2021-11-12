package br.com.fascari.solid.dip.model;

public class MySQLProduct implements IDbProduct {
    public String getProductById(String productID) {
        return "Mysql:Exibindo dados do Produto " + productID;
    }
}
