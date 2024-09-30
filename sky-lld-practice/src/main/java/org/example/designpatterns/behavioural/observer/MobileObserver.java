package org.example.designpatterns.behavioural.observer;

import org.example.designpatterns.behavioural.observer.observable.Observable;

public class MobileObserver implements Observer{

    private Observable observable;
    private int mobileId;

    public MobileObserver(int mobileId, Observable observable){
        this.mobileId = mobileId;
        this.observable = observable;
    }

    @Override
    public void update() {
        System.out.print("Mobile ID : "+mobileId);
    }
}
