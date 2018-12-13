package com.nf2.Formatters_dome.factory.factory2;

public class Iphone implements Phone {

    public void iphone(){
        System.out.println("苹果手机");
    }

    @Override
    public void play() {
        System.out.println("这是苹果手机品牌");
    }
}
