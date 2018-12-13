package com.nf2.Formatters_dome.observer.dao;

import com.nf2.Formatters_dome.observer.Impl.StudentObserver;

import java.util.Observer;

public interface Subject {
    //添加观察者
    public void addObserver(StudentObserver obj);
    //移除观察者
    public void deleteObserver(StudentObserver obj);
    //当主体发生改变，会调用这个方法，通知所有观察者
    public void notifyObserver();
}
