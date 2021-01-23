package com.bookstore.enity;

public class Admin {

    private String admin;
    private String password;
    private String name;
    private String portrait;       //头像地址

    public String getAdmin() {
        return admin;
    }

    public void setAdmin(String admin) {
        this.admin = admin;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPortrait() {
        return portrait;
    }

    public void setPortrait(String portrait) {
        this.portrait = portrait;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "admin='" + admin + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", portrait='" + portrait + '\'' +
                '}';
    }
}
