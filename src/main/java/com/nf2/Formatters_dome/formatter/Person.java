package com.nf2.Formatters_dome.formatter;

import java.util.Date;

public class Person {
    private String name;
    private String province;
    private String birthday;
    private String gender;

    public Person() {
    }

    public Person(String province, String birthday, String gender) {
        this.province = province;
        this.birthday = birthday;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
