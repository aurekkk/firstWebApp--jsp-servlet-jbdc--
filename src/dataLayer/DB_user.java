package dataLayer;

import java.sql.*;

public class DB_user {

    // JBDC driver name and database URL
    static final String JBDC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost:3306/webapptutorial";

    // Database credentials
    static final String USER="root";
    static final String PASS="cisco";

    public boolean isValidUserLogin(String username, String userpassword){
        boolean isValidUser = false;

        Connection conn = null;
        Statement stat = null;
        String sql="";

        try{
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Connection to database...");
            conn= DriverManager.getConnection(DB_URL, USER, PASS);

            System.out.println("Creating statement...");
            stat = conn.createStatement();

            sql="SELECT * FROM users WHERE username = \"" +
                    username + "\" AND userpassword = \"" + userpassword + "\"";
            System.out.println(sql);

            ResultSet rs = stat.executeQuery(sql);
            if (rs.next()){
                isValidUser = true;
            }
            rs.close();
            stat.close();
            conn.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }   finally {
            try {
                if(stat!=null)
                    stat.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try{
                if(conn!=null)
                    conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Closing DB Connection - Goodbye!");

        return isValidUser;
    }

}
