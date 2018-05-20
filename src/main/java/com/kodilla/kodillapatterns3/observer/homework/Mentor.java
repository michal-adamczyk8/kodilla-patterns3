package com.kodilla.kodillapatterns3.observer.homework;

public class Mentor implements Observer {
    private String mentorName;
    private int updateCount;

    public Mentor(String mentorName) {
        this.mentorName = mentorName;
    }

    @Override
    public void update(Student student) {
        System.out.println("User " + student.getStudentName() + "has just completed a task. Right now there are " +
                student.getTasks().size() + " waiting for you to check.");
        updateCount++;
    }

    public String getMentorName() {
        return mentorName;
    }

    public int getUpdateCount() {
        return updateCount;
    }
}
