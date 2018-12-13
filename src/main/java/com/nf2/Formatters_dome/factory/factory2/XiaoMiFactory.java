package com.nf2.Formatters_dome.factory.factory2;

public class XiaoMiFactory implements PhoneFactorys {

    @Override
    public Phone createPhone() {
        return new XiaoMi();
    }
}
