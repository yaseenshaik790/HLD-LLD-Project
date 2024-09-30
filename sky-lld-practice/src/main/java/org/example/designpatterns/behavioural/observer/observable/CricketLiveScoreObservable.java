package org.example.designpatterns.behavioural.observer.observable;

import org.example.designpatterns.behavioural.observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class CricketLiveScoreObservable implements Observable{

    List<Observer>  list = new ArrayList<>();
    int initialData = 0;

    @Override
    public void add(Observer observer) {
        list.add(observer);
    }

    @Override
    public void remove(Observer observer) {
        list.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for (Observer observer: list){
            observer.update();
        }
    }

    @Override
    public void setData(int data) {
        if (initialData < data){
            notifyObserver();
        }
        initialData += data;
    }

    @Override
    public int getData(){
        return initialData;
    }
}
