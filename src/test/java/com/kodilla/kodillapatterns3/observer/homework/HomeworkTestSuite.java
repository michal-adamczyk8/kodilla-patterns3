package com.kodilla.kodillapatterns3.observer.homework;

import org.junit.Assert;
import org.junit.Test;

public class HomeworkTestSuite {
    @Test
    public void testUpdate() {
        //Given
        Student student1 = new Student("Christopher Moltisanti");
        Student student2 = new Student("Paulie Gaultieri");
        Student student3 = new Student("Bobby Bacalieri");
        Student student4 = new Student("Ralph Ciffaretto");
        Student student5 = new Student("Richie April");
        Mentor mentor1 = new Mentor("Anthony Soprano");
        Mentor mentor2 = new Mentor("Corrado Soprano");
        student1.registerObserver(mentor1);
        student2.registerObserver(mentor1);
        student3.registerObserver(mentor2);
        student4.registerObserver(mentor2);
        student5.registerObserver(mentor2);
        //When
        student1.addTask("Zadanie 1");
        student1.addTask("Zadanie 2");
        student2.addTask("zadanie 2");
        student2.addTask("zadanie 4");
        student3.addTask("cosasfdasd");
        student4.addTask("asdasd");
        student4.addTask("aaaa");
        student4.addTask("dddsaas");
        student4.addTask("dasdasdasdas");
        student5.addTask("sd");
        //Then
        Assert.assertEquals(4,mentor1.getUpdateCount());
        Assert.assertEquals(6, mentor2.getUpdateCount());

    }
}
