package com.nf2.Formatters_dome.factory.factory2;

public class PhoneFactory {
    public Phone createPhone(String name){
        if("iphone".equals(name)){
           return new Iphone();
        }else if ("huawei".equals(name)){
            return new HuaWei();
        }
        return null;
    }
}
