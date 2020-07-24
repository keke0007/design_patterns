package com.designpattern.principle._7_compositereuse;

/**
 * @author jk
 * @version 1.0.0
 * @create 2020/7/24 11:34
 */
public class ProductDao {

    private DBConnection dbConnection;

    public void setDbConnection(DBConnection dbConnection) {
        this.dbConnection = dbConnection;
    }

    public void addProduct() {
        String conn = dbConnection.getConnection();
        System.out.println("使用" + conn + "增加产品");
    }
}
