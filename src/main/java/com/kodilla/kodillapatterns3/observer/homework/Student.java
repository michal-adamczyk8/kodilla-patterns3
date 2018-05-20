package com.kodilla.kodillapatterns3.observer.homework;

import java.util.ArrayDeque;

public class Student implements Observable {
    private String studentName;
    private ArrayDeque<String> tasks;
    private Observer observer;

    public Student(String studentName) {
        this.studentName = studentName;
        tasks = new ArrayDeque();
    }

    public void addTask(String task) {
        tasks.add(task);
        notifyObserver();
    }

    @Override
    public void registerObserver(Observer observer) {
        this.observer = observer;
    }

    @Override
    public void notifyObserver() {
        observer.update(this);
    }

    public String getStudentName() {
        return studentName;
    }

    public ArrayDeque<String> getTasks() {
        return tasks;
    }

    public Observer getObserver() {
        return observer;
    }
}
