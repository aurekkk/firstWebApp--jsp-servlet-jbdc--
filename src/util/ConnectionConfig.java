package util;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionConfig {

    public static Connection getConnection(){
        Connection connection=null;

        try{
            Class.forName("com.mysql.jdbc.Driver");
            connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "cisco");
        }catch (Exception e){
            e.printStackTrace();
        }finally {

        }
        return connection;
    }

    public static void main(String[] args) {
        Connection connection = null;
        try {

            connection=ConnectionConfig.getConnection();
            if (connection!=null){
                System.out.println("Connection established");
            }

        }catch (Exception e){
            e.printStackTrace();
        }finally {

        }
    }

}
