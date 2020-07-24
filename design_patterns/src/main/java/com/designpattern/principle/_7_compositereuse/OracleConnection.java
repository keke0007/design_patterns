package com.designpattern.principle._7_compositereuse;

/**
 * @author jk
 * @version 1.0.0
 * @create 2020/7/24 11:38
 */
public class OracleConnection extends DBConnection {
    @Override
    public String getConnection() {
        return "Oracle 数据库连接";
    }
}
