package com.example.healthapp;

public class UserModel {
    private String username, Number, Email;

    public UserModel() {
    }

    public UserModel(String username, String number, String email) {
        this.username = username;
        this.Number = number;
        this.Email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getNumber() {
        return Number;
    }

    public void setNumber(String number) {
        Number = number;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }
}