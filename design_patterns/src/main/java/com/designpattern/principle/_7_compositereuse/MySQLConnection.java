package com.designpattern.principle._7_compositereuse;

/**
 * @author jk
 * @version 1.0.0
 * @create 2020/7/24 11:37
 */
public class MySQLConnection extends DBConnection {
    @Override
    public String getConnection() {
        return "MySQL 数据库连接";
    }
}
