package com.nf2.Formatters_dome.observer.Impl;


import com.nf2.Formatters_dome.observer.dao.Subject;

import java.util.ArrayList;
import java.util.List;
import java.util.Observer;


public class TeacherSubject implements Subject {

    private List<StudentObserver> observers = new ArrayList<StudentObserver>();
    private String info;

    @Override
    public void addObserver(StudentObserver obj) {
        observers.add(obj);
    }

    @Override
    public void deleteObserver(StudentObserver obj) {
        int i = observers.indexOf(obj);
        if(i >= 0){
            observers.remove(obj);
        }
    }

    @Override
    public void notifyObserver() {
        for (StudentObserver studentObserver : observers) {
             studentObserver.update();
        }
    }



    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}

