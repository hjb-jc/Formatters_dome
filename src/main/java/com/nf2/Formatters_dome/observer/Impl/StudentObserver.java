package com.nf2.Formatters_dome.observer.Impl;

import com.nf2.Formatters_dome.observer.dao.Observer;

public class StudentObserver implements Observer {

    TeacherSubject teacher;
    private String name;

    public StudentObserver(String name, TeacherSubject teacher){
        this.name=name;
        this.teacher=teacher;
    }
    @Override
    public void update() {
        System.out.println(name+"得到作业:"+teacher.getInfo());
    }
}
