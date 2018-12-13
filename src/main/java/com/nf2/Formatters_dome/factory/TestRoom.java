package com.nf2.Formatters_dome.factory;

import java.lang.String;
import java.util.Scanner;

public class TestRoom {
    public static void main(String[] args) {
        System.out.println("请问你的性别是：？");
        Scanner c = new Scanner(System.in);
        String str = c.nextLine();
        RoomFactory fac = new RoomFactory();
        Room room = fac.getRoom(str);
        System.out.println("女科室："+room.getGrilRoom());
        System.out.println("男科室："+room.getBoyRoom());
    }
}
