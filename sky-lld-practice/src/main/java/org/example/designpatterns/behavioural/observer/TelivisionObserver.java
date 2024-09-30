package org.example.designpatterns.behavioural.observer;

import org.example.designpatterns.behavioural.observer.observable.Observable;

public class TelivisionObserver implements Observer{

    private Observable observable;
    private int tvId;

    public TelivisionObserver(int tvId, Observable observable) {
        this.tvId = tvId;
        this.observable = observable;
    }

    @Override
    public void update() {
        System.out.println("TV ID : "+tvId);
    }
}
