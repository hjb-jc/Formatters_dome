package com.nf2.Formatters_dome.factory;

public class BoyRoom extends Room{
    public BoyRoom(String sex){
        if("男".equals(sex) ){
            boyRoomsay = "欢迎来男科";
            grilRoomSay = "呵呵呵  你不能来女科的";
        }else{
            boyRoomsay = "请问你是男的还是女的？";
            grilRoomSay = "请问你是男的还是女的？";
        }
    }
}
