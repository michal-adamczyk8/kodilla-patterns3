package com.kodilla.kodillapatterns3.observer.homework;

public interface Observable {
    void notifyObserver();
    void registerObserver(Observer observer);
}
