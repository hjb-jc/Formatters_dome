package com.nf2.Formatters_dome.factory;

public class GrilRoom extends Room {
    public GrilRoom(String sex){
        if("女".equals(sex) ){
            grilRoomSay = "欢迎来妇科";
            boyRoomsay = "呵呵呵  你不能来男科的";
        }else{
            boyRoomsay = "请问你是男的还是女的？";
            grilRoomSay = "请问你是男的还是女的？";
        }
    }
}
