package org.example.designpatterns.behavioural.observer.observable;

import org.example.designpatterns.behavioural.observer.Observer;

public interface Observable {

    void add(Observer observer);
    void remove(Observer observer);
    void notifyObserver();
    void setData(int data);
    int getData();
}
