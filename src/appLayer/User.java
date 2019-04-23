package appLayer;

import dataLayer.DB_user;

public class User {

    public boolean isValidUserCredentials(String username, String password){
        DB_user DB_user_object = new DB_user();

        return DB_user_object.isValidUserLogin(username, password);
    }

}
