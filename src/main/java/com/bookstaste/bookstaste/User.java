package com.bookstaste.bookstaste;

import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class User implements Serializable {
    private String f_name;
    private String s_name;
    private String username;
    private String date_of_birth;
    private String email;
    private String password;

    public User() {
        super();
    }

    public User(String f_name, String s_name, String username, String date_of_birth, String email, String password) {
        super();
        this.f_name = f_name;
        this.s_name = s_name;
        this.username = username;
        this.date_of_birth = date_of_birth;
        this.email = email;
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "f_name='" + f_name + '\'' +
                ", s_name='" + s_name + '\'' +
                ", username='" + username + '\'' +
                ", date_of_birth=" + date_of_birth +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public String getF_name() {
        return f_name;
    }

    public void setF_name(String f_name) {
        this.f_name = f_name;
    }

    public String getS_name() {
        return s_name;
    }

    public void setS_name(String s_name) {
        this.s_name = s_name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getDate_of_birth() {
        return date_of_birth;
    }

    public void setDate_of_birth(String date_of_birth) {
//        DateFormat df = new SimpleDateFormat("MM-dd-yyyy");
        this.date_of_birth = date_of_birth;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
