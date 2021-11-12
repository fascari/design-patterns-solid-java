package br.com.fascari.solid.dip.factory;

import br.com.fascari.solid.dip.model.Db;
import br.com.fascari.solid.dip.model.IDbProduct;
import br.com.fascari.solid.dip.model.MongoDBProduct;
import br.com.fascari.solid.dip.model.MySQLProduct;

public class DbProductFactory {
    public static IDbProduct create(Db type) {
        if (Db.MYSQL.equals(type)) {
            return new MySQLProduct();
        }
        return new MongoDBProduct();
    }
}
