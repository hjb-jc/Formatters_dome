package com.nf2.Formatters_dome.entity;

import org.springframework.dao.support.DaoSupport;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.NumberFormat;

import java.util.Date;

public class User {
    @DateTimeFormat(pattern = "dd-MM-yyyy")  //注解加载实体变量类上
    private Date birthday;
    @NumberFormat(style = NumberFormat.Style.NUMBER,pattern = "#,####")
    private int total;
    @NumberFormat(style = NumberFormat.Style.PERCENT)
    private  double discount;
    @NumberFormat(style = NumberFormat.Style.CURRENCY)
    private double money ;

    public User(){}

    public User(Date birthday, int total, double discount, double money) {
        this.birthday = birthday;
        this.total = total;
        this.discount = discount;
        this.money = money;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }
}
