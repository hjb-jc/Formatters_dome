package com.nf2.Formatters_dome.factory;

public class RoomFactory {
    public RoomFactory(){

    }
    public Room getRoom(String sex){
        if("男".equals(sex)){
            return new BoyRoom(sex);
        }else {
            return new GrilRoom(sex);
        }
    }
}
