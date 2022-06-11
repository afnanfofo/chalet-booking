package com.example.chaletbooking.pojo;

public class Model {

    int String;
    private String UserName;
    private String password;
    private int MobileNumber;

    public Model(java.lang.String userName, java.lang.String password, int mobileNumber) {
        UserName = userName;
        this.password = password;
        MobileNumber = mobileNumber;
    }

    public int getString() {
        return String;
    }

    public void setString(int string) {
        String = string;
    }

    public java.lang.String getUserName() {
        return UserName;
    }

    public void setUserName(java.lang.String userName) {
        UserName = userName;
    }

    public java.lang.String getPassword() {
        return password;
    }

    public void setPassword(java.lang.String password) {
        this.password = password;
    }

    public int getMobileNumber() {
        return MobileNumber;
    }

    public void setMobileNumber(int mobileNumber) {
        MobileNumber = mobileNumber;
    }

}
