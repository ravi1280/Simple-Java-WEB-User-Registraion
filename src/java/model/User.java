package model;

import java.io.Serializable;

public class User implements Serializable {

    public User() {
    }

    public User(String mobile, String name, String password, String gender, String country) {
        this.mobile = mobile;
        this.name = name;
        this.password = password;
        this.gender = gender;
        this.country = country;
    }

    private String mobile;
    private String name;
    private String password;
    private String gender;
    private String country;

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

}
