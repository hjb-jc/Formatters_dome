package com.nf2.Formatters_dome.factory.factory2;

public class TestPhone {
    public static void main(String[] args) {
        /*Iphone iphone = new Iphone();
        HuaWei huaWei = new HuaWei();
        iphone.iphone();
        huaWei.huawei();*/
        //缺点：代码逻辑不清晰，暴露的内容过多，所以添加了接口

       /* Phone iphone = new Iphone();
        iphone.play();
        Phone huaWei = new HuaWei();
        huaWei.play();*/
        //缺点：客户端要知道手机具体类，客户端的调用和提供代码是耦合，所有添加了工厂模式

        PhoneFactory pf = new PhoneFactory();
        pf.createPhone("iphone").play();
        pf.createPhone("huawei").play();
        //虽然已经有了很好的解耦合性了，但是很是存在缺点：
        // 1、PhoneFactory工厂类 和 接口Phone 存在耦合
        //2、每次添加或删除，修改，都需要修改PhoneFactory工厂类

        new XiaoMiFactory().createPhone().play();
		//工厂方法模式缺点：1、代码容易膨胀 。 2、不容易反应产品与产品之间的关系
    }
}
