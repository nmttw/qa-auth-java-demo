package com.matheus.qa;

import java.util.HashMap;
import java.util.Map;

public class AuthService {

    private Map<String, User> database = new HashMap<>();
    private int loginAttempts = 0;

    public boolean register(String email, String password) {
        if (email == null || password == null || password.length() < 4) {
            return false;
        }

        database.put(email, new User(email, password));
        return true;
    }

    public boolean login(String email, String password) {
        loginAttempts++;

        User user = database.get(email);

        if (user == null) {
            return false;
        }

        return user.getPassword().equals(password);
    }

    public int getLoginAttempts() {
        return loginAttempts;
    }
}
