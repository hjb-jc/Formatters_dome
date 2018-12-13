package com.nf2.Formatters_dome.observer.test;

import com.nf2.Formatters_dome.observer.Impl.StudentObserver;
import com.nf2.Formatters_dome.observer.Impl.TeacherSubject;

public class TestObserver {
    public static void main(String[] args) {
        TeacherSubject teacher=new TeacherSubject();
        StudentObserver jack=new StudentObserver("jack",teacher);
        StudentObserver mark=new StudentObserver("mark",teacher);
        teacher.setInfo("测试题1");
        teacher.addObserver(mark);
        teacher.notifyObserver();

        teacher.setInfo("测试题2");
        teacher.deleteObserver(mark);
        teacher.addObserver(jack);
        teacher.notifyObserver();


    }
}
